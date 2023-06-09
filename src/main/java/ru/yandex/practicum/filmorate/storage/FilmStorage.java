package ru.yandex.practicum.filmorate.storage;


import ru.yandex.practicum.filmorate.model.Film;

import java.util.Map;

public interface FilmStorage {
    public Map<Integer, Film> getFilms();

    public Film getFilmbyId(Integer id);
}
