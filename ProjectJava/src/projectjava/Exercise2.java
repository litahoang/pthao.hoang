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

public class Exercise2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the character: ");
        String str = input.next();
        char[] myChar = str.toCharArray();
//Turn the string into an array of char

        for (char c : myChar) {
            switch (c) {
//Check if it is a vowel or not
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    
                    System.out.print(c + " This is a vowel ");
                    break;
                default:
                    System.out.print(c + " This is not vowel ");
                    break;
            }

        }

    }

}
