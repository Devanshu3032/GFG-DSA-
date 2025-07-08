import java.util.Arrays;

class LessThanTarget{
    public static void main(String[] args) {
        int arr[] = {2,5,3,7} ;
        int target = 8 ;
        Arrays.sort(arr) ;
        int i =  0 , j = arr.length -1 , count = 0 ;
        while (i < j ) {
            if(arr[i] + arr[j] >= target){
                j-- ;
            }
            else{
                count += j-i ; 
                i++ ;
            }
            
        }
        
    }
}