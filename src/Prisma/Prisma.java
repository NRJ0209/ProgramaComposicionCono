package Prisma;
    /**
     * La clase Prisma representa un prisma de base triangular equilátera.
     * Permite calcular propiedades como el área de la base, perímetro,
     * área lateral y área total del prisma.
     */
    public class Prisma {
        /**
         * Longitud de la base del triángulo equilátero.
         */
        private int baseTriangulo;
        /**
         * Altura del prisma.
         */
        private int alturaPrisma;
        /**
         * Constructor para inicializar un objeto Prisma con base y altura.
         *
         * @param baseTriangulo longitud de la base del triángulo equilátero.
         * @param alturaPrisma altura del prisma.
         */
        public Prisma(int baseTriangulo, int alturaPrisma) {
            this.baseTriangulo = baseTriangulo;
            this.alturaPrisma = alturaPrisma;
        }
        /**
         * Obtiene la base del triángulo.
         *
         * @return base del triángulo equilátero.
         */
        public int getBaseTriangulo() {
            return baseTriangulo;
        }
        /**
         * Establece la base del triángulo.
         *
         * @param baseTriangulo nueva base del triángulo.
         */
        public void setBaseTriangulo(int baseTriangulo) {
            this.baseTriangulo = baseTriangulo;
        }
        /**
         * Obtiene la altura del prisma.
         *
         * @return altura del prisma.
         */
        public int getAlturaPrisma() {
            return alturaPrisma;
        }
        /**
         * Establece la altura del prisma.
         *
         * @param alturaPrisma nueva altura del prisma.
         */
        public void setAlturaPrisma(int alturaPrisma) {
            this.alturaPrisma = alturaPrisma;
        }
        /**
         * Calcula la altura del triángulo equilátero que forma la base.
         *
         * @return altura del triángulo equilátero.
         */
        public float alturaTriangulo() {
            return (float) (Math.sqrt(3) / 2 * baseTriangulo);
        }
        /**
         * Calcula el área de la base triangular equilátera.
         *
         * @return área de la base.
         */
        public float areaBase() {
            return (float) ((Math.pow(baseTriangulo, 2) * Math.sqrt(3)) / 4);
        }
        /**
         * Calcula el perímetro del triángulo de la base.
         *
         * @return perímetro del triángulo.
         */
        public float perimetro() {
            return 3 * baseTriangulo;
        }
        /**
         * Calcula el área lateral del prisma.
         *
         * @return área lateral del prisma.
         */
        public float areaLateral() {
            return perimetro() * alturaPrisma;
        }
        /**
         * Calcula el área total del prisma sumando
         * el área lateral y dos veces el área de la base.
         *
         * @return área total del prisma.
         */
        public float areaTotal() {
            return 2 * areaBase() + areaLateral();
        }
        /**
         * Devuelve una representación en texto del objeto Prisma.
         *
         * @return cadena con los atributos y área total.
         */
        @Override
        public String toString() {
            return "  - Base: " + baseTriangulo + "\n" +
                    "  - Altura: " + alturaPrisma + "\n" +
                    "  - Área total: " + (int) areaTotal();
        }
    }
