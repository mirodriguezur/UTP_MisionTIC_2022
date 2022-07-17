package co.edu.misiontic2022.michaelrodriguez.Modelo;

public class ComputadoresPortatiles extends Computadores {
    private final static Integer PULGADAS_BASE = 20;
    private Integer pulgadas;
    private boolean camaraITG;

    // Constructor
    public ComputadoresPortatiles(){
        super();
        this.camaraITG = false;
        this.pulgadas = PULGADAS_BASE;
    }

    public ComputadoresPortatiles(Double precioBase, Integer peso){
        super(precioBase, peso);
        this.camaraITG = false;
        this.pulgadas = PULGADAS_BASE;
    }

    public ComputadoresPortatiles(Double precioBase, Integer peso, char consumoW, Integer pulgadas, boolean camaraITG){
        super(precioBase, peso, consumoW);   
        this.pulgadas = pulgadas;
        this.camaraITG = camaraITG;
    }

    public Double calcularPrecio(){
        Double adicion = 0.0;
        if (pulgadas > 40) {
            adicion = super.precioBase * 0.3;
        }
        if (camaraITG){
            adicion += 50.0;
        }
        adicion += super.calcularPrecio();
        return adicion;
    }
}
