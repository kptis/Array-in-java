package com.BTArray;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void findMaxEle(int[] arr) {
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("at the index of " + index);
    }

    public static void print1D(int[] arr) {
        System.out.println("Array: ");
        for (int ele : arr) {
            System.out.print(ele + "  ");
        }
        System.out.println("\n");
    }

    public static boolean isPrime(int n){
        if (n < 2) return false;
        else if(n==2) return true;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }

    public static void IncreBubbleSort(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
//                  swap(arr[j], arr[j + 1]);
                    int tmp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= tmp;
                }
            }
        }
    }

    public static void print2D(int arr[][], int row, int col) {
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.print("\n");
        }
    }

    public static void sortColumn(int arr[][]) {
        for (int j = 0; j < arr[0].length; j++) {
            int b[] = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                b[i] = arr[i][j];
            }
            IncreBubbleSort(b);
        }
    }

    public static void rand2D(int arr[][],int row, int col) {
        Random rand = new Random();
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = rand.nextInt(20);
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(20);
        }
        print1D(arr);
        findMaxEle(arr);
        System.out.println("Prime elements of the array: ");
        for (int ele : arr) {
            if (isPrime(ele))
                System.out.print(ele + "  ");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap so hang: ");
        int row = sc.nextInt();
        System.out.println("Nhap so cot: ");
        int col = sc.nextInt();
        int a[][] = new int[row][col];
        rand2D(a, row, col);
        System.out.println("Mang 2 chieu random: ");
        print2D(a, row, col);
        sortColumn(a);
        System.out.println("Mang co cac cot tang dan: ");
        print2D(a, row, col);
    }
}
