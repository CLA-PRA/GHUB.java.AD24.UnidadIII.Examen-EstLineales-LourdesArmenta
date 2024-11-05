package listaDoble;

public class Nodo <T>{
    //Atributo valor de tipo T. Almacena la referencia al
    //objeto que se guarda en el nodo
    private T valor;
    //Referencia al siguiente nodo enlazado
    Nodo<T> siguiente;
    Nodo<T> anterior;
    //constructor por defector
    public Nodo(){
        valor =null;
        siguiente=null;
        anterior =null;
    }
    //constructor llenp
    public Nodo(T valor, Nodo<T> siguiente, Nodo<T> anterior) {
        this.valor = valor;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    //devuelve el valor
    public T getValor(){
        return valor;
    }

    //modificar el valor
    public void setValor(T valor){
        this.valor=valor;
    }

    //devolver el atributo siguiente
    public Nodo<T> getSiguiente(){
        return siguiente;
    }

    //modificar el valor de siguiente
    public void setSiguiente(Nodo<T> siguiente){
        this.siguiente = siguiente;
    }
    public Nodo<T> getAnterior() {
        return anterior;
    }
    public void setAnterior(Nodo<T> anterior) {
        this.anterior = anterior;
    }
    

}
