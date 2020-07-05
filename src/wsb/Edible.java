package wsb;

import wsb.creatures.Animal;

public interface Edible {
    void eat(Animal animal) throws Exception;
    void beEaten() throws Exception;
}