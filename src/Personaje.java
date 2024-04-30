public class Personaje {

    private String nombre;
    private String poder;
    private int vidas;


    public Personaje(String nombre, String poder, int vidas) {
        this.nombre = nombre;
        this.poder = poder;
        this.vidas = vidas;
    }

    // Getter y Setter para el nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para el poder
    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    // Getter y Setter para las vidas
    public int getVidas() {
        return vidas;
    }

    public String informeVidas() {
        return "Tengo " + vidas + " vidas";
    }

    public void actuar() {
        // Este método puede ser implementado de forma diferente en las subclases
        System.out.println("El personaje está actuando.");
    }

}
