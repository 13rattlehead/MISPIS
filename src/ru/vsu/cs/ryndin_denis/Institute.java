package ru.vsu.cs.ryndin_denis;

public class Institute {
    private String name;
    private String number;
    private ResearchAssociate employees;
    public Institute(String name, String number) {
        this.name = name;
        this.number= number;
    }
    public void setEmployees(ResearchAssociate[] employees){
        this.employees.addEmployees(employees);
    }
    public String getName(){
        return this.name;
    }
    public ResearchAssociate getEmployees(){
        return this.employees;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
