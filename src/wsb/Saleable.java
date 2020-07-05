package wsb;

import wsb.creatures.Human;

public interface Saleable {
    void sell();

    void sell(Human buyer, Human seller, Double price) throws Exception;
}
