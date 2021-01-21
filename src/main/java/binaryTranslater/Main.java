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
        
        while(cont){
            System.out.println("Enter 1 for a binary string to translate, b for a text string, or q to quit");
            user_input_string = input.nextLine();
            
            if(user_input_string.equals("q"))cont=false;
        }
    }
    
}
