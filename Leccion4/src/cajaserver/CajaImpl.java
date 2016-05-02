package cajaserver;

/**
 * Implementación de la interfaz remota Caja.
 * @param <T> Tipo de dato a almacenar en la Caja.
 */
public class CajaImpl <T> implements Caja<T> {
	
    private T contenido = null;

    public CajaImpl() {
        super();
    }

	@Override
    public void pon(T a) {
        this.contenido = a;
    }

    @Override
    public T quita() {
        T x = contenido;
        contenido = null;
        return x;
    }

    @Override
    public T lee() {
        return contenido;
    }
}