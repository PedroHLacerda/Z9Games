package br.com.z9games.negorcio;

/**
 * @author Adriano Vasconcelos
 */
public class InvalidValueException extends Exception {
    
    /**
     * M�todo construtor que recebe uma mensagem e lan�a a exception superclass
     * @param message 
     */
    public InvalidValueException (String message) {
        super(message);
    }
    
}
