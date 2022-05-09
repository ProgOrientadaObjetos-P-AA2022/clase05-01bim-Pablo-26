
package paquete01;

public class Ejecutor03 {

    public static void main(String[] args) {
        
        String marca = "Lenovo";
        double costo = 670.50;
        UnidadDVD unidad = new UnidadDVD(marca, costo);
        //UnidadDVD unidad = new UnidadDVD("Dell", 800.75);
        
        
        String procesador = "AMD";
        
        Computadora computadora = new Computadora(procesador, unidad);
        
        System.out.printf("Computadora:\nProcesador: %s\n"
                + "Unidad de DVD: %s\n"
                + "Costo de Unidad DVD: %.2f\n",
                computadora.obtenerTipoProcesador(),
                computadora.obtenerUnidadDvd().obtenerMarca(),
                computadora.obtenerUnidadDvd().obtenerCosto());
    }

}
