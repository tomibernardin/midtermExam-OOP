public class Main {
    public static void main(String[] args) {
        Cine atlas = new Cine("Atlas", "Alberdi 111", 50);
        Cine hoyts = new Cine("Hoyts", "Unicenter", 90);
        Corto corto = new Corto(atlas, "El Corto","ATP", 30, "2021", "Campanella", "Nacional");
        Largometraje largo1 = new Largometraje(hoyts, "El Largo", "Menor 18", 200, "2020", "Szifron", "Indeterminado", 5);
        Largometraje largo2 = new Largometraje(hoyts, "El Largo", "Menor 18", 200, "2020", "Szifron", "Indeterminado", 6);

        System.out.println("FUNCIONALIDADES DE CORTO");
        corto.esATP();
        corto.esNacional();
        System.out.println("FUNCIONALIDADES DE LARGOMETRAJE");
        largo1.esATP();
        largo1.compareTo(largo2);
    }
}
