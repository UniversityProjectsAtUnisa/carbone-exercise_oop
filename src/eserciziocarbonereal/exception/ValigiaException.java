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
public class ValigiaException extends Exception {

    /**
     * Creates a new instance of <code>ValigiaException</code> without detail
     * message.
     */
    public ValigiaException() {
    }

    /**
     * Constructs an instance of <code>ValigiaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ValigiaException(String msg) {
        super(msg);
    }
}
