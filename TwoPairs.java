public class TwoPairs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5} ;
        int[] arr1 = new int[2] ;
        int target = 7 ; 
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == target) {
                    arr1[0] = i;
                    arr1[1] = j;
                    break ;
                }

                else{
                    System.out.println("Pair not found");
                }
            }
            for (int j = 0; j < arr1.length; j++) {
                System.out.println();
            }
            
        }
        
    }

}
