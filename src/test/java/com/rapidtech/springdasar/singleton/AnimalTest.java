package com.rapidtech.springdasar.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void singletonTest() {
        Animal animal1 = Animal.getInstance();
        Animal animal2 = Animal.getInstance();
        Animal animal3 = Animal.getInstance();
        Animal animal4 = Animal.getInstance();
        Animal animal5 = Animal.getInstance();

        Assertions.assertSame(animal1, animal2);
        Assertions.assertSame(animal1, animal3);
        Assertions.assertSame(animal2, animal4);
        Assertions.assertSame(animal2, animal5);
        Assertions.assertSame(animal4, animal5);
    }
}
