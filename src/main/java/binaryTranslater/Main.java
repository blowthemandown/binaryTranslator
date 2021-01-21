/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaryTranslater;

import java.util.Scanner;

/**
 *
 * @author james
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String user_input_string;
        Scanner input = new Scanner(System.in);
        boolean cont = true;
        char kind;
        textImpl ti;
        
        while(cont){
            System.out.println("Enter 1 for a binary string to translate, b for a plain text string, or q to quit");
            user_input_string = input.nextLine();
            

            
            switch(user_input_string){
                case "q":
                    cont = false;
                    break;
                case "1":
                    kind = 'b';
                    System.out.println("Enter the binary string, with spaces between chars");
                    user_input_string = input.nextLine();
                    
                    ti = new textImpl(user_input_string,kind);
                    ti.convertText();
                    System.out.println(ti.getText());
                    break;
                case "b":
                    kind = 'p';
                    System.out.println("Enter the string");
                    user_input_string = input.nextLine();
                    ti = new textImpl(user_input_string,kind);
                    ti.convertText();
                    System.out.println(ti.getText());
                    break;
                default:
                    System.out.println("Invalid input");
                    
            }
        }
    }
    
}
