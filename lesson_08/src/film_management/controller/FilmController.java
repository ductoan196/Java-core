package film_management.controller;

import film_management.service.FilmService;

import java.util.Scanner;

public class FilmController {
    public void run() {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        boolean isQuit = false;
        FilmService filmService= new FilmService();
        while (!isQuit) {
            showMenu();
            System.out.print("Nhập lựa chọn : ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1: {
                    filmService.printFilm();
                    break;
                }
                case 2: {
                    System.out.println("Nhập vào title: ");
                    String title = sc.nextLine();
                    filmService.findFilmByTitle(title);
                    break;
                }
                case 3: {
                    isQuit = true;
                    break;
                }
            }
        }
    }
    public static void showMenu() {
        System.out.println("\n********* MENU *********");
        System.out.println("1 - Các phim đang có");
        System.out.println("2 - Tìm kiếm tên phim theo title");
        System.out.println("3 - Thoát\n");
    }
}
