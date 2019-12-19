package app;

/**
 * Pareja
 */
public class Pareja<T> {

    T primero;
    T segundo;

    public Pareja(T primero, T segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    /**
     * @return the primero
     */
    public T getPrimero() {
        return primero;
    }

    /**
     * @param primero the primero to set
     */
    public void setPrimero(T primero) {
        this.primero = primero;
    }

    /**
     * @return the segundo
     */
    public T getSegundo() {
        return segundo;
    }

    /**
     * @param segundo the segundo to set
     */
    public void setSegundo(T segundo) {
        this.segundo = segundo;
    }
}