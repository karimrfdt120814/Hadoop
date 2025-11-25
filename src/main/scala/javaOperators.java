public class javaOperators {

    public static void main(String[] args){

        int a=20,b=20;

        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("a*b="+(a*b));
        System.out.println("b/a="+(b/a));
        System.out.println("b%a="+(b%a));
        System.out.println("Using a++"+ a++);
        System.out.println("printing"+ ++a);

        int big = (a>b) ? a:b; //ternary operator

        System.out.println("Big Is: " +big);
    }
}
