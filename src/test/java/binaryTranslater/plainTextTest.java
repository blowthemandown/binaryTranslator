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
        String testVal = Integer.toBinaryString('f');
        assertEquals("01100110", testVal);//fails, returns 1100110 without the leading 0
    }
    //are ALL of these returns just seven digits?
    
    @Test
    public void shouldDisplay0110111(){
        String testVal = Integer.toBinaryString('7');
        assertEquals("0110111", testVal);
    }
    
}
