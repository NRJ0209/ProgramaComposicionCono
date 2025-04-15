package Prisma;
import java.util.*;
/**
 * Clase principal que ejecuta la creación de objetos Prisma,
 * muestra sus propiedades y los ordena por área total descendente.
 *
 * Esta clase demuestra el uso de la clase {@link Prisma}
 * creando tres instancias con valores aleatorios y mostrando
 * sus datos en consola.
 *
 * @author TuNombre
 * @version 1.0
 */
public class Main {
    /**
     * Método principal del programa.
     * Crea tres objetos Prisma con valores aleatorios para base y altura,
     * los muestra por pantalla y luego los ordena de mayor a menor
     * según su área total.
     *
     * @param args argumentos de línea de comandos (no se usan).
     */
    public static void main(String[] args) {
        Random random = new Random();
        Prisma[] prismas = new Prisma[3];
        System.out.println("==============================");
        System.out.println(" CREACIÓN DE OBJETOS PRISMA:");
        System.out.println("==============================");
        // Crear tres prismas con valores aleatorios
        for (int i = 0; i < prismas.length; i++) {
            int base = random.nextInt(10) + 1;    // Base aleatoria entre 1 y 10
            int altura = random.nextInt(10) + 1;  // Altura aleatoria entre 1 y 10
            prismas[i] = new Prisma(base, altura);
            System.out.println("Creado el objeto Prisma" + (i + 1) + " con:");
            System.out.println(prismas[i]);
        }
        // Ordenar los prismas de mayor a menor según área total
        Arrays.sort(prismas, (a, b) -> Float.compare(b.areaTotal(), a.areaTotal()));
        System.out.println("==============================");
        System.out.println("Ordenados de mayor a menor:\n");
        for (int i = 0; i < prismas.length; i++) {
            System.out.printf("  - Prisma%d: área total %.0f%n", i + 1, prismas[i].areaTotal());
        }
    }
}