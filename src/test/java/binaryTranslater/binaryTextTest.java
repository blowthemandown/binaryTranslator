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
}
