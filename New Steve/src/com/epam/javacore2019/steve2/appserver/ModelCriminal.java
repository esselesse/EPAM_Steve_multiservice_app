package com.epam.javacore2019.steve2.appserver;

public class ModelCriminal {

    private int id;
    private String firstName;
    private String lastName;
    private String nickName;
    private int crimeFamilyId;

    private ModelCriminal(){};

    public String getNickName(){
        return nickName;
    }

    public int getCrimeFamilyId() {
        return crimeFamilyId;
    }

    public void setCrimeFamilyId(int crimeFamilyId) {
        this.crimeFamilyId = crimeFamilyId;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static class Builder{
        //БИЛДЕР!!!!! вместо кучи разных конструкторов, которые приходилось бы переопределять
        //+ сразу валидация вводимых данных
        //использовать только там, где обосновано, т.е. там, где нужна валидация и вычисление зависимых полей
        //плохо, потому что засоряет код
        //хорошо, когда много полей у создаваемого объекта или поле требует инициализации или что-то в принципе сложно
        //хорошо, когда есть вероятность применения различных комбинаций конструкторов
        private ModelCriminal model;

        public Builder(){
            model = new ModelCriminal();
        }

        public void setId(int id){
            model.setId(id);
        }

        //....

        public ModelCriminal build(){
            //validate parameters
            //set defaults
            //calculate dependent fields
            return model;
        }

    }
}
