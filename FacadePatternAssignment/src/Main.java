import facade.HomeTheaterFacade;
import subsystem.*;

public class Main {
    public static void main(String[] args) {
        // 1. Создаем компоненты подсистемы
        Amplifier amp = new Amplifier();
        DvdPlayer dvd = new DvdPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();
        PopcornPopper popper = new PopcornPopper();

        // 2. Инициализируем Фасад, передавая ему подсистему
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
                amp, dvd, projector, screen, lights, popper
        );

        // 3. Клиент управляет кинотеатром с помощью простых методов фасада
        homeTheater.watchMovie("Интерстеллар");

        // Имитируем окончание фильма...

        homeTheater.endMovie();
    }
}