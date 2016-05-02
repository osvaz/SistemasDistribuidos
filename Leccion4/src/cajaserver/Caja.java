package cajaserver;

/**
 * Almacena un dato accesible vía RMI.
 * (Versión incompleta)
 *
 * El dato persiste en el servidor hasta que un cliente lo sobreescribe.
 * @param <T> es el tipo de dato que guardamos en la Caja
 */
public interface Caja <T> {
    /**
     * Sobreescribe el dato en la caja.
     * @param a el dato pasa a ser el contenido actual de la caja.
     * @throws ...
     */
    public void pon(T a);
    /**
     * Retira el contenido de la caja y la vacía.
     * @return el contenido actual de la caja.
     * @throws ...
     */
    public T quita();
    /**
     * Consulta el contenido de la caja.
     * @return el contenido actual de la caja.
     * @throws ...
     */
    public T lee();
}