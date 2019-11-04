/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziocarbonereal;

import java.util.*;
import eserciziocarbonereal.exception.*;

/**
 *
 * @author carbo
 */
public class Nastro extends LinkedList<Valigia> {

    List<FiltroBagaglio> filtri = new ArrayList<>();

        
    public Nastro() {
        super();
    }
    public void addFiltro(FiltroBagaglio e){
        filtri.add(e);
    }

    @Override
    public Valigia remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Valigia poll() {
        Valigia v = super.poll();
        for (FiltroBagaglio filtro : filtri) {
            if (filtro.filter(v)) {
                if (filtro instanceof Cane) {
                    throw new RuntimeException(new DrugException());
                } else if (filtro instanceof Scanner) {
                    throw new RuntimeException(new MetalloException());
                } else {
                    throw new RuntimeException(new ValigiaException());
                }
            }
        }

        return v;
    }

}
