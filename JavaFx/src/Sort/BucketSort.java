package Sort;

import java.util.Vector; 
import java.util.Collections; 
  
public class BucketSort { 
  
    public static void sort(float arr[], int n) 
    { 
        if (n <= 0) 
            return; 
  
// 1) Tao cac bucket 
        Vector<Float> buckets[] = new Vector[n]; 
  
        for (int i = 0; i < n; i++) { 
            buckets[i] = new Vector<Float>(); 
        } 
  
// 2) Dua cac phan tu vao bucket tuong ung 
        for (int i = 0; i < n; i++) { 
            float ib = arr[i] * n; 
            buckets[(int)ib].add(arr[i]); 
        } 
  
// 3) Sap xep cac phan tu trong moi bucket 
        for (int i = 0; i < n; i++) { 
            Collections.sort(buckets[i]); 
        } 
  
// 4) Lay cac phan tu trong bucket bo vao arr[]
        int index = 0; 
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < buckets[i].size(); j++) { 
                arr[index++] = buckets[i].get(j); 
            } 
        } 
    } 
} 