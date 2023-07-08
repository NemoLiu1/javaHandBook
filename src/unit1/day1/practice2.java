package unit1;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int product = 0;
        int subject1 = in.nextInt();
        String operator = in.next();
        int subject2 = in.nextInt();
        switch (operator) {
            case "+": product = subject1 + subject2;
            break;
            case "-": product = subject1 - subject2;
            break;
            case "*": product = subject1 * subject2;
            break;
            case "/": product = subject1 / subject2;
            break;
        };
        System.out.println(product);
    }
}
