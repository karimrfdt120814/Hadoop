package javaPrac;

public class linearSearch {

    public static void main(String[] args) {
        int a[] = {20,30,40,50,60,70};
        int key = 100;
        boolean isAvailable = false;

        for(int i=0;i<a.length;i++){
            if(key==a[i]){
                System.out.println("The "+key+" found at the index "+i);
            isAvailable = true;
            break;
        }}


        if(!isAvailable)
            System.out.println("The number "+key+ " not found int the given array");


    }
}
