package Assigment1;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        System.out.println("This is Atm machine ");
        System.out.println("Select you operation ");
        System.out.println("1. Balance :");
        System.out.println("2. Deposite Money ");
        System.out.println("3. Withdraw Money ");

        Scanner Sc = new Scanner(System.in);
        int bal = 250;
        int num = Sc.nextInt();
        System.out.println("you have entered operation number: "+num);

        switch (num) {
            case 1:
                System.out.println("Current balance in your account : " + bal);

                break;
            case 2:
               
                System.out.println(" Enter the Your deposite money : ");
                int dep = Sc.nextInt();
                System.out.println("Successful");
                System.out.println(" Your Balence  after the deposite in Your Bank Account : " + (bal + dep));

                break;
            case 3:
                System.out.println("Enter the withdrad Money : ");
                int witgh = Sc.nextInt();
                if (witgh<= bal) {
                    System.out.println("Your Balence after the Withdraw in Your Account : " + bal);
                    System.out.println("Your Withdraw Money from Your Account in Your Account : " + (bal - witgh));
                    
                }
                else {
                    System.out.println(" unsufficient  Balance");
                }
                

                break;

            default:
                System.out.println(" Enter the valid option");
                break;
        }
    }
}