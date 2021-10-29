package by.overone.homework1;

public class Rodents extends Animal{

    private double lengthOfIncisors;

    public Rodents(int id, String name, int age, double weight, String type, double lengthOfIncisors) {
        super(id, name, age, weight, type);
        this.lengthOfIncisors=lengthOfIncisors;
    }

    @Override
    public void eat(String food) {
        String bestFood = "nuts";
        if (bestFood==food){
            System.out.println("This is the best food, I am very happy");
        }else {
            System.out.println("This is very bad food, I'll chew through your shoes");
        }

    }

}
