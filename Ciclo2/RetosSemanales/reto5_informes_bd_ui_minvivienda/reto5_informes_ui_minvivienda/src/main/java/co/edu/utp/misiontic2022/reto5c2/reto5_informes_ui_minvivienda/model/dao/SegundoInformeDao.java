package co.edu.utp.misiontic2022.reto5c2.reto5_informes_ui_minvivienda.model.dao;

import co.edu.utp.misiontic2022.reto5c2.reto5_informes_ui_minvivienda.model.vo.SegundoInformeVo;
import co.edu.utp.misiontic2022.reto5c2.reto5_informes_ui_minvivienda.util.JDBCUtilities;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SegundoInformeDao {
    public List<SegundoInformeVo> informeLider() throws SQLException {
        var response = new ArrayList<SegundoInformeVo>();
        Connection connection = null;
        try {
            connection = JDBCUtilities.getConnection();
            var sql = "SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad "
                    + "FROM Proyecto p " 
                    + "WHERE Ciudad IN('Santa Marta', 'Cartagena', 'Barranquilla') "
                    + "AND Clasificacion ='Casa Campestre'; ";
            var statement = connection.createStatement();
            var rset = statement.executeQuery(sql);
            while (rset.next()) {
                var informeProyectos = new SegundoInformeVo();
                informeProyectos.setIdProyecto(rset.getInt(1));
                informeProyectos.setConstructora(rset.getString(2));
                informeProyectos.setNumHabitaciones(rset.getInt(3));
                informeProyectos.setCiudad(rset.getString(4));
                response.add(informeProyectos);
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
