package co.edu.utp.misiontic2022.reto5c2.reto5_informes_ui_minvivienda.model.dao;

import co.edu.utp.misiontic2022.reto5c2.reto5_informes_ui_minvivienda.model.vo.TercerInformeVo;
import co.edu.utp.misiontic2022.reto5c2.reto5_informes_ui_minvivienda.util.JDBCUtilities;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TercerInformeDao {
    public List<TercerInformeVo> informeComprasProyecto() throws SQLException {
        var response = new ArrayList<TercerInformeVo>();
        Connection connection = null;
        try {
            connection = JDBCUtilities.getConnection();
            var sql = "SELECT ID_Compra, Constructora, Banco_Vinculado "
                    + "FROM Proyecto p " 
                    + "JOIN Compra c ON p.ID_Proyecto =c.ID_Proyecto "
                    + "WHERE p.Ciudad ='Salento' "
                    + "AND c.Proveedor ='Homecenter';";
            var statement = connection.createStatement();
            var rset = statement.executeQuery(sql);
            while (rset.next()) {
                var informeCompraProyectos = new TercerInformeVo();
                informeCompraProyectos.setIdCompra(rset.getInt(1));
                informeCompraProyectos.setConstructora(rset.getString(2));
                informeCompraProyectos.setBancoVinculado(rset.getString(3));
                response.add(informeCompraProyectos);
            }
            rset.close();
            statement.close();
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
        return response;
    }
}
