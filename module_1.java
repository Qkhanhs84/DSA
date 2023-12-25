import java.util.Scanner;

public class module_1 {
    //cau 4
    static void print_func(String x){
        System.out.println(x);
    }
    public static void main(String[] args) {
        // cau 1
        System.out.println("hello world");

        // cau 2 
        String x ; 
        x = "hello world" ; 
        System.out.println(x);
        // cau 3 
        String a ,  b , c ; 
        a = "hello" ; 
        b = "world" ; 
        c = a + " " + b ; 
        System.out.println(c);
        // cau 4 
        print_func(c) ; 
    }
}
