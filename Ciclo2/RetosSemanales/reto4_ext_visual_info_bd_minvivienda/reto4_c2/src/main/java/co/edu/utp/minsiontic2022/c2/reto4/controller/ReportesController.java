package co.edu.utp.minsiontic2022.c2.reto4.controller;

import java.sql.SQLException;
import java.util.List;

import co.edu.utp.minsiontic2022.c2.reto4.model.dao.ComprasDeLiderDao;
import co.edu.utp.minsiontic2022.c2.reto4.model.dao.DeudasPorProyectoDao;
import co.edu.utp.minsiontic2022.c2.reto4.model.dao.ProyectoBancoDao;
import co.edu.utp.minsiontic2022.c2.reto4.model.vo.ComprasDeLiderVo;
import co.edu.utp.minsiontic2022.c2.reto4.model.vo.DeudasPorProyectoVo;
import co.edu.utp.minsiontic2022.c2.reto4.model.vo.ProyectoBancoVo;

public class ReportesController {
    //TODO Implementar la clase
    private final ProyectoBancoDao proyectoBancoDao;
    private final DeudasPorProyectoDao deudasPorProyectoDao;
    private final ComprasDeLiderDao comprasDeLiderDao;

    public ReportesController() {
        this.proyectoBancoDao = new ProyectoBancoDao();
        this.deudasPorProyectoDao = new DeudasPorProyectoDao();
        this.comprasDeLiderDao = new ComprasDeLiderDao();
    }

    public List<ProyectoBancoVo> listarInfoProyectosPorBanco(String banco) throws SQLException{
        var result = proyectoBancoDao.infoProyectosPorBanco(banco);
        return result;
    }

    public List<DeudasPorProyectoVo> listarInfoDeudasPorProyecto(Double limiteInferior) throws SQLException{
        var result = deudasPorProyectoDao.infoDeudasPorProyecto(limiteInferior);
        return result;
    }

    public List<ComprasDeLiderVo> listarComprasDeLider() throws SQLException{
        var result = comprasDeLiderDao.infoComprasLider();
        return result;
    }


}
