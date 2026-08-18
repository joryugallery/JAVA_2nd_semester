package ai818;

public class arraytest02 {
    public static void main(String[] args) {
        int[] arr1 = {100, 200, 300, 400, 500};
        int sum = 0;

        for (int i = 0; i < arr1.length; i++) {
            if(i < arr1.length-1){
                System.out.println(arr1[i] + " + ");
            }
            else{
                System.out.println(arr1[i] + " = " + sum);
            }
        }

    }
}
