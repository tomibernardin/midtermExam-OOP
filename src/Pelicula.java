public abstract class Pelicula {
    private Cine cine;
    private String nombre;
    private String clasificacion;
    private Integer duracionEnMinutos;
    private String fechaDeFilmacion;
    private String nombreDelDirector;

    public Pelicula(Cine cine, String nombre, String clasificacion, Integer duracionEnMinutos, String fechaDeFilmacion, String nombreDelDirector) {
        this.cine = cine;
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.duracionEnMinutos = duracionEnMinutos;
        this.fechaDeFilmacion = fechaDeFilmacion;
        this.nombreDelDirector = nombreDelDirector;
    }

    public boolean esATP(){
        if (clasificacion.toUpperCase().equals("ATP")){
            System.out.println("Es ATP");
            return true;
        }
        System.out.println("No es ATP");
        return false;
    }
}
