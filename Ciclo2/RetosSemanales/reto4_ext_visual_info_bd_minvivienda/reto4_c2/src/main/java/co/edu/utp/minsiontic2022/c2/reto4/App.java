package co.edu.utp.minsiontic2022.c2.reto4;

import co.edu.utp.minsiontic2022.c2.reto4.view.ReportesView;

public final class App {
    public static void main(String[] args) {
        // Desbloquear para probar primer enunciado.
        /* 
        var reportesView = new ReportesView();
        var banco = "Conavi";
        reportesView.proyectosFinanciadosPorBanco(banco);
        */
        // Desbloquear para probar segundo enunciado.
        var reportesView = new ReportesView();
        var limiteInferior = 50_000d; 
        reportesView.totalAdeudadoPorProyectosSuperioresALimite(limiteInferior);
    }
}
