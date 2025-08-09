package src.main.java.KAP2;

public class BooleanCheck {
    public static void main(String[] args) {

        int a = 4;
        int b = 3;
        int c = 3;
        double d = 4.5;
        int e = 1;

        /*
        a!= 4
        a>b
        b==c
        (b+1)==4
        (a/b)==1
        (b/a)>0
        (a%e)!=0
        (a>0) && (a <= 4)
        !(e <c)
         */

        System.out.println(a!= 4);              //false
        System.out.println(a>b);                //true
        System.out.println(b==c);               //true
        System.out.println((b+1)==4);           //true
        System.out.println((a/b)==1);           //true
        System.out.println((b/a)>0);            //false
        System.out.println((a%e)!=0);           //false
        System.out.println((a>0) && (a <= 4));  //true
        System.out.println(!(e <c));            //false

    }
}
