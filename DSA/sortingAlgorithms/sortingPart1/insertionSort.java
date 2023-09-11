package sortingAlgorithms.sortingPart1;

public class insertionSort {
 public static void insert( int[] arr){
    for(int i = 1; i < arr.length; i++){
        int key = arr[i];
        int j = i-1;
        while(j >=0 && key < arr[j]){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
 }   
 public static void main(String[] args) {
    int [] arr = { 2,6,8,9,3,1,0};
    insert(arr);
    for(int num : arr){
        System.out.print(num +" ");
    }
 }
}
