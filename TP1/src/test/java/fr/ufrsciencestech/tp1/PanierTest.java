/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.tp1;

import java.util.ArrayList;
import junit.framework.TestCase;

/**
 *
 * @author jonat_000
 */
public class PanierTest extends TestCase {
    
    public PanierTest(String testName) {
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
     * Test of getList method, of class Panier.
     */
    public void testGetList() {
        System.out.println("getList");
        Panier instance = new Panier();
        ArrayList<Orange> expResult = null;
        ArrayList<Orange> result = instance.getList();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaxS method, of class Panier.
     */
    public void testGetMaxS() {
        System.out.println("getMaxS");
        Panier instance = new Panier();
        int expResult = 0;
        int result = instance.getMaxS();
        assertEquals(expResult, result);
    }

    /**
     * Test of estPlein method, of class Panier.
     */
    public void testEstPlein() {
        System.out.println("estPlein");
        Panier instance = new Panier();
        boolean expResult = false;
        boolean result = instance.estPlein();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estVide method, of class Panier.
     */
    public void testEstVide() {
        System.out.println("estVide");
        Panier instance = new Panier();
        boolean expResult = false;
        boolean result = instance.estVide();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Panier.
     */
    public void testToString() {
        System.out.println("toString");
        Panier instance = new Panier();
        String expResult = "Liste :\n";
        System.out.println(expResult);
        String result = instance.toString();
        System.out.println(result);
        assertEquals(expResult, result);
    }

    /**
     * Test of ajoute method, of class Panier.
     */
    public void testAjoute() {
        System.out.println("ajoute");
        Orange o = null;
        Panier instance = new Panier();
        instance.ajoute(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retire method, of class Panier.
     */
    public void testRetire() {
        System.out.println("retire");
        Panier instance = new Panier();
        instance.retire();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Panier.
     */
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Panier instance = new Panier();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
