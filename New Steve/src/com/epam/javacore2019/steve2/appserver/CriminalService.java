package com.epam.javacore2019.steve2.appserver;

public class CriminalService {

    CriminalDAO dao;

    public CriminalService(){
        dao = JDBCCriminalDAO();
        //dao = SteveDBCCriminalDAO
        //switch между разными DAO при использовании разных DBC
    }

    public ModelCriminal getCriminal(int id){
        return dao.get(id);
    }
}
