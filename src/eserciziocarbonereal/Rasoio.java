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
public class Rasoio implements Portable {

    private final String modello;

    public Rasoio(String modello) {
        this.modello = modello;
    }
    
    public String getModello(){
        return modello;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.modello);
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
        final Rasoio other = (Rasoio) obj;
        if (!Objects.equals(this.modello, other.modello)) {
            return false;
        }
        return true;
    }
}
