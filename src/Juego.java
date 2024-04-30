import java.util.ArrayList;
import java.util.List;

public class Juego {
    private String nombre;
    private List<Personaje> listaPersonajes;

    // Constructor
    public Juego(String nombre) {
        this.nombre = nombre;
        this.listaPersonajes = new ArrayList<>();
    }

    // Getter y Setter para el nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para agregar un personaje a la lista
    public void agregarPersonaje(Personaje personaje) {
        listaPersonajes.add(personaje);
    }
}
