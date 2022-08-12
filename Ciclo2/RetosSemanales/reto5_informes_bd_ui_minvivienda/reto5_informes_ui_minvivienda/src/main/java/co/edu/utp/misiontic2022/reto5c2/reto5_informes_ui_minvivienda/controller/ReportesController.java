package co.edu.utp.misiontic2022.reto5c2.reto5_informes_ui_minvivienda.controller;
import java.util.List;

import co.edu.utp.misiontic2022.reto5c2.reto5_informes_ui_minvivienda.model.dao.PrimerInformeDao;
import co.edu.utp.misiontic2022.reto5c2.reto5_informes_ui_minvivienda.model.vo.PrimerInformeVo;
import co.edu.utp.misiontic2022.reto5c2.reto5_informes_ui_minvivienda.model.dao.SegundoInformeDao;
import co.edu.utp.misiontic2022.reto5c2.reto5_informes_ui_minvivienda.model.vo.SegundoInformeVo;
import co.edu.utp.misiontic2022.reto5c2.reto5_informes_ui_minvivienda.model.dao.TercerInformeDao;
import co.edu.utp.misiontic2022.reto5c2.reto5_informes_ui_minvivienda.model.vo.TercerInformeVo;
import java.sql.SQLException;

public class ReportesController {
    private final PrimerInformeDao primerInformeDao;
    private final SegundoInformeDao segundoInformeDao;
    private final TercerInformeDao tercerInformeDao;
    
    public ReportesController() {
        this.primerInformeDao = new PrimerInformeDao();
        this.segundoInformeDao = new SegundoInformeDao();
        this.tercerInformeDao = new TercerInformeDao();
    }
    
    public List<PrimerInformeVo> listarInforme1() throws SQLException{
        return primerInformeDao.informeLider();
    }
    
    public List<SegundoInformeVo> listarInforme2() throws SQLException {
        return segundoInformeDao.informeLider();
    }
    
    public List<TercerInformeVo> listarInforme3() throws SQLException {
        return tercerInformeDao.informeComprasProyecto();  
    }
}
