package by.overone.homework1;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        Predators predator1 = new Predators(1, "Leva", 5, 80, "lione", "light brown");
        Predators predator2 = new Predators(2, "Tigra", 10, 75, "tiger", "yeiiow-blak striped");
        Herbivores herbivore1 = new Herbivores(3, "Rudy", 7, 320, "zebra", "ungulates");
        Herbivores herbivore2 = new Herbivores(4, "Byrenka", 6, 450, "cow", "artiodactylc");
        Rodents rodent1 = new Rodents(5, "Chip", 3, 0.25, "chipmunk", 4);
        Rodents rodent2 = new Rodents(6, "Dail", 2, 0.2, "chipmunk", 4);
        Rodents rodent3 = new Rodents(7,"Rocfor", 7, 0.2, "mouse", 0.2);


        zoo.addAnimal(predator1);
        zoo.addAnimal(predator2);
        zoo.addAnimal(herbivore1);
        zoo.addAnimal(herbivore2);
        zoo.addAnimal(rodent1);
        zoo.addAnimal(rodent2);


        predator1.eat("meat");
        predator1.eat("grass");
        herbivore1.eat("grass");
        herbivore1.eat("meat");
        rodent1.eat("nuts");
        rodent1.eat("meat");
    }
}
