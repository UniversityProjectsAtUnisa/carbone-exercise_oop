/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziocarbonereal;

import eserciziocarbonereal.exception.*;
import java.util.*;

/**
 *
 * @author carbo
 */
public class Aereo {

    private Map<String, Set<Valigia>> map = new HashMap<>();

    public void add(Passeggero p, Valigia... valigie) throws AereoPienoException, MalatoDiCuoreException {
        List<Valigia> array = Arrays.asList(valigie);
        Set<Valigia> set = new HashSet<>(array);
        map.put(p.getCodiceFiscale(), set);
    }

    public void svuota() {
        map.clear();
    }

    public String toString() {
        String s = "";
        for (Map.Entry<String, Set<Valigia>> entry : map.entrySet()) {
            String codiceFiscale = entry.getKey();
            s += "Codice Fiscale: " + codiceFiscale + " - " + entry.getValue().toString() + "\n";
        }
        return s;
    }
    
    
}
