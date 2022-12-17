package film_management.database;

import film_management.model.Date;
import film_management.model.Film;
import film_management.model.Movie;
import film_management.model.Serial;

import java.time.format.DateTimeFormatter;

public class FilmDatabase {
    Date date1 = new Date(1,1,2001);
    Date date2 = new Date(2,2,2002);
    Date date3 = new Date(3,3,2003);

    public Movie[] movies = {
            new Movie(date1,1,"Doremon","Anime","Tony",90),
            new Movie(date2,2,"Conan","Anime","Locy",80),
            new Movie(date3,3,"Fast&furious 7","Action","Linda",120)
    };
    public Serial[] serials = {
            new Serial(date1,1,"Doremon","Anime","Tony",5,20),
            new Serial(date2,2,"Conan","Anime","Locy",7,25)
    };

}
