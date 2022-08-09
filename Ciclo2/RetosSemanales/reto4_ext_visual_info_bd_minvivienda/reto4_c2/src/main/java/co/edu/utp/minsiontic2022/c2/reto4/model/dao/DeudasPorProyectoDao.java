package co.edu.utp.minsiontic2022.c2.reto4.model.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.edu.utp.minsiontic2022.c2.reto4.model.vo.DeudasPorProyectoVo;
import co.edu.utp.minsiontic2022.c2.reto4.util.JDBCUtilities;

public class DeudasPorProyectoDao {
    public List<DeudasPorProyectoVo> infoDeudasPorProyecto(Double limiteInferior) throws SQLException{
        var response = new ArrayList<DeudasPorProyectoVo>();
        Connection conn = null;
        try {
            var limite = limiteInferior.intValue();
            conn = JDBCUtilities.getConnection();
            var sql = "WITH " 
                    + "deudas_totales AS ( "
                    + "SELECT c.ID_Proyecto, SUM(mc.Precio_Unidad * c.Cantidad) AS VALOR "
                    + "FROM Compra c "
                    + "JOIN MaterialConstruccion mc USING (ID_MaterialConstruccion) "
                    + "WHERE c.Pagado = 'No' "
                    + "GROUP BY c.ID_Proyecto " 
                    + ") "
                    + "SELECT * "
                    + "FROM deudas_totales "
                    + "WHERE VALOR > " + limite
                    + " ORDER BY VALOR DESC;";
            var statement = conn.createStatement();
            var rset = statement.executeQuery(sql);
            while (rset.next()) {
                var deudasPorProyecto = new DeudasPorProyectoVo();
                deudasPorProyecto.setId(rset.getInt(1));
                deudasPorProyecto.setValor(rset.getDouble(2));
                response.add(deudasPorProyecto);
            }
            rset.close();
            statement.close();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    return response;
    }
}