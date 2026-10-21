
package linearsearch;


public class LinearSearch {
 //Method
     public static int Search (int[] arr, int values) {
         for (int i = 0; i < arr.length; i++) {
             //condition
             if (arr[i] == values) {
                 return i;
                 
             }
         }
         return -1;
         
     }
    
    
    
    
    
    public static void main(String[] args) {
      
        int arr[] = {1,2,3,4,5};
        int result = Search (arr,6);
        
        if (result >= 0) {
        System.out.print("Found ar index" + result + "=" + arr[result]);
        }else{
            System.out.println("Element not found");
        }
        
    }
    
}
