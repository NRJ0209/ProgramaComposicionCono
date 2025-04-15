package ProgramaComposicionCono;
/**
 * Representa un cono con una base circular, altura y color.
 */
    public class Cono {
        private Circulo base;
        private float altura;
        private String color;
    /**
     * Constructor de la clase Cono.
     * @param cX Coordenada X del centro de la base del cono.
     * @param cY Coordenada Y del centro de la base del cono.
     * @param r Radio de la base del cono.
     * @param h Altura del cono.
     * @param color Color del cono.
     */
    public Cono (float cX, float cY, float r, float h, String color) { // constructor
        this.base = new Circulo(cX, cY, r);
        this.altura = h;
        this.color = color;
    }
    /**
     * Devuelve la base del cono.
     * @return Base del cono (objeto Circulo).
     */
    public Circulo getBase() {
        return base;
    }
    /**
     * Establece la base del cono.
     * @param base Nueva base del cono.
     */
    public void setBase(Circulo base) {
        this.base = base;
    }
    /**
     * Devuelve la altura del cono.
     * @return Altura del cono.
     */
        public float getAltura() {
            return altura;
    }
    /**
     * Establece la altura del cono.
     * @param altura Nueva altura del cono.
     */
        public void setAltura(float altura) {
            this.altura = altura;
    }
    /**
     * Devuelve el color del cono.
     * @return Color del cono.
     */
        public String getColor() {
            return color;
    }
    /**
     * Establece el color del cono.
     * @param color Nuevo color del cono.
     */
        public void setColor(String color) {
            this.color = color;
    }
    /**
     * Imprime los atributos del cono en consola.
     */
        public void imprimir () {
            base.imprimir();
            System.out.println(" h=" + altura + " c=" + color);
    }
}
