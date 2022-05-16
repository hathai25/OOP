package application;

import java.util.Scanner;

public class MergeSort {

    // Merge hai mang con cua arr[].
    // Mang con thu nhat la arr[l..m]
    // Mang con thu hai la arr[m+1..r]
    void merge(int arr[], int l, int m, int r) {

        // tim kich thuoc cua 2 mang
        int n1 = m - l + 1;
        int n2 = r - m;

        // tao mang tam
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy du lieu vao mang tam
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge cac mang tam

        // Chi muc ban dau cua 2 mang con
        int i = 0, j = 0;

        // Chi muc ban dau cua mang phu duoc hop nhat
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // sao chep cac phan tu con lai cua L[] neu co
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // sao chep cac phan tu con lai cua R[] neu co
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(int arr[], int l, int r) {
        if (l < r) {

            // tim diem chinh giua
            int m = (l + r) / 2;

            // Ham de quy chia doi
            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    // In cac phan tu cua mang
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        int n;
        System.out.println("Nhap so phan tu cua mang:");
        n = ip.nextInt();
        int []arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for(int i=0; i<n;i++) arr[i]=ip.nextInt();
        System.out.println("Mang ban dau:");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("Mang sau khi sap xep:");
        printArray(arr);
        ip.close();
    }
}