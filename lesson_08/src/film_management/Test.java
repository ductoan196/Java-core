package film_management;

import film_management.controller.FilmController;
import film_management.database.FilmDatabase;
import film_management.model.Movie;
import film_management.repository.FilmRepository;
import film_management.service.FilmService;

import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {
        FilmController filmController= new FilmController();
        filmController.run();

    }
}
