/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;
import java.util.Scanner;

/**
 *
 * @author hoangthao
 */
public class LoopingContructs {

    public static void main(String[] args) {

        int i;
        // i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your attempt: ");
        i = sc.nextInt();
        while (i != 1) {
            System.out.println("Please input again: ");
            i = sc.nextInt();
        }
        System.out.println("Select the menu: " + "\n1. Aptitude" + "\n2. English" + "\n3. Math" + "\n4. GK");
        i = sc.nextInt();
        sc.close();
        switch (i) {
            case 1:
                i = 1;
                System.out.println("Your subject is Aptitude");
                break;
            case 2:
                i = 2;
                System.out.println("Your subject is English");
                break;
            case 3:
                i = 3;
                System.out.println("Your subject is Math");
                break;
            case 4:
                i = 4;
                System.out.println("Your subject is GK");
                break;
            default:
                System.out.println(" Invalid subject");
        }
    }
}
