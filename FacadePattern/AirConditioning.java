public class AirConditioning implements HomeService {
    @Override
    public void turnOn() {
        System.out.println("The air condition is now turned on!");
    }

    @Override
    public void turnOff() {
        System.out.println("The air condition is now turned off!");
    }
}