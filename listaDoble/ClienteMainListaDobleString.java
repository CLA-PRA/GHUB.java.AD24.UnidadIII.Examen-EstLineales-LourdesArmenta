package listaDoble;

public class ClienteMainListaDobleString {
    public static void main(String[] args) throws PosicionIlegalException {
        Lista<String> lista = new Lista<String>();
        String cadena1="Maria";
        String cadena2="Pedro";
        String cadena3="Juan";
        String cadena4="Alberto";
        String cadena5="Lorena";
        //agregar los nombres de mi lista
        lista.agregar(cadena1);
        lista.agregar(cadena2);
        lista.agregar(cadena3);
        lista.agregar(cadena4);
        lista.agregar(cadena5);
        for (int i=0;i<lista.getTamanio();i++){
            System.out.println(lista.getValor(i));
        }
        System.out.println();
        lista.remover(2);
        for (int i=0;i<lista.getTamanio();i++){
            System.out.println(lista.getValor(i));
        }

       // lista.remover(4);
       lista.insertar("Francisco", 4);
       System.out.println();
       for (int i=0;i<lista.getTamanio();i++){
        System.out.println(lista.getValor(i));

        //lista.insertar("Monica", 7);
    }

    }

}
