package Sorting;

public class selectionSort {
    public static void selectionSorting(int arr[]){
        for(int i = 0; i<arr.length; i++){
            int minPos = i;
            for(int j = i+1; j <arr.length; j++){
                if(arr[minPos]>arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i]=temp;
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,5,2,7,4,8};
        selectionSorting(arr);
    }
}
