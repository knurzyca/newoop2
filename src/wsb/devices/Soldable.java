package wsb.devices;

import wsb.creatures.Human;

public interface Soldable {
    void sell(Human buyer, Human seller, Double price) throws Exception;

}

