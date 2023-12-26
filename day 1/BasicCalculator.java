/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ashwi
 */

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

     
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Perform the corresponding operation
        double result = 0;
        boolean validOperator = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperator = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operator entered.");
                validOperator = false;
                break;
        }

        // Display the result if the operator is valid
        if (validOperator) {
            System.out.println("Result: " + result);
        }

        // Close the Scanner to avoid resource leaks
        scanner.close();
    }
}
