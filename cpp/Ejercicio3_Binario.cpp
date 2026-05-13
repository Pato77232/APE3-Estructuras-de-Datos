#include <iostream>
#include <algorithm> // util para std::max
using namespace std;

// Asumiendo la estructura Nodo del Ejercicio 2
struct Nodo {
    int valor;
    Nodo* izquierdo;
    Nodo* derecho;
    Nodo(int v) : valor(v), izquierdo(nullptr), derecho(nullptr) {}
};

int calcularAltura(Nodo* raiz) {
    if (raiz == nullptr) {
        return 0; // La altura de un árbol vacío es 0
    }
    int alturaIzquierda = calcularAltura(raiz->izquierdo);
    int alturaDerecha = calcularAltura(raiz->derecho);
    return 1 + max(alturaIzquierda, alturaDerecha); // Altura del nodo actual + altura máxima de sus subárboles
}

int main() {
    Nodo* raiz = new Nodo(1);
    raiz->derecho = new Nodo(2);
    raiz->derecho->izquierdo = new Nodo(3);
    
    cout << "--- Prueba Ejercicio 3 ---" << endl;
    cout << "Altura esperada: 3" << endl;
    cout << "Altura calculada: " << calcularAltura(raiz) << endl;
    cout << "Altura de arbol nulo (esperado 0): " << calcularAltura(nullptr) << endl;

    return 0;
}