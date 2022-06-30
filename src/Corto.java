public class Corto extends Pelicula{
    private String origen;

    public Corto(Cine cine, String nombre, String clasificacion, Integer duracionEnMinutos, String fechaDeFilmacion, String nombreDelDirector, String origen) {
        super(cine, nombre, clasificacion, duracionEnMinutos, fechaDeFilmacion, nombreDelDirector);
        this.origen = origen;
    }

    public boolean esNacional(){
        if (origen.toUpperCase().equals("NACIONAL")){
            System.out.println("Es nacional");
            return true;
        }
        System.out.println("Es internacional");
        return false;
    }
}
