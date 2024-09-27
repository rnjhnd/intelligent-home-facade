public class HomeApp {
    private HomeInterface homeInterface;

    public HomeApp(HomeInterface homeInterface) {
        this.homeInterface = homeInterface;
    }

    public void turnOnAll() {
        System.out.println("Turning on all services...");
        homeInterface.turnOnAll();
    }

    public void turnOffAll() {
        System.out.println("\nTurning off all services...");
        homeInterface.turnOffAll();
    }

    public static void main(String[] args) {
        HomeInterface homeInterface = new HomeInterface();

        HomeApp homeapp = new HomeApp(homeInterface);

        homeapp.turnOnAll();
        homeapp.turnOffAll();
    }
}