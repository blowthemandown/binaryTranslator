/*
 * Test cases for the plainText class.  Using junit 4, sould think about upgrading to junit 5 at some later point
 */
package binaryTranslater;//needs to be the same as in the source package


/**
 *
 * @author james
 */

import java.util.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
public class plainTextTest {
    
    plainText pt;
    
    
    @BeforeClass
    public static void SetUpClass() throws Exception{}
    
    @AfterClass
    public static void TearDownClass() throws Exception{}
    
    @Before
    public void setup(){
        pt = new plainText();
    }
    
    @After
    public void tearDown() throws Exception {}
    
    /*
    This is a simple test of the basic functions called by the class itself.
    */
    @Test
    public void shouldDisplay01100110(){
        String testVal;
        //testVal= Integer.toBinaryString('f');//fails, returns 1100110 without the leading 0
        testVal = String.format("%8s", Integer.toBinaryString('f')).replace(' ', '0');
        assertEquals("01100110", testVal);
    }
    
    /*
    This is another test of the basic functions, with more than one leading zero
    */
    @Test
    public void shouldDisplay00110111(){
        String testVal = String.format("%8s", Integer.toBinaryString('7')).replace(' ', '0');//leads with two spaces before the replace
        assertEquals("00110111", testVal);
    }
    
    /*
    This tests the doChar method that condences the above.  The character 2 should be 00110010.
    */
    @Test
    public void shouldDisplay00110010(){
        assertEquals("00110010",pt.doChar('2'));
    }
    
}
