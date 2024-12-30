package DevideAndConquer;

public class mergeSort {
    // Print the elements of the array
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergesort(int arr[], int l, int r){
        if(l < r){
            int m = (l + r) / 2;
            mergesort(arr, l, m); 
            mergesort(arr, m + 1, r); 
            merge(arr, l, m, r);  
        }
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei - si + 1];
        int i = si;  
        int j = mid + 1;  
        int k = 0; 

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of the left subarray, if any
        while(i <= mid){
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Copy remaining elements of the right subarray, if any
        while(j <= ei){
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy the merged array from temp back to the original array
        for(int p = 0; p < temp.length; p++){
            arr[si + p] = temp[p];
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        int n = arr.length;
        mergesort(arr, 0, n - 1);
        printArray(arr);
    }
}
