package com.epam.javacore2019.steve2.appserver.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.epam.javacore2019.steve2.appserver.ModelCriminal;

public class JDBCCriminalDAO implements CriminalDAO{
    @Override
    public ModelCriminal get(int id) {
        return null;
    }

    @Override
    public List<ModelCriminal> getAll() {
        //connect to Postgre DB or another SQLDB and perform SELECT * FROM Criminals
        //todo
        return null;
    }

    @Override
    public List<ModelCriminal> getAll(String filter) {
        try {
            java.sql.Connection connection = java.sql.DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres",
                    "postgres", "postgres"
            );
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM public.\"Criminals\"");
            ResultSet resultSet = statement.executeQuery();
            ModelCriminal.Builder builder = new ModelCriminal.Builder();
            builder.setId(1);
            builder.setLastName("Soprano");
            ModelCriminal criminal = builder.build();
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void create(ModelCriminal model) {

    }

    @Override
    public void update(ModelCriminal model) {

    }

    @Override
    public void delete(int id) {

    }
}
