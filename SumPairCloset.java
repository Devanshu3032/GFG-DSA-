import java.util.Arrays;
public class SumPairCloset {
    public static void main(String[] args) {
        int arr[] = {2,4,7,5,1};
        int target = 10 ;
        int[] arr1= new int[2] ;

        Arrays.sort(arr) ; 
        int i = 0 , j = arr.length -1  ;
        while (i < j) {
            if(arr[i] + arr[j] < target) {
                arr1[0] = arr[i] ; 
                arr1[1] = arr[j] ;
            }

            else{
                i++ ;
                j-- ;
            }
        }

        for (int j2 = 0; j2 < arr1.length; j2++) {
            System.out.println(arr[j2]);
        }
    }
}
