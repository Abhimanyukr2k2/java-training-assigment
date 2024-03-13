package Assigment1;


import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        System.out.println("this is Simple Calculater ......");
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the operation number ---");
      
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Divide");
       
        int operator1 = Sc.nextInt();
        switch (operator1) {

            case 1:
            System.out.println("Enter the 1st number of : ");
            int num1 = Sc.nextInt();
            System.out.println("Enter the 2nd number of : ");
            int num2 = Sc.nextInt();
                System.out.println("Addition of two number : " + num1 + " + " + num2 + " = " + (num1 + num2));
                break;

            case 2:
            System.out.println("Enter the 1st number of : ");
            int num3 = Sc.nextInt();
            System.out.println("Enter the 2nd number of : ");
            int num4 = Sc.nextInt();
                System.out.println("Addition of two number : " + num3 + " - " + num4 + " = " + (num3 - num4));
                break;
            case 3:
            System.out.println("Enter the 1st number of : ");
            int num5 = Sc.nextInt();
            System.out.println("Enter the 2nd number of : ");
            int num6 = Sc.nextInt();
                System.out.println("Addition of two number : " + num5 + " * " + num6 + " = " + (num5 * num6));
                break;
            case 4:
            System.out.println("Enter the 1st number of : ");
            int num7 = Sc.nextInt();
            System.out.println("Enter the 2nd number of : ");
            int num8 = Sc.nextInt();
                System.out.println("Addition of two number : " + num7 + " / " + num8 + " = " + (num7 / num8));
                break;

            default:
                break;
        }
    }
}