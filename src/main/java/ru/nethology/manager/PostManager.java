package ru.nethology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.nethology.domain.FilmsTitle;

public class PostManager {

    private FilmsTitle[] films = new FilmsTitle[0];

    public void add(FilmsTitle film) {
        // создаём новый массив размером на единицу больше
        int length = films.length + 1;
        FilmsTitle[] tmp = new FilmsTitle[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public FilmsTitle[] getAll() {
        FilmsTitle[] result = new FilmsTitle[films.length];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;

    }

}