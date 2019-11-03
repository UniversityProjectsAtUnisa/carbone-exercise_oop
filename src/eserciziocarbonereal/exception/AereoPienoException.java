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
public class AereoPienoException extends Exception {

    /**
     * Creates a new instance of <code>AereoPienoException</code> without detail
     * message.
     */
    public AereoPienoException() {
    }

    /**
     * Constructs an instance of <code>AereoPienoException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public AereoPienoException(String msg) {
        super(msg);
    }
}
