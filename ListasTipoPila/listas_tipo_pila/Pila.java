package ListasTipoPila.listas_tipo_pila;

import javax.swing.JOptionPane;

public class Pila {
    private Nodo ultimoValorIngresaNodo;
    int tamano = 0;
    String lista = "";

    public Pila() {
        ultimoValorIngresaNodo = null;
        tamano = 0;
    }

    // Metodo para saber cuando la pila este vacia
    public boolean PilaVacia() {
        return ultimoValorIngresaNodo == null;
    }

    // Metodo para insertar un nodo en la pila
    public void InsertarNodo(int nodo) {
        Nodo nuevo_nocdo = new Nodo(nodo);
        nuevo_nocdo.siguiente = ultimoValorIngresaNodo;
        ultimoValorIngresaNodo = nuevo_nocdo;
        tamano++;
    }

    // Metodo para eliminar un nodo de la pila
    public int EliminarNodo() {
        int auxiliar = ultimoValorIngresaNodo.informacion;
        ultimoValorIngresaNodo = ultimoValorIngresaNodo.siguiente;
        tamano--;
        return auxiliar;
    }


    // Metodo para vaciar la pila
    public void VaciarPila() {
        while (!PilaVacia()) {
            EliminarNodo();
        }
    }

    // Metodo para mostrar el contenido de la pila
    public void MostrarValores() {
        Nodo recoorrido = ultimoValorIngresaNodo;

        while (recoorrido != null) {
            lista += recoorrido.informacion + "\n";
            recoorrido = recoorrido.siguiente;
        }

        JOptionPane.showMessageDialog(null, lista);
        lista = "";
    }

}
