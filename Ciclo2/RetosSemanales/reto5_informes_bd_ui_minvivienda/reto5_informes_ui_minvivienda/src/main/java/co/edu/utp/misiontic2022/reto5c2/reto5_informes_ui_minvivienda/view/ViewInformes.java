package co.edu.utp.misiontic2022.reto5c2.reto5_informes_ui_minvivienda.view;

import co.edu.utp.misiontic2022.reto5c2.reto5_informes_ui_minvivienda.controller.ReportesController;
import co.edu.utp.misiontic2022.reto5c2.reto5_informes_ui_minvivienda.model.vo.PrimerInformeVo;
import static co.edu.utp.misiontic2022.reto5c2.reto5_informes_ui_minvivienda.view.InformesView.controller;
import java.sql.SQLException;

public class ViewInformes {
    private ReportesController reportesController;
    
    public ViewInformes() {
        this.reportesController = new ReportesController();
    }
    
    
    public void listadoTotalInforme1(){
        try {
            var informe1 = controller.listarInforme1();
            String texto = "";
            for(PrimerInformeVo informe:informe1 ){
                texto += informe.getIdLider();
                texto += "\t";
                texto += informe.getName();
                texto += "\t";
                texto += informe.getPrimerApellido();
                texto += "\t";
                texto += informe.getCiudadResidencia();
                texto += "\n";
            }
            System.out.print(texto);
        } catch (SQLException ex) {
            System.err.println("Error: "+ex);
        }
    }
}
