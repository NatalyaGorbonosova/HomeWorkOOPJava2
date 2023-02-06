public class Chicken extends Bird{
    public Chicken(double height, double weight, String eyeColor, double flightAltitude){
        super(height, weight, eyeColor, flightAltitude);
    }

    @Override
    public String sound() {
        String info = "Chicken say: Ko ko";
        return info;
    }
    @Override
    public String toString() {
        String info = "Chicken " + super.toString();
        return info;
    }
    
}
