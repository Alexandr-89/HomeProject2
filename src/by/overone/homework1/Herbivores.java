package by.overone.homework1;

public class Herbivores extends Animal {

    private String view;

    public Herbivores(int id, String name, int age, double weight, String type, String view) {
        super(id, name, age, weight, type);
        this.view=view;
    }

    @Override
    public void eat(String food) {
        String bestFood = "grass";
        if (bestFood==food){
            System.out.println("This is the best food, I am very happy");
        }else {
            System.out.println("This is bad food, I'll trample you");
        }

    }
}
