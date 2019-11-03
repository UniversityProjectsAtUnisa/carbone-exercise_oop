/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziocarbonereal;

import eserciziocarbonereal.able.*;

/**
 *
 * @author carbo
 */
public class Cane implements FiltroBagaglio{
    public Cane(){};

    @Override
    public boolean filter(Valigia v) {
        for(Portable elem : v){
            if (elem instanceof Drogable)
                return true;
        }
        return false;
    }
    
}
