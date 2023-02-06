public class Stork extends Bird implements Flyer{
    public Stork(double height, double weight, String eyeColor, double flightAltitude){
        super(height, weight, eyeColor, flightAltitude);
    }

   

    @Override
    public void fly(double flightAltitude) {
        System.out.printf("I can fly on %.1f m", flightAltitude);
    
    }

    @Override
    public String sound() {
        String info = "Storm say krkrkrk";
        return info;
    }
    @Override
    public String toString() {
        String info = "Storm " + super.toString();
        return info;
    }
    
}
