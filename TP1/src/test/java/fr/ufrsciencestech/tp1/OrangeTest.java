/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.tp1;

import junit.framework.TestCase;

/**
 *
 * @author jonat_000
 */
public class OrangeTest extends TestCase {
    
    public OrangeTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
    
    public void testOrangeEq()
    {
        Orange o1=new Orange(0.31,"France");
        Orange o2=new Orange(0.31,"France");
        
        assertTrue(o1==o2);
        assertTrue(o1.equals(o2));
    }
}
