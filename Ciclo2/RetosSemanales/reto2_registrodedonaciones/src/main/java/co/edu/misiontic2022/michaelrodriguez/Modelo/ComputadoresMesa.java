package co.edu.misiontic2022.michaelrodriguez.Modelo;

public class ComputadoresMesa extends Computadores {
    private final static Integer ALMACENAMIENTO_BASE = 50;

    private Integer almacenamiento;

    // Constructor
    public ComputadoresMesa(){
        super();
        this.almacenamiento = ALMACENAMIENTO_BASE;
    }

    public ComputadoresMesa(Double precioBase, Integer peso){
        super(precioBase, peso);
        this.almacenamiento = ALMACENAMIENTO_BASE;
    }

    public ComputadoresMesa(Double precioBase, Integer peso, char consumoW, Integer almacenamiento){
        super(precioBase, peso, consumoW);
        this.almacenamiento = almacenamiento;
    }

    // Métodos 
    public Double calcularPrecio(){
        Double adicion = 0.0;
        if (almacenamiento > 100) {
            adicion = 50.0;
        }

        adicion += super.calcularPrecio();

        return adicion;
    }

    public Integer getCarga(){
        return almacenamiento;
    }
}