package film_management.service;

import film_management.model.Movie;
import film_management.model.Serial;
import film_management.repository.FilmRepository;

public class FilmService {
    FilmRepository filmRepository = new FilmRepository();
    public void findFilmByTitle(String title){
        int count = 0;
        for (Movie movie: filmRepository.allMovies()){
            if (movie.getTitle().toLowerCase().contains(title.toLowerCase())){
                System.out.println(movie);
                count++;
            }
        }
        for (Serial serial: filmRepository.allSerials()){
            if (serial.getTitle().toLowerCase().contains(title.toLowerCase())){
                System.out.println(serial);
                count++;
            }
        }
        if (count ==0){
            System.out.println("Không có phim nào có title: " + title);
        }
    }
    public void printFilm(){
        for(Movie movie: filmRepository.allMovies()){
            System.out.println(movie);
        }
        for(Serial serial: filmRepository.allSerials()){
            System.out.println(serial);
        }
    }
    }
