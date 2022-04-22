package models;

import Enums.Subject;

import java.time.LocalDate;

public class GymProfessor extends Person{
    private int salary;
    Subject subject;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }
    public GymProfessor(String name, LocalDate birth, int identification,
                        double height, int weight, int salary, Subject
                        subject)
    {
     super(name, birth, identification, height, weight);
     setSalary(salary);
     setSubject(subject);
    }
    @Override
    public void showPersonInfo(){
        System.out.printf("Nombre docente: %s%n", this.getName());
        System.out.printf("Fecha de nacimiento: %s%n", this.getBirth());
        System.out.printf("DNI: %s%n", this.getIdentification());
        System.out.printf("Altura: %s%n", this.getHeight());
        System.out.printf("Peso: %s%n", this.getWeight());
        System.out.printf("Ocupacion: %s%n", this.getSubject().getDesc());
        System.out.printf("Salario: %s%n", this.getSalary());
    }
}
