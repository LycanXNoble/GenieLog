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
        ArrayList<Orange> expResult = new ArrayList<Orange>();
        ArrayList<Orange> result = instance.getList();
        assertEquals(expResult, result);
        fail("finir test avec une liste d'un élément");
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
        Panier i2 = new Panier(2);
        Orange o=new Orange();
        i2.ajoute(o);
        
        boolean expResult = true;
        boolean result1 = instance.estPlein();
        boolean result2 = i2.estPlein();
        
        assertEquals(expResult, result1);
        assertEquals(false,result2);
    }

    /**
     * Test of estVide method, of class Panier.
     */
    public void testEstVide() {
        System.out.println("estVide");
        Orange o = new Orange();
        Panier instance = new Panier();
        Panier instance2 = new Panier(1);
        
        boolean result = instance.estVide();
        boolean result2 = instance2.estVide();
        instance2.ajoute(o);
        boolean result3 = instance2.estVide();
        
        assertEquals(false, result);
        assertEquals(true,result2);
        assertEquals(false,result3);
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
        Orange o2 = new Orange();
        Panier instance = new Panier(2);
        Panier exp = new Panier(2);
        exp.List.add(o2);
        instance.ajoute(o2);
        assertTrue(exp.equals(instance));
        try{
            instance.ajoute(o);
            fail("Exception non déclenchée.");
        }
        catch(ArithmeticException e)
        {
        }
    }

    /**
     * Test of retire method, of class Panier.
     */
    public void testRetire() {
        System.out.println("retire");
        Panier instance = new Panier();
        //instance.retire();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Panier.
     */
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Orange o = new Orange();
        Panier instance = new Panier(2);
        Panier instance2 = new Panier(2);
        Panier instance3 = new Panier(2);
        
        instance.ajoute(o);
        instance2.ajoute(o);
        
        boolean result = instance.equals(obj);
        boolean result2 = instance.equals(instance2);
        boolean result3 = instance.equals(instance3);
        
        assertEquals(false, result);
        assertEquals(true,result2);
        assertEquals(false,result3);
    }
    
}
