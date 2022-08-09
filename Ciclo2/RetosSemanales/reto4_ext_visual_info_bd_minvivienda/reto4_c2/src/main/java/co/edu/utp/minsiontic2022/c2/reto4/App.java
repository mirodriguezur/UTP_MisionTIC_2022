package co.edu.utp.minsiontic2022.c2.reto4;

import co.edu.utp.minsiontic2022.c2.reto4.view.ReportesView;

public final class App {
    public static void main(String[] args) {
        var reportesView = new ReportesView();
        var banco = "Conavi";
        reportesView.proyectosFinanciadosPorBanco(banco);
    }
}
