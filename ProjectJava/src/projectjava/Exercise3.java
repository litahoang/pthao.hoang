/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;

/**
 *
 * @author hoangthao
 */
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Input three numbers ");
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        a = sc.nextInt();
        System.out.print("b: ");
        b = sc.nextInt();
        System.out.print("c: ");
        c = sc.nextInt();
//tim max
        if (a > b && a > c) {
            System.out.println("a is the greatest number");
        } else if (b > a && b > c) {
            System.out.println("b is the greatest number");
        } else if (c > a && c > b) {
            System.out.println("c is the greatest number");
        } else {
            System.out.println("No unique value maximum");
        }
    }

}
