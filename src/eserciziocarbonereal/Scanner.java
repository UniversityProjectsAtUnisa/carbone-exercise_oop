/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziocarbonereal;

import eserciziocarbonereal.able.*;

/**
 *
 * @author marco
 */
public class Scanner implements FiltroBagaglio {

    @Override
    public boolean filter(Valigia v) {
        for (Portable p : v) {
            if (p instanceof Metallable) {
                return true;
            }
        }
        return false;
    }

}
