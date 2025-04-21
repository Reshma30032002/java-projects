package presentation;

import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 123;
        int balance = 500;

        System.out.println("Enter the pin number: ");

        int pin_no = sc.nextInt();

        if (pin == pin_no) {
            int function = 0;
            while (function != 4) {
                System.out.println("Enter any option: ");
                System.out.println("1 for Check balance: \n 2.for chnge password: \n 3. fro cash add \n 4.for exit");
                System.out.println("Enter the function to be performed: ");
                function = sc.nextInt();

                if (function == 1) {
                    fun(function, balance);
                }
                if (function == 2) {
                    fun2(function, pin);
                }
                if (function == 3) {
                    fun3(function, balance);
                }
            }
            if (function == 4) {
                System.exit(0);
            }
        }

    }


    public static void fun(int function, int balance) {
        if (function == 1) {
            System.out.println("available balance:" + balance);
        }

    }

    public static void fun2(int function, int pin) {
        Scanner sc = new Scanner(System.in);
        if (function == 2) {
            System.out.println("Enter new pin: `");
            int new_password = sc.nextInt();
            pin = new_password;
            System.out.println("New password: " + pin);
        }
    }

    public static void fun3(int function, int balance) {
        Scanner sc = new Scanner(System.in);
        if (function == 3) {
            System.out.println("Enter the amount to be added: ");
            int amount = sc.nextInt();
            if (amount > 0) {
                amount = amount + balance;
                System.out.println("Total amount = " + amount);
            } else {
                System.out.println("Enter valid amount");
            }
        }
    }

    public static void fun4(int function) {
        if (function == 4) {
            System.exit(0);
        }
    }
}
