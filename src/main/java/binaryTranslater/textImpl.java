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
public class textImpl implements Text{

    String text;
    char kind;
    //textParser tp; maybe not
    
    public textImpl(String t, char k){
        this.text = t;
        this.kind = k;
        //this.tp = null;
    };
    
    
    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setText(String s) {
        text = s;
    }

    @Override
    public void printText() {
        System.out.println(text);
    }
    
    public String convertText(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
