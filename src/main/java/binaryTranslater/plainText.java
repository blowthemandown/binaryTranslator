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
public class plainText implements textParser{
    
    public plainText(){}

    @Override
    public boolean isValid(String text) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return true;
    }

    @Override
    public String convertText(String text) {
        String ret = "";
        int l = text.length();
        for(int i = 0; i<l; i++){
            ret=ret.concat(
                    Integer.toBinaryString(text.charAt(i)));
            ret=ret.concat(" ");
        }
        return ret;
    }
    
}
