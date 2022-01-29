package ru.nethology.manager;

import ru.nethology.domain.FilmsTitle;

public class PostManager {
    FilmsTitle[] films = new FilmsTitle[0];
    int defaultFilmLength = 10;

    public void PostManager(int customFilmLength) {
        if (customFilmLength > 0) {
            defaultFilmLength = customFilmLength;
        }
    }

    public void add(FilmsTitle film) {
        int length = films.length + 1;
        FilmsTitle[] tmp = new FilmsTitle[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public FilmsTitle[] getAll() {
        int resultLenght = films.length;
        if (resultLenght < defaultFilmLength) {
            resultLenght = defaultFilmLength;
        }
        FilmsTitle[] result = new FilmsTitle[films.length];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;

    }

}
