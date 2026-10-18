package facade;

import subsystem.*;

public class HomeTheaterFacade {
    private Amplifier amplifier;
    private DvdPlayer dvdPlayer;
    private Projector projector;
    private Screen screen;
    private TheaterLights lights;
    private PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amplifier,
                             DvdPlayer dvdPlayer,
                             Projector projector,
                             Screen screen,
                             TheaterLights lights,
                             PopcornPopper popper) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popper = popper;
    }

    // Упрощенный метод для просмотра фильма (скрывает координацию множества шагов)
    public void watchMovie(String movie) {
        System.out.println("=== Подготовка к просмотру фильма ===");
        popper.on();
        popper.pop();

        lights.dim(10);

        screen.down();

        projector.on();
        projector.wideScreenMode();

        amplifier.on();
        amplifier.setDvd(dvdPlayer);
        amplifier.setVolume(5);

        dvdPlayer.on();
        dvdPlayer.play(movie);
        System.out.println("Приятного просмотра!\n");
    }

    // Упрощенный метод для завершения сеанса
    public void endMovie() {
        System.out.println("=== Завершение сеанса кинотеатра ===");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
        System.out.println("Система выключена.");
    }
}