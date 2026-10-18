package subsystem;

public class TheaterLights {
    public void on() {
        System.out.println("Освещение в комнате включено.");
    }

    public void dim(int level) {
        System.out.println("Освещение приглушено до " + level + "%.");
    }
}