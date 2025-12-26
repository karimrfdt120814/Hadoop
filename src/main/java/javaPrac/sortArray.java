package javaPrac;

public class sortArray {
    public static void main(String[] args) {
        int a[] = {1,4,2,5,6,3,9,25,14};


        for(int i=0;i<a.length-1;i++){
            if(a[i] > a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1]=temp;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
