
package binarysearch;

public class BinarySearch {
  //Method
     public static int Search (int[] arr, int values) {
        int left = 0;
        int right = arr.length -1;
        
        
        while (left <= right){
            int mid = (left = right) /2;                  
        if (arr[mid] == values) {
         return mid;
        }else if (arr [mid] < values){
            left = mid + 1;
    }else{
            right = mid -1 ;
        }
}
         
             
         return -1;
         
     }
       
    
    
    public static void main(String[] args) {
      
        int arr[] = {1,2,3,4,5};
        int result = Search (arr,3);
        
        System.out.println(result);
        }
        
    }
    
