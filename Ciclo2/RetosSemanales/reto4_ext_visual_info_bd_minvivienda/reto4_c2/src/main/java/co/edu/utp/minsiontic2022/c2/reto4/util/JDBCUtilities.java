package co.edu.utp.minsiontic2022.c2.reto4.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtilities {
    // Atributos de clase para gestión de connexión  con la base de datos
    private static final String UBICACION_DB = "ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:" + UBICACION_DB;
        return DriverManager.getConnection(url);

    }
}
