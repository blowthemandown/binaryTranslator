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
    	int len = text.length() % 9;
        if(len!=8&&len!=0)return false;
    	for(int i = 0; i<text.length(); i++){
            if(i%9==8){
                if(text.charAt(i)!=' ')return false;
            } else {
                if(text.charAt(i)!='1'&&text.charAt(i)!='0')return false;
            }
            
        }
        return true;
    }
    
    @Override
    public String convertText(String text){
        String s="";
        String temp;
        
        if(!isValid(text)) {
        	return "not a valid binary string";
        }
        
        String chars[] = text.split(" ");
        //System.out.print(chars);
        //put in a loop after breaking up the text string
        for (String char1 : chars) {
            int parseInt = Integer.parseInt(char1, 2);
            char c = (char)parseInt;
            Character ch = c;
            temp = ch.toString();
            s=s.concat(temp);
        }
        
        return s;
    }
}
