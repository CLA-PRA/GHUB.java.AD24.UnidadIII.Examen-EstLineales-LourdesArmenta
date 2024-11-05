package lista;
import java.util.Objects;


public class Persona implements Comparable<Persona> {
    
    private int id;
    private String nombre ;
    private int edad;

    public Persona() {
        this.id = 0;
        this.nombre = "sin nombre";
        this.edad = 0;
    }

    public Persona(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        
        return "ID = "+id+" Nombre = "+nombre + " Edad = "+edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return id == persona.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Persona otraPersona) {
        return Integer.compare(this.id, otraPersona.id);
    }

    

}
