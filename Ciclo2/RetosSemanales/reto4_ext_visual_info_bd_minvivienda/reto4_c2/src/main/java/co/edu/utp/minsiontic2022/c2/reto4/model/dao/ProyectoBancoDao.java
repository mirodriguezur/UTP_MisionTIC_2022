package co.edu.utp.minsiontic2022.c2.reto4.model.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.edu.utp.minsiontic2022.c2.reto4.model.vo.ProyectoBancoVo;
import co.edu.utp.minsiontic2022.c2.reto4.util.JDBCUtilities;

public class ProyectoBancoDao {

    public List<ProyectoBancoVo> infoProyectosPorBanco(String banco) throws SQLException{
        var response = new ArrayList<ProyectoBancoVo>();
        Connection conn = null;
        try {
            conn = JDBCUtilities.getConnection();
            var sql = "SELECT p.ID_Proyecto, p.Constructora, p.Ciudad, p.Clasificacion, t.Estrato, l.Nombre ||' '|| l.Primer_Apellido ||' '|| l.Segundo_Apellido " 
                    + "FROM Proyecto p "
                    + "JOIN Tipo t USING (ID_Tipo) "
                    + "JOIN Lider l USING (ID_Lider) "
                    + "WHERE p.Banco_Vinculado = '" + banco + "' "
                    + "ORDER BY p.Fecha_Inicio DESC, p.Ciudad, p.Constructora;";
            var statement = conn.createStatement();
            var rset = statement.executeQuery(sql);
            while (rset.next()) {
                var proyectoPorBanco = new ProyectoBancoVo();
                proyectoPorBanco.setId(rset.getInt(1));
                proyectoPorBanco.setConstructora(rset.getString(2));
                proyectoPorBanco.setCiudad(rset.getString(3));
                proyectoPorBanco.setClasificacion(rset.getString(4));
                proyectoPorBanco.setEstrato(rset.getInt(5));
                proyectoPorBanco.setLider(rset.getString(6));
                response.add(proyectoPorBanco);
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