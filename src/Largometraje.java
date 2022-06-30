public class Largometraje extends Pelicula implements Comparable{
    private String tema;
    private Integer cantidadDeActores;

    public Largometraje(Cine cine, String nombre, String clasificacion, Integer duracionEnMinutos, String fechaDeFilmacion, String nombreDelDirector, String tema, Integer cantidadDeActores) {
        super(cine, nombre, clasificacion, duracionEnMinutos, fechaDeFilmacion, nombreDelDirector);
        this.tema = tema;
        this.cantidadDeActores = cantidadDeActores;
    }

    @Override
    public Integer compareTo(Object o) {
        Largometraje l2 = (Largometraje) o;
        if (this.getCantidadDeActores() == l2.getCantidadDeActores()){
            System.out.println("Misma cantidad de actores");
            return 0;
        }else if (this.getCantidadDeActores() > l2.getCantidadDeActores()){
            System.out.println("L1 tiene MAS actores que L2");
            return 1;
        }else {
            System.out.println("L1 tiene MENOS actores que L2");
            return -1;
        }
    }

    public Integer getCantidadDeActores() {
        return cantidadDeActores;
    }
}
