package com.phase1;

import java.util.Scanner;

public class ArithmeticCalculator {
  public static void main(String[] args) {

    char oper;
    Double num1, num2, res;

    // create an object of Scanner class
    Scanner userinput = new Scanner(System.in);

    // ask users to enter operator
    System.out.println("Choose an operator: +, -, *, or /");
    oper = userinput.next().charAt(0);

    // ask users to enter numbers
    System.out.println("Enter first number");
    num1 = userinput.nextDouble();

    System.out.println("Enter second number");
    num2 = userinput.nextDouble();

    switch (oper) {

      // performs addition between numbers
      case '+':
        res = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + res);
        break;

      // performs subtraction between numbers
      case '-':
        res = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + res);
        break;

      // performs multiplication between numbers
      case '*':
        res = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + res);
        break;

      // performs division between numbers
      case '/':
        res = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + res);
        break;

      default:
        System.out.println("Invalid operator");
        break;
    }

    userinput.close();
  }
}
