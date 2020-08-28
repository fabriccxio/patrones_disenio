package com.caidosdelcatre.fack.repository.impl;

import com.caidosdelcatre.fack.model.Usuario;
import com.caidosdelcatre.fack.repository.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DAOImpl implements DAO {

    @Override
    public void insertUsario(Usuario usuario) throws Exception {
        String insertSQL = "INSERT INTO USER (ID,NOMBRE,APELLIDO,AUTO) VALUES ('" +
                usuario.id + "','" +
                usuario.nombre + "','" +
                usuario.apellido + "','" +
                usuario.auto + "')";

        Connection connection = getConnection();
        try {
            Statement statement = connection.createStatement();
            statement.execute(insertSQL);

        } catch (Exception e) {
            connection.rollback();
            e.printStackTrace();
            throw new Exception("ERROR en Insersion de usuairo:" + e.getCause());
        } finally {
            connection.close();
        }
    }

    private Connection getConnection() throws Exception {
        String url = "jdbc:h2:tcp://localhost:9092/~/tmp/h2dbs/testdb";
        String user = "sa";
        String passwd = "sa";

        Connection con = DriverManager.getConnection(url, user, passwd);
        return con;
    }


}
