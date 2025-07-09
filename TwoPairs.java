import java.util.Arrays;
import java.util.*;
public class TwoPairs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5} ;
        int[] arr1 = {} ;
        int target = 7 ; 
         int i = 0 , j = arr.length + 1  ; 
         while (i < j ) {

                if((arr[i]  + arr[j] ) ==  target){
                    arr[i] = arr1[0] ;
                    arr[j] = arr1[1] ;
                }
                else{
                    System.out.println("Element not matched");
                }
         }
         
         for (int j2 = 0; j2 < arr1.length; j2++) {
            System.out.println(arr1[j2]);
         }
    }

}
