package javaPrac;

public class evenOddCount {
    public static void main(String[] args) {
        int b[] = {1,3,4,6,7,8,9};
        int evenSum = 0;
        int oddSum =0;
        for(int i=0;i<b.length;i++){
            if(b[i] %2==0)
                evenSum = evenSum+b[i];
            else if(b[i]%2==1)
                oddSum = oddSum+b[i];
        }
        System.out.println("The even sum is:" +evenSum);
        System.out.println("The odd sum is: "+oddSum);
    }
}
