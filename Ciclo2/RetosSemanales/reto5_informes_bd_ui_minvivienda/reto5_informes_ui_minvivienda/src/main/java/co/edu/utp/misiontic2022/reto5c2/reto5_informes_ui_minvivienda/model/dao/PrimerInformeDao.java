package co.edu.utp.misiontic2022.reto5c2.reto5_informes_ui_minvivienda.model.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import co.edu.utp.misiontic2022.reto5c2.reto5_informes_ui_minvivienda.model.vo.PrimerInformeVo;
import co.edu.utp.misiontic2022.reto5c2.reto5_informes_ui_minvivienda.util.JDBCUtilities;
import java.sql.SQLException;

public class PrimerInformeDao {
    public List<PrimerInformeVo> informeLider() throws SQLException {
        var response = new ArrayList<PrimerInformeVo>();
        Connection connection = null;
        try {
            connection = JDBCUtilities.getConnection();
            var sql = "SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia "
                    + "FROM Lider " 
                    + "ORDER BY Ciudad_Residencia;";
            var statement = connection.createStatement();
            var rset = statement.executeQuery(sql);
            while (rset.next()) {
                var informePorLider = new PrimerInformeVo();
                informePorLider.setIdLider(rset.getInt(1));
                informePorLider.setName(rset.getString(2));
                informePorLider.setPrimerApellido(rset.getString(3));
                informePorLider.setCiudadResidencia(rset.getString(4));
                response.add(informePorLider);
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
