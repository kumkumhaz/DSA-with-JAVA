//TC = O(n)
//SC = O(1)

package DSAProblems;

public class checkifArrayIsSortedAndRotated {
public static boolean check(int[] arr){
    int count = 0;
    int n = arr.length;

    for(int i =1; i <n; i++){
        if(arr[i-1] > arr[i]){
            count++;
        }
    }
    if(arr[n-1] > arr[0]){
        count++;
    }

    if(count <= 1){
        return true;
    }

    return false;
}
public static void main(String[] args) {
    int[] arr = {3,3,3,8,5};
    boolean isChecked = check(arr);
    System.out.println(isChecked);
}

   
}
