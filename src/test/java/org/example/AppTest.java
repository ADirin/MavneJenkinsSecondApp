
package org.example;

//import junit.framework.Test;

import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

    @Test
    public void testApp()
    {

        assertEquals("Hello Jenkins", App.myApp() );
    }
}
