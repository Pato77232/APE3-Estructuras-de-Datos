import java.util.ArrayList;
import java.util.List;

public class  RecorridoInOrder {
    public static void inOrderAux(Nodo nodo, List<Integer> resultado) {
        if (nodo == null) {
            return; // Si el nodo es null, no hacemos nada
        }
        // Primero recorremos el subárbol izquierdo
        inOrderAux(nodo.izquierdo, resultado);
        // Luego agregamos el valor del nodo actual a la lista de resultados
        resultado.add(nodo.valor);
        // Finalmente recorremos el subárbol derecho
        inOrderAux(nodo.derecho, resultado);
    }

    public static List<Integer> recorridoInOrder(Nodo raiz) {
        List<Integer> resultado = new ArrayList<>();
        inOrderAux(raiz, resultado);
        return resultado;
    }

    public static void main(String[] args) {
        //        4
        //      /   \
        //     2     6
        //    / \   / \
        //   1   3 5   7
        Nodo raiz = new Nodo(4);
        raiz.izquierdo = new Nodo(2);
        raiz.derecho = new Nodo(6);
        raiz.izquierdo.izquierdo = new Nodo(1);
        raiz.izquierdo.derecho = new Nodo(3);
        raiz.derecho.izquierdo = new Nodo(5);
        raiz.derecho.derecho = new Nodo(7);

        System.out.println("--- Prueba Ejercicio 4 ---");
        System.out.println("Resultado esperado: [1, 2, 3, 4, 5, 6, 7]");
        System.out.println("Tu resultado:       " + recorridoInOrder(raiz));
    }
}