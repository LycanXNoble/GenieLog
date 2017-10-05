/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.tp1;
import java.util.ArrayList;
/**
 *
 * @author jonat_000
 */
public class Panier
{    
    ArrayList<Orange> List;
    
    
    int MAX_SIZE;
    
    public Panier()
    {
        List = new ArrayList();
        MAX_SIZE = 0;
    }
    
    public Panier(int S)
    {
        List = new ArrayList();
        MAX_SIZE = S;
    }
    
    public Panier(Panier p)
    {
        List = p.getList();
        MAX_SIZE = p.getMaxS();
    }
    
    public ArrayList<Orange> getList()
    {
        return List;
    }
    
    public int getMaxS()
    {
        return MAX_SIZE;
    }
    
    public boolean estPlein()
    {
        return (List.size()==MAX_SIZE);
    }
    
    public boolean estVide()
    {
        return (List.size()==0);
    }
    
    public String toString()
    {
        String res;
        res = "Liste :\n";
        for (Orange o : List)
        {
            res += o.toString()+"\n";
        }
        return res;
    }
    
    public void ajoute(Orange o)
    {
        List.add(o);
    }
    
    public void retire()
    {
        List.remove(List.get(List.size()-1));
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj != null && (obj.getClass()==Panier.class))
            if(obj instanceof Panier)
            {
                Panier te= (Panier)obj;
                if(!(te.getList().equals(List))) return false;
                if(te.MAX_SIZE!=this.MAX_SIZE)return false;
            }
        return true;
    }
}
