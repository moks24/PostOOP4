package ru.nethology.manager;

import org.junit.jupiter.api.Test;
import ru.nethology.domain.FilmsTitle;

import static org.junit.jupiter.api.Assertions.*;

class PostManagerTest {

    @Test
    public void should(){
        PostManager manager = new PostManager();
        FilmsTitle first = new FilmsTitle(1,"Блатшот", "Боевик");
        FilmsTitle second = new FilmsTitle(2,"Вперед","мульфильм");
        FilmsTitle third = new FilmsTitle(3,"Отель Белград","комедия");
        manager.add(first);
        manager.add(second);
        manager.add(third);

        FilmsTitle[] actual = manager.getAll();
        FilmsTitle[] expected = { third, second, first};

        assertArrayEquals(expected, actual);




    }

}