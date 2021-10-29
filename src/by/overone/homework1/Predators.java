package by.overone.homework1;

public class Predators extends Animal{

    private String colour;

    public Predators(int id, String name, int age, double weight, String type, String colour) {
        super(id, name, age, weight, type);
        this.colour=colour;
    }


    @Override
    public void eat(String food) {
        String bestFood = "meat";
        if (bestFood==food){
            System.out.println("This is the best food, I am very happy");
        }else {
            System.out.println("This is bad food, I'll eat you");
        }
    }

}
