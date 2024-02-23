package ListasTipoPila.listas_tipo_pila;

import javax.swing.JOptionPane;

public class ClasePrincipal {
    public static void main(String[] args) {
        int opcion = 0, nodo = 0;
        Pila pila = new Pila();

        do {

            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menu de Opciones\n\n"
                                + "1.  Insertar un nodo\n"
                                + "2.  Eliminar un nodo\n"
                                + "3.  Vaciar PILA\n"
                                + "4.  Mostrar contenido de la PIL\n"
                                + "0.  Salir.\n"));

                switch (opcion) {

                    case 1:

                        nodo = Integer
                                .parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor el valor del NODO "));
                        pila.InsertarNodo(nodo);
                        break;

                    case 2:

                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "Se ha eliminado un nodo con el valor: "
                                    + pila.EliminarNodo());
                        } else {
                            JOptionPane.showMessageDialog(null, "La PILA esta vacia");
                        }
                        break;

                    case 3:

                        if (!pila.PilaVacia()) {
                            pila.VaciarPila();
                            JOptionPane.showMessageDialog(null, "Se ha vaciado la PILA correctamente");
                        } else {
                            JOptionPane.showMessageDialog(null, "La PILA esta vacia");
                        }
                        break;

                    case 4:

                        pila.MostrarValores();
                        break;

                    case 0:

                        opcion = 0;
                        break;

                    default:

                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta, Favor de volver a intetar de nuevo");
                        break;

                }

            } catch (NumberFormatException e) {

            }

        } while (opcion != 0);

    }
}
