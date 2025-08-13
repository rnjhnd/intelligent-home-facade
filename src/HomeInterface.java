public class HomeInterface {
   private AirConditioning ac;
   private Light light;
   private TV tv;

   public HomeInterface() {
      this.ac = new AirConditioning();
      this.light = new Light();
      this.tv = new TV();
   }
   public void turnOnAll() {
      ac.turnOn();
      light.turnOn();
      tv.turnOn();
   }
   public void turnOffAll() {
      ac.turnOff();
      light.turnOff();
      tv.turnOff();
   }
}