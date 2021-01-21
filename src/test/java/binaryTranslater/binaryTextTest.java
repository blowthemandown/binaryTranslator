/*
 * Test cases for the binaryText class
 */
package binaryTranslater;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;

/**
 *
 * @author james
 */
public class binaryTextTest {
    binaryText bt;
    
    @BeforeClass
    public static void SetUpClass() throws Exception{}
    
    @AfterClass
    public static void TearDownClass() throws Exception{}
    
    @Before
    public void setup(){
        bt = new binaryText();
    }
    
    @After
    public void tearDown() throws Exception {}
    
    /*
    01111000 should be "x"
    */
    @Test
    public void shouldDisplayx(){
        assertEquals("x", bt.convertText("01111000"));
    }
    
    /*
    01010100 should be "T"
    */
    @Test
    public void shouldDisplayT(){
        assertEquals("T", bt.convertText("01010100"));
    }
    
    /*
    01100010 01111001 01100101 should be "Bye"
    */
    @Test
    public void shouldDisplayBye(){
        assertEquals("Bye", bt.convertText("01000010 01111001 01100101"));
    }
    
    /*
    01100010 should pass
    */
    @Test
    public void _01100010ShouldPass(){
        assert(bt.isValid("01100010"));
    }
}
