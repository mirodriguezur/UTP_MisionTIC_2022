package co.edu.misiontic2022.michaelrodriguez.Modelo;

public class Computadores {
    private final static char CONSUMO_W = 'F';
    private final static Double PRECIO_BASE = 100.0;
    private final static Integer PESO_BASE = 5;

    protected Double precioBase;
    protected Integer peso;
    protected char consumoW;

    public Computadores(){
        this.precioBase = PRECIO_BASE;
        this.consumoW = CONSUMO_W;
        this.peso = PESO_BASE;
    }

    public Computadores(Double precioBase, Integer peso){
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoW = CONSUMO_W;
    }

    public Computadores(Double precioBase, Integer peso, char consumoW){
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoW = consumoW;
    }

    // Métodos

    public Double calcularPrecio() {
        Double adicion = 0.0;

        switch (consumoW) {
            case 'A':
                adicion = 100.0;
                break;
            case 'B':
                adicion = 80.0;
                break;
            case 'C':
                adicion = 60.0;
                break;
            case 'D':
                adicion = 50.0;
                break;
            case 'E':
                adicion = 30.0;
                break;
            case 'F':
                adicion = 10.0;
                break;
            default:
                break;
        }

        if (peso >= 0 && peso < 19){
            adicion += 10.0;
        } else if (peso >= 20 && peso < 49){
            adicion += 50.0;
        } else if (peso >= 50 && peso < 79){
            adicion += 80.0;
        } else {
            adicion += 100;
        }

        return adicion;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    // Getters
    
    
}
