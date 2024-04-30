public class Enemigo extends Personaje {

    private int nivelAgresividad;

    // Constructor
    public Enemigo(String nombre, String poder, int vidas, int nivelAgresividad) {
        super(nombre, poder, vidas);
        this.nivelAgresividad = nivelAgresividad;
    }

    // Getter y Setter específico para nivelAgresividad
    public int getNivelAgresividad() {
        return nivelAgresividad;
    }

    public void setNivelAgresividad(int nivelAgresividad) {
        this.nivelAgresividad = nivelAgresividad;
    }

    @Override
    public void actuar() {

        System.out.println("El enemigo está mostrando su agresividad.");
    }


}