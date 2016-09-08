package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        boolean repeat = true;
        boolean useResult = false;
        Double result = null;

        while (repeat) {
            Scanner scanner = new Scanner(System.in);

            Double number1;
            if (useResult == false) {
                System.out.print("Insert 1 number : ");
                String value1 = scanner.nextLine();
                number1 = Double.parseDouble(value1);
            } else {
                number1 = result;
            }

            System.out.print("Operand : ");
            String operand = scanner.nextLine();

            System.out.print("Insert 2 number : ");
            String value2 = scanner.nextLine();
            Double number2 = Double.parseDouble(value2);

            switch (operand) {
                case "+": {
                    result = number1 + number2;
                    break;
                }
                case "-": {
                    result = number1 - number2;
                    break;
                }
                case "*": {
                    result = number1 * number2;
                    break;
                }
                case "/": {
                    result = number1 / number2;
                    break;
                }
                case "^": {
                    result = Math.pow(number1, number2);
                    break;
                }
                default: {
                    throw new Exception("Invalid operator");
                }
            }
            System.out.println("Result : " + result);

            System.out.print("Repeat (r), quit (q), user result and repeat (u) : ");
            String answer = scanner.nextLine();
            switch (answer) {
                case "r": {
                    repeat = true;
                    useResult = false;
                    break;
                }
                case "u": {
                    repeat = true;
                    useResult = true;
                    break;
                }
                case "q": {
                    repeat = false;
                    break;
                }
                default: {
                    throw new Exception("Invalid choice");
                }
            }
        }
    }
}
