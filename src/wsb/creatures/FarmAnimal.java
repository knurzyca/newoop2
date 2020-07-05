package wsb.creatures;

import wsb.Edible;

public class FarmAnimal extends Animal implements Edible{

    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void eat(Animal animal) throws Exception {

    }

    @Override
    public void beEaten() throws Exception {
        this.kill();
        System.out.println("tasted goog");
    }
}
