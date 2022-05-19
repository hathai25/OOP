package Sort;

public class MergeSort {
    public static void merge(int arr[], int l, int m, int r) {

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

    public static void sort(int arr[], int l, int r) {
        if (l < r) {

            // tim diem chinh giua
            int m = (l + r) / 2;

            // Ham de quy chia doi
            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

}