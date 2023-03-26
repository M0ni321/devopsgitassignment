package main.java.com.mycompany.app;
import java.util.*;
/**
 * Hello world!
 */
public class App {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Calculator app: ");
        System.out.println("Enter your choice:\n 1 for 'Addition' \n 2 for 'Subtraction' \n 3 for 'Division' \n 4 for 'Multiplication'");
        int n = sc.nextInt();
        System.out.println("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        switch(n){
            case 1:
            System.out.println(addition(a,b));
            break;
            case 2: 
            System.out.println(subtraction(a,b));
            break;
            case 3:
            System.out.println(division(a,b));
            break;
            case 4:
            System.out.println(multiplication(a,b));
            break;
            default:
            System.out.println("Wrong choice entered");
        }
        sc.close();
    }

    public static double addition(double a, double b){
        return a+b;
    }

    public static double subtraction(double a, double b){
        return a-b;
    }

    public static String division(double a, double b){
        if(b==0)
            return "Division by zero not possible";
        return String.valueOf(a/b);
    }

    public static double multiplication(double a, double b){
        return a*b;
    }
}
