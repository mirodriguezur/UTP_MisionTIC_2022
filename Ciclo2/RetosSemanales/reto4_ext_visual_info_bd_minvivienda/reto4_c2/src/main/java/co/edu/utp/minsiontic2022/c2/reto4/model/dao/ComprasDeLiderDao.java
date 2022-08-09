package co.edu.utp.minsiontic2022.c2.reto4.model.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.edu.utp.minsiontic2022.c2.reto4.model.vo.ComprasDeLiderVo;
import co.edu.utp.minsiontic2022.c2.reto4.util.JDBCUtilities;

public class ComprasDeLiderDao {
    public List<ComprasDeLiderVo> infoComprasLider() throws SQLException{
        var response = new ArrayList<ComprasDeLiderVo>();
        Connection conn = null;
        try {
            conn = JDBCUtilities.getConnection();
            var sql = "SELECT l.Nombre ||' '|| l.Primer_Apellido ||' '|| l.Segundo_Apellido AS LIDER, SUM(c.Cantidad * mc.Precio_Unidad) AS VALOR " 
                    + "FROM Lider l "
                    + "JOIN Proyecto p ON (l.ID_Lider = p.ID_Lider) "
                    + "JOIN Compra c ON (p.ID_Proyecto = c.ID_Proyecto) "
                    + "JOIN MaterialConstruccion mc ON (c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion) "
                    + "GROUP BY LIDER "
                    + "ORDER BY VALOR DESC " 
                    + "LIMIT 10;";
            var statement = conn.createStatement();
            var rset = statement.executeQuery(sql);
            while (rset.next()) {
                var comprasDeLider = new ComprasDeLiderVo();
                comprasDeLider.setLider(rset.getString(1));
                comprasDeLider.setValor(rset.getDouble(2));
                response.add(comprasDeLider);
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
