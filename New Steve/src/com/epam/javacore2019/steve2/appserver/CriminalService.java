package com.epam.javacore2019.steve2.appserver;

import com.epam.javacore2019.steve2.appserver.dao.CriminalDAO;

public class CriminalService {

    CriminalDAO dao;

    public CriminalService(){
        dao = CriminalDAO.createDAO();
        //dao = SteveDBCCriminalDAO
        //switch между разными DAO при использовании разных DBC
    }

    public ModelCriminal getCriminal(int id){
        return dao.get(id);
    }
}
