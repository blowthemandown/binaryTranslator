/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaryTranslater;

/**
 *
 * @author james
 */
public class binaryText implements textParser {
    //String text;  well, maybe
    
    public binaryText(){}
    
    @Override
    public boolean isValid(String text){//should also check if the string is broken up into 8-bit 'words' or if it's all one chunk - by checking for spaces at position 8, 16 etc
        for(int i = 0; i<text.length(); i++){
            if(text.charAt(i)!='1'&&text.charAt(i)!='0')return false;
            
        }
        return true;
    }
    
    @Override
    public String convertText(String text){
        String s;
        //put in a loop after breaking up the text string
        int parseInt = Integer.parseInt(text, 2);
        char c = (char)parseInt;
        Character ch = c;
        s = ch.toString();
        return s;
    }
}
