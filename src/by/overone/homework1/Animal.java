package by.overone.homework1;

public abstract class Animal {

    private int id;
    private String name;
    private int age;
    private double weight;
    private String type;

    public Animal(int id, String name, int age, double weight, String type){
        this.id=id;
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.type=type;
    }

    public abstract void eat(String food);

}
