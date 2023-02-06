public abstract class Bird extends Animal{
    private double flightAltitude;

    public Bird(double height, double weight, String eyeColor, double flightAltitude){
        super(height, weight, eyeColor);
        this.flightAltitude = flightAltitude;
    }
    
    public double getFlightAltitude(){
        return this.flightAltitude;
    }

    @Override
    public String toString() {
        String info = String.format("height: %.1f m, weight: %.1f kg, eye color: %s, flight altitude: %s m", this.getHeight(), this.getWeight(), this.getEyeColor(), String.valueOf(this.flightAltitude));
        return info;
    }

    @Override
    public String sound() {
        return "Bird say: ";
    }
    
}
