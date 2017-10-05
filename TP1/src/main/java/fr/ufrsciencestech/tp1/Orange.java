/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.tp1;
/**
 *
 * @author jonat_000
 */
public class Orange {
    private double prix;
    private String origine;
	
    public Orange ()
    {
        this.prix = 0.0;
        this.origine = "";
    }
	
    public Orange (double pr, String or)
    {
        if (pr < 0.0) throw new ArithmeticException("Negative price.");
        else
        {
            this.prix = pr;
            this.origine = or;
        }
    }
	
    public double getPrix()
    {
        return this.prix;
    }
	
    public String getOrigine()
    {
        return this.origine;
    }    
    
    public String toString()
    {
        String res;
        res = "\tPrix : "+prix+"\n\tOrigine : \n"+origine;
        return res;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj != null && (obj.getClass()==Orange.class))
            if(obj instanceof Orange)
            {
                Orange Oe=(Orange)obj;
                if((Oe.getPrix()==this.prix)&&(Oe.getOrigine().equals(this.origine)))
                    return true;
                return false;
            }
        return false;
    }
}
