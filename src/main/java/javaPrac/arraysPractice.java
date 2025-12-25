package javaPrac;

public class arraysPractice {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            System.out.println("The Value of arr["+i+"] is: " +arr[i]);

            sum = sum+arr[i];
        }
        System.out.println("The sum of all numbers in the given array is: "+sum);

        System.out.println("The average of all numbers in the given array is: "+sum/arr.length);
    }
}
