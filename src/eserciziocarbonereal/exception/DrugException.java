/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziocarbonereal.exception;

/**
 *
 * @author marco
 */
public class DrugException extends ValigiaException {

    /**
     * Creates a new instance of <code>DrugException</code> without detail
     * message.
     */
    public DrugException() {
    }

    /**
     * Constructs an instance of <code>DrugException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public DrugException(String msg) {
        super(msg);
    }
}
