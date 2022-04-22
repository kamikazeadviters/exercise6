package models;


import java.time.LocalDate;

public abstract class Person {
    private String name;
    private LocalDate birth;
    private int identification;
    private double height;
    private int weight;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }

    public int getIdentification() {
        return identification;
    }


    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
    public Person(String name, LocalDate birth, int identification,
                  double height, int weight)
    {
        setName(name);
        setBirth(birth);
        setIdentification(identification);
        setHeight(height);
        setWeight(weight);
    }
    public abstract void showPersonInfo();
}

