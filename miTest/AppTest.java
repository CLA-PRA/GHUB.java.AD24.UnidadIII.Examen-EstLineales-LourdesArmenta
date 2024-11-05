package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import pila.Pila;
import cola.Cola;
import lista.Lista;
import lista.PosicionIlegalException;
import java.util.List;



class AppTest {
    
    private listaDoble.Lista<Integer> listaDoble;
    private listaDoble.Lista<Integer> lista1;
    private listaDoble.Lista<Integer> lista2;

   

    @Test
    public void testListaDoble()  throws listaDoble.PosicionIlegalException{
        listaDoble = new listaDoble.Lista<>();
        assertTrue(listaDoble.esVacia(), "La lista debería estar vacía inicialmente");
        assertEquals(0, listaDoble.getTamanio(), "El tamaño de la lista debería ser 0 inicialmente");
        listaDoble.agregar(1); // Suponiendo que hay un método agregar en la clase Lista
        assertFalse(listaDoble.esVacia(), "La lista no debería estar vacía después de agregar un elemento");
        assertEquals(1, listaDoble.getTamanio(), "El tamaño de la lista debería ser 1 después de agregar un elemento");
        listaDoble.insertar(5,1);
        assertEquals(2, listaDoble.getTamanio(), "El tamaño de la lista debería ser 2 después de agregar un elemento");
        listaDoble.insertar(10,0);
        assertEquals(10,listaDoble.getValor(0),"El valor del elemento en la posición 0 debe ser 10");
        listaDoble.remover(0);
        assertEquals(1,listaDoble.getValor(0),"El valor del elemento en la posición 0 debe ser 1");
        listaDoble.limpiar();
        assertEquals(0,listaDoble.getTamanio(),"El tamaño de la lista debe ser cero");


    
    }
    @Test
    public void testGetLista() {
        listaDoble = new listaDoble.Lista<>();
        listaDoble.agregar(1); // Suponiendo que hay un método agregar en la clase Lista
        listaDoble.agregar(2);
        listaDoble.agregar(3);

        List<Integer> elementos = listaDoble.getLista();
        assertEquals(3, elementos.size(), "El tamaño de la lista debería ser 3");
        assertEquals(1, elementos.get(0), "El primer elemento debería ser 1");
        assertEquals(2, elementos.get(1), "El segundo elemento debería ser 2");
        assertEquals(3, elementos.get(2), "El tercer elemento debería ser 3");
    }

    @Test
    public void testRemoverPorValor() {
        listaDoble = new listaDoble.Lista<>();
        listaDoble.agregar(1); // Suponiendo que hay un método agregar en la clase Lista
        listaDoble.agregar(2);
        listaDoble.agregar(3);

        int indiceEliminado = listaDoble.removerPorValor(2);
        assertEquals(1, indiceEliminado, "El índice del elemento eliminado debería ser 1");
        assertEquals(2, listaDoble.getTamanio(), "El tamaño de la lista debería ser 2 después de eliminar un elemento");

        List<Integer> elementos = listaDoble.getLista();
        assertEquals(1, elementos.get(0), "El primer elemento debería ser 1");
        assertEquals(3, elementos.get(1), "El segundo elemento debería ser 3");
    }

    @Test
    public void testPodarLista() {
        listaDoble = new listaDoble.Lista<>();
        listaDoble.agregar(1); // Suponiendo que hay un método agregar en la clase Lista
        listaDoble.agregar(2);
        listaDoble.agregar(2);
        listaDoble.agregar(3);
        listaDoble.agregar(3);
        listaDoble.agregar(3);

        listaDoble.podarLista();

        List<Integer> elementos = listaDoble.getLista();
        assertEquals(3, elementos.size(), "El tamaño de la lista debería ser 3 después de podar");
        assertEquals(1, elementos.get(0), "El primer elemento debería ser 1");
        assertEquals(2, elementos.get(1), "El segundo elemento debería ser 2");
        assertEquals(3, elementos.get(2), "El tercer elemento debería ser 3");
    }

    @Test
    public void testConcatenarListas() {
        lista1 = new listaDoble.Lista<>();
        lista2 = new listaDoble.Lista<>();
        lista1.agregar(1); // Suponiendo que hay un método agregar en la clase Lista
        lista1.agregar(2);
        lista1.agregar(3);

        lista2.agregar(4);
        lista2.agregar(5);
        lista2.agregar(6);

        lista1.concatenarListas(lista2);

        List<Integer> elementos = lista1.getLista();
        assertEquals(6, elementos.size(), "El tamaño de la lista debería ser 6 después de concatenar");
        assertEquals(1, elementos.get(0), "El primer elemento debería ser 1");
        assertEquals(2, elementos.get(1), "El segundo elemento debería ser 2");
        assertEquals(3, elementos.get(2), "El tercer elemento debería ser 3");
        assertEquals(4, elementos.get(3), "El cuarto elemento debería ser 4");
        assertEquals(5, elementos.get(4), "El quinto elemento debería ser 5");
        assertEquals(6, elementos.get(5), "El sexto elemento debería ser 6");
    }

    
    
}