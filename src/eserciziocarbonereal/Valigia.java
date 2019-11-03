/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziocarbonereal;

import eserciziocarbonereal.able.Portable;
import java.util.*;

/**
 *
 * @author carbo
 */
public class Valigia {

    Collection<Portable> collection;

    public Valigia() {
        collection = new ArrayList<Portable>();
    }

    public void add(Portable obj) {
        collection.add(obj);
    }

    public boolean remove(Portable obj) {
        return collection.remove(obj);
    }

    public boolean contains(Portable obj) {
        return collection.contains(obj);
    }
    
    public void svuota(){
        collection.clear();
    }
    
    public String toString(){
        String str = "";
        for (Portable elem : collection)
            str += elem.toString() + "\n";
        return str;
    }
}
