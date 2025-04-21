package presentation;

import java.util.Scanner;

public class hotel {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                String[] dishes = {
                        "1. gobbi : $70",
                        "2. fried rice - $70",
                        "3. Pizza - $500",
                        "4. briyani - $250",
                        "5.  ice cream- $30"
                };

                System.out.println("Welcome to the Restaurant! Here are the available dishes:");
                for (String dish : dishes) {
                    System.out.println(dish);
                }

                System.out.print("Please select a dish by number (1-5): ");
                int choice = scanner.nextInt();
                System.out.println("\nYou have selected:");
                System.out.println(dishes[choice - 1]);
                String selectedDish = dishes[choice - 1];
                String[] selectedDishInfo = selectedDish.split(" - ");
                double price = Double.parseDouble(selectedDishInfo[1].replace("$", ""));

                System.out.println("\nThank you for your order!");
                System.out.printf("Your total bill is: $%.2f\n", price);

                scanner.close();
            }
        }