package javaPrac;

public class copyArrayElements {
    public static void main(String[] args) {
        //copying the array a into array b
        int a[] = {1,2,3,4,5};
        int b[] = new int[a.length];

        for(int i=0;i<a.length;i++){
            b[i] = a[i];
        }
        for(int j=0;j<b.length;j++){
            //System.out.println(b[j]);
        }

        int a1[] = {1,2,3,4};
        int b1[] = {6,7,8};

        int result[] = new int[a1.length+b1.length];
        int index =0;

        //copying array b1 into result
        for(int i=0;i<a1.length;i++){
            result[index++]=a1[i];
        }
        System.out.println("a1 array successfully copied to result array");

        //copying array b1 into result
        for(int i=0;i<b1.length;i++){
            result[index++] =b1[i];
            //System.out.println(result[i]);
        }
        System.out.println("b1 array successfully copied to result array");

        System.out.println("******printing results after copying the elements*****");

        for (int i=0; i<result.length;i++){
        System.out.println(result[i]);}



        }

    }

