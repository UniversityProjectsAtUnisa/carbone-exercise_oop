/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziocarbonereal.exception;

/**
 *
 * @author carbo
 */
public class MetalloException extends ValigiaException {

    /**
     * Creates a new instance of <code>MetalloException</code> without detail
     * message.
     */
    public MetalloException() {
    }

    /**
     * Constructs an instance of <code>MetalloException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public MetalloException(String msg) {
        super(msg);
    }
}
