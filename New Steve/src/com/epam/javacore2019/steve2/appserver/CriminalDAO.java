package com.epam.javacore2019.steve2.appserver;

import java.util.List;

public interface CriminalDAO {

    ModelCriminal get(int id);

    //List<ModelCriminal> getAll;

    List<ModelCriminal> getAll(String filter);

    void create(ModelCriminal model);

    void update(ModelCriminal model);

    void delete(int id);

}

//обращаемся к СЕРВИСУ, говоря, что мы хотим - сохранить, достать...
//сервис, в свою очередь, в зависимости от параметров выберет свой DATA ACCESS OBJECT и туда уже эти данные фиганет
//для добавления таблиц надо подумать


//tomcat! сделать web application архив, запускаем, делаем сервлеты, в них пихаем хэндлеры
//jdbc подклюючаем джарник как зависимость в проект, после чего можно исполнять query, работать со структурами БД, удаление/выборка/апдейт
//DAO - объект доступа к данным. т.е. апишка для работы с конкретной имплементацией хранения данных, его можно подменять в зависимости от того, гшде, как и какие данные в каком виде лежат,
//сама логика приложенрия не меняется
//сервисы - то, что держит в себе DAO и позволяет его выбирать
//
