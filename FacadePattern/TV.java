public class TV implements HomeService {

    @Override
    public void turnOn() {
        System.out.println("The TV is now turned on!");
    }

    @Override
    public void turnOff() {
        System.out.println("The TV is now turned off!");
    }
}