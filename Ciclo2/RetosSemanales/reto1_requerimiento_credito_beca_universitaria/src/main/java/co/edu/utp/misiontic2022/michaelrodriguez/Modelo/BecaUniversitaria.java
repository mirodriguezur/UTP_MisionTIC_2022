package co.edu.utp.misiontic2022.michaelrodriguez.Modelo;

//import java.util.concurrent.TimeoutException;

public class BecaUniversitaria {
    
    private double pMonto;
    private double pInteres;
    private int pTiempo;

    public BecaUniversitaria(int pTiempo, double pMonto, double pInteres){
        this.pMonto = pMonto;
        this.pInteres = pInteres;
        this.pTiempo = pTiempo;
    }

    public BecaUniversitaria(){
        this.pMonto = 0.0;
        this.pInteres = 0.0;
        this.pTiempo = 0;
    }

    public double calcularInteresSimple(){
        return Math.round(pMonto * (pInteres/100) * pTiempo);
    }

    public double calcularInteresCompuesto(){
        return Math.round(pMonto * (Math.pow(1+(pInteres/100),pTiempo) - 1));
    }

    public String compararInversion(int pTiempo, double pMonto, double pInteres){
        this.pTiempo = pTiempo;
        this.pMonto = pMonto;
        this.pInteres = pInteres;
        double diferencia = Math.round(calcularInteresCompuesto() - calcularInteresSimple());
        return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
    }

    public String compararInversion() {
        if (this.pTiempo == 0 && this.pMonto == 0.0 && this.pInteres == 0.0){
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }
        double diferencia = Math.round(calcularInteresCompuesto() - calcularInteresSimple());
        return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
    }
}
