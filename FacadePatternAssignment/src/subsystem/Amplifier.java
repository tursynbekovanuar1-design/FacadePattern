package subsystem;

public class Amplifier {
    public void on() {
        System.out.println("Усилитель включен.");
    }

    public void off() {
        System.out.println("Усилитель выключен.");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println("Усилитель настроен на работу с DVD-плеером.");
    }

    public void setVolume(int volume) {
        System.out.println("Громкость усилителя установлена на уровень: " + volume);
    }
}