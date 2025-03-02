package SortingTechniques;

import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {
        int[] arr = {23,0,5,4,3,2,1,67,5555};
        System.out.println("Sorted Array"+ Arrays.toString(mergesort(arr)));
    }
    static int[] mergesort(int[] arr){
        if(arr.length == 1){return arr;}
        int mid = arr.length / 2;

        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right){
        int[] merged = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                merged[k] = left[i];
                i++;
            }
            else {
                merged[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length){
            merged[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length){
            merged[k] = right[j];
            j++;
            k++;
        }
        return merged;
    }
}
