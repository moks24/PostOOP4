package ru.nethology.manager;

import org.junit.jupiter.api.Test;
import ru.nethology.domain.FilmsTitle;

import static org.junit.jupiter.api.Assertions.*;

class PostManagerTest {
    FilmsTitle first = new FilmsTitle(1, "Блатшот", "Боевик");
    FilmsTitle second = new FilmsTitle(2, "Вперед", "мульфильм");
    FilmsTitle third = new FilmsTitle(3, "Отель Белград", "комедия");
    FilmsTitle fourth = new FilmsTitle(4, "джентельмены", "боевик");
    FilmsTitle fifth = new FilmsTitle(5, "Человек-невидимка", "ужасы");
    FilmsTitle sixth = new FilmsTitle(6, "Тролли", "мультфильм");
    FilmsTitle seventh = new FilmsTitle(7, "номер один", "комедия");

    @Test
    public void should() {
        PostManager manager = new PostManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        FilmsTitle[] expected = new FilmsTitle[]{seventh, sixth, fifth, fourth, third, second, first};
        FilmsTitle[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }

}