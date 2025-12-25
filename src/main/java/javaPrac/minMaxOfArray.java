package javaPrac;

public class minMaxOfArray {
    public static void main(String[] args) {
        int a[] = {34,24,34,44,54};

        int max = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i] > max)
                max = a[i];
        }

        System.out.println("The maximum of an given array is: "+max);

        int min = a[0];
        for(int j=1;j<a.length;j++){
        if(a[j] < min)
            min = a[j];

    }
        System.out.println("The minimum of an given array is: "+min);
}}
