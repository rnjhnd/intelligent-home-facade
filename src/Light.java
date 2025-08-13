public class Light implements HomeService {
    @Override
    public void turnOn() {
        System.out.println("The light is now turned  on!");
    }

    @Override
    public void turnOff() {
        System.out.println("The light is now turned off!");
    }
}