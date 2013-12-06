package br.com.z9games.negorcio;

/**
 * @author Adriano Vasconcelos
 */
public class InvalidValueException extends Exception {
    
    /**
     * Método construtor que recebe uma mensagem e lança a exception superclass
     * @param message 
     */
    public InvalidValueException (String message) {
        super(message);
    }
    
}
