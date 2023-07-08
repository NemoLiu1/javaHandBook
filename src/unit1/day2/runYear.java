package unit1.day2;

import java.util.Scanner;

public class runYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        boolean runYear = year%4 == 0 && year%100 !=0;
        System.out.println(runYear);
    }
}
