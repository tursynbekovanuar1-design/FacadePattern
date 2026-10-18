package subsystem;

public class DvdPlayer {
    public void on() {
        System.out.println("DVD-плеер включен.");
    }

    public void off() {
        System.out.println("DVD-плеер выключен.");
    }

    public void play(String movie) {
        System.out.println("Воспроизведение фильма: \"" + movie + "\".");
    }

    public void stop() {
        System.out.println("DVD-плеер остановлен.");
    }

    public void eject() {
        System.out.println("Диск извлечен из DVD-плеера.");
    }
}