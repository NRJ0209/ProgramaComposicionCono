package ProgramaComposicionCono;
/**
 * Representa un círculo con un radio y coordenadas en el plano.
 */
public class Circulo {
    private float x, y;
    private float radio;
    /**
     * Constructor de la clase Circulo.
     * @param cX Coordenada X del centro del círculo.
     * @param cY Coordenada Y del centro del círculo.
     * @param r Radio del círculo.
     */
    public Circulo (float cX, float cY, float r) { // constructor
        this.x = cX;
        this.y = cY;
        this.radio = r;
    }
    /**
     * Devuelve la coordenada X del círculo.
     * @return Coordenada X.
     */
    public float getX() {
        return x;
    }
    /**
     * Establece la coordenada X del círculo.
     * @param x Nueva coordenada X.
     */
    public void setX(float x) {
        this.x = x;
    }
    /**
     * Devuelve la coordenada Y del círculo.
     * @return Coordenada Y.
     */
    public float getY() {
        return y;
    }
    /**
     * Establece la coordenada Y del círculo.
     * @param y Nueva coordenada Y.
     */
    public void setY(float y) {
        this.y = y;
    }
    /**
     * Devuelve el radio del círculo.
     * @return Radio del círculo.
     */
    public float getRadio() {
        return radio;
    }
    /**
     * Establece el radio del círculo.
     * @param radio Nuevo valor del radio.
     */
    public void setRadio(float radio) {
        this.radio = radio;
    }
    /**
     * Calcula el área del círculo.
     * @return Área del círculo.
     */
    public float area() {
        return (float)Math.PI*radio*radio;
    }
    /**
     * Imprime los atributos del círculo en consola.
     */
    public void imprimir () {
        System.out.print(" x=" + x);
        System.out.print(" y=" + y);
        System.out.print(" r=" + radio);
        System.out.print(" A=" + area());
    }
}
