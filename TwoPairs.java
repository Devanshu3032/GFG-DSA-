public class TwoPairs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 7;
        boolean found = false;
        for (int i = 0; i < arr.length && !found; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i + " " + j);
                  
                    found = true;
                   
                }
            }
        }
        if (!found) System.out.println("Pair not found");
    }
}
