package film_management.repository;

import film_management.database.FilmDatabase;
import film_management.model.Film;
import film_management.model.Movie;
import film_management.model.Serial;

public class FilmRepository {
    FilmDatabase filmDatabase= new FilmDatabase();
    public Movie[] allMovies(){
        return filmDatabase.movies;
    }
    public Serial[] allSerials(){
        return filmDatabase.serials;
    }
}
