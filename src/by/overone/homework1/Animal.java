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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
