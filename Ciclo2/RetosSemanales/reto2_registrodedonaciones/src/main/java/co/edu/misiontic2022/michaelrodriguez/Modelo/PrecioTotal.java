package co.edu.misiontic2022.michaelrodriguez.Modelo;

public class PrecioTotal {
    private Double totalComputadores = 0.0;
    private Double totalComputadoresPortatiles = 0.0;
    private Double totalComputadoresMesa = 0.0;
    private Computadores[] listaComputadores;

    // Constructor
    public PrecioTotal(Computadores[] pComputadores){
        this.listaComputadores = pComputadores;
    }

    public void mostrarTotales(){
        for(Computadores computador: listaComputadores){
            totalComputadores += computador.getPrecioBase() + computador.calcularPrecio();
            if (computador.getClass() == ComputadoresPortatiles.class){
                totalComputadoresPortatiles += computador.getPrecioBase() + computador.calcularPrecio();
            } else if (computador.getClass() == ComputadoresMesa.class){
                totalComputadoresMesa += computador.getPrecioBase() + computador.calcularPrecio();
            }      
        }

        System.out.println("La suma del precio de los computadores es de " + totalComputadores);
        System.out.println("La suma del precio de los computadores de mesa es de " + totalComputadoresMesa);
        System.out.println("La suma del precio de los computadores portátiles es de " + totalComputadoresPortatiles);
    }
}
