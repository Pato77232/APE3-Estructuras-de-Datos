public class Ejercicio3_Binario2 {
    public static int calcularAltura(Nodo raiz) {
        if (raiz == null) {
            return 0; // La altura de un árbol vacío es 0
        }
        int alturaIzquierda = calcularAltura(raiz.izquierdo);
        int alturaDerecha = calcularAltura(raiz.derecho);
        return 1 + Math.max(alturaIzquierda, alturaDerecha); // Altura del nodo actual + altura máxima de sus subárboles
    }

    public static void main(String[] args) {
        //        1
        //         \
        //          2
        //         /
        //        3
        Nodo raiz = new Nodo(1);
        raiz.derecho = new Nodo(2);
        raiz.derecho.izquierdo = new Nodo(3);
        
        System.out.println("--- Prueba Ejercicio 3 ---");
        System.out.println("Altura esperada: 3");
        System.out.println("Altura calculada: " + calcularAltura(raiz));
        System.out.println("Altura de árbol nulo (esperado 0): " + calcularAltura(null));
    }
}
// Nota: Usa la clase Nodo definida en el Ejercicio 2.