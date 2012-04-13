package org.Persistencia;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
/**
 * 
 * @author nacho
 *implementamos el mismo ejemplo del DEMO.
 */
public class UtilidadesDB {
	  /**
     * Cierra un PrepareStatement y loguea la SQLException en caso que ocurra.
     * 
     * @param pStmt PrepareStatement a cerrar
     */
    public static void close(PreparedStatement pStmt) {
        if (pStmt == null) {
            return;
        }
        try {
            pStmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Cierra un Statement y loguea la SQLException en caso que ocurra.
     * 
     * @param stmt Statement a cerrar
     */
    public static void close(Statement stmt) {
        if (stmt == null) {
            return;
        }
        try {
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Cierra un CallableStatement y loguea la SQLException en caso que ocurra.
     * 
     * @param cStmt CallableStatement a cerrar
     */
    public static void close(CallableStatement cStmt) {
        if (cStmt == null) {
            return;
        }
        try {
            cStmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Cierra un ResultSet y loguea la SQLException en caso que ocurra.
     * 
     * @param rs ResultSet a cerrar.
     */
    public static void close(ResultSet rs) {
        if (rs == null) {
            return;
        }
        try {
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Cierra un Connection y loguea la SQLException en caso que ocurra.
     * 
     * @param conn Connection a cerrar.
     */
    public static void close(Connection conn) {
        if (conn == null) {
            return;
        }
        try {
            if (!conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Convierte un java.sql.Timestamp a un java.util.Date.
     * 
     * @param Timestamp
     * @return Date
     */
    public static java.util.Date convertTimestampToUtilDate(Timestamp ts) {
        if (ts == null) {
            throw new IllegalArgumentException("No se permiten timestamps nulos.");
        }
        return new java.util.Date(ts.getTime());
    }

    /**
     * Convierte un java.util.Date a un java.sql.Timestamp.
     *
     * @param Date
     * @return Timestamp
     */
    public static Timestamp convertUtilDateToTimestamp(java.util.Date date) {
        if (date == null) {
            throw new IllegalArgumentException("Non se permiten dates nulos.");
        }
        return new Timestamp(date.getTime());
    }
}
