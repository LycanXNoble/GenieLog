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

    /**
     * Test of getPrix method, of class Orange.
     */
    public void testGetPrix() {
        System.out.println("getPrix");
        Orange instance = new Orange();
        double expResult = 0.0;
        double result = instance.getPrix();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getOrigine method, of class Orange.
     */
    public void testGetOrigine() {
        System.out.println("getOrigine");
        Orange instance = new Orange();
        String expResult = "";
        String result = instance.getOrigine();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Orange.
     */
    public void testToString() {
        System.out.println("toString");
        Orange instance = new Orange();
        String expResult = "\tPrix : 0.0\n\tOrigine : ";
        System.out.println(expResult);
        String result = instance.toString();
        System.out.println(result);
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Orange.
     */
    public void testOrangeEq()
    {
        Orange o1=new Orange(0.31,"France");
        Orange o2=new Orange(0.31,"France");
        Orange o3=new Orange(0.5,"France");
        Orange o4=new Orange(0.31,"Espagne");
        Object test=new Object();
        
        assertFalse(o1.equals(test));
        assertFalse(o1.equals(o3));
        assertFalse(o1.equals(o4));
        assertEquals(o1,o2);
        assertTrue(o1.equals(o2));
    }
}
