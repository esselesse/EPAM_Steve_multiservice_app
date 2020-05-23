package com.epam.javacore2019.steve2.appserver.dao;

import java.util.List;

import com.epam.javacore2019.steve2.appserver.ModelCriminal;

public class SteveDBCriminalDAO implements CriminalDAO {

    @Override
    public ModelCriminal get(int id) {
        return null;
    }

    @Override
    public List<ModelCriminal> getAll() {
        //connect to SteveDB and perform SELECT * FROM Criminals
        return null;
    }

    @Override
    public List<ModelCriminal> getAll(String filter) {
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
