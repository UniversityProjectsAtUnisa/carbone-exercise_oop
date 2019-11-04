/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziocarbonereal;
import eserciziocarbonereal.*;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author ma94
 */
public class TestAereo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        Valigia v = new Valigia();
        v.add(new Pantalone("46"));
        v.add(new Pantalone("48"));
        v.add(new Rasoio("Philips"));
        v.add(new Rasoio("ciao"));
        Valigia v2 = new Valigia();
        v2.add(new Pantalone("40"));
        v2.add(new Rasoio("lg"));
        v2.add(new Pantalone("44"));
        v2.add(new Rasoio("mio"));
        Nastro n=new Nastro();
        n.addFiltro(new Cane());
        n.addFiltro(new Scanner());
        n.add(v);
        n.add(v2);
        v = n.poll();
        v2= n.poll();
        Aereo a = new Aereo();
        a.add(new Passeggero("francesco", "carbone","safnsk", LocalDate.of(1998, 9, 20), false), v , v2);
        System.out.println(a); 
        a.svuota();
        
    }
    
}
