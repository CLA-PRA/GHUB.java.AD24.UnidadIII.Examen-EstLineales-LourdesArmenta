package listaDoble;

public class ClienteMainListaDoble {
    public static void main(String[] args) {
        try{
            Lista<Integer> lista = new Lista<Integer>();
            //agregar elementos a la lista
            lista.agregar(12);
            lista.agregar(13);
            lista.agregar(20);
            //imprimir los elementos agregados
            System.out.println("Dato en la posicion 0:"+lista.getValor(0));
            System.out.println("Dato en la posicion 1:"+lista.getValor(1));
            System.out.println("Dato en la posicion 2:"+lista.getValor(2));
            //insertar
            lista.insertar(15, 2);
            //insertar
            lista.insertar(16,3);
             //imprimir los elementos agregados
             System.out.println("Dato en la posicion 0:"+lista.getValor(0));
             System.out.println("Dato en la posicion 1:"+lista.getValor(1));
             System.out.println("Dato en la posicion 2:"+lista.getValor(2));
             System.out.println("Dato en la posicion 3:"+lista.getValor(3));
             System.out.println("Dato en la posicion 4:"+lista.getValor(4));
             //remover al inicio de la lista
             lista.remover(0);
             for(int i=0;i<lista.getTamanio();i++){
                System.out.println("Dato en la posicion "+i+":"+lista.getValor(i));
             }
             //remover al final de la lista
             lista.remover(3);
             for(int i=0;i<lista.getTamanio();i++){
                System.out.println("Dato en la posicion "+i+":"+lista.getValor(i));
             }
             //remover en medio de la list
             lista.remover(1);
             for(int i=0;i<lista.getTamanio();i++){
                System.out.println("Dato en la posicion "+i+":"+lista.getValor(i));
             }



            


        }
        catch (PosicionIlegalException e){
            e.printStackTrace();
            
        }


        
    }
    
}
