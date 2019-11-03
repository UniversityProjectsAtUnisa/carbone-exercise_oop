/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziocarbonereal;

import eserciziocarbonereal.able.Portable;
import java.util.Objects;

/**
 *
 * @author carbo
 */
public class Pantalone implements Portable {

    private String taglia;

    public Pantalone(String taglia) {
        this.taglia = taglia;
    }

    public String getTaglia() {
        return taglia;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.taglia);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pantalone other = (Pantalone) obj;
        if (!Objects.equals(this.taglia, other.taglia)) {
            return false;
        }
        return true;
    }
}
