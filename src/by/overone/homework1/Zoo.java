package by.overone.homework1;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal){
        getAnimals().add(animal);
    }

    public int sizeAnimal(){
        int size = getAnimals().size();
        return size;
    }


    public void setAnimal(int index, Animal animal){
        getAnimals().set(index, animal);
    }



    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
