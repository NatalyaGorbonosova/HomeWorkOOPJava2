public class Animal{
    private double height;
    private double weight;
    private String eyeColor;
    
    protected Animal(double height, double weight, String eyeColor) { 
    height = this.height;
    weight = this.weight;
    eyeColor = this.eyeColor;
    }

    public String sound(){
        return "animal say: ";
    }
    @Override
    public String toString() {
        String info = String.format("height: %.1f m, weight: %.1f kg, eye color: %s", this.height, this.weight, this.eyeColor);
        return info;
    }
    public double getHeight(){
        return this.height;
    }
    public double getWeight(){
        return this.weight;
    }
    public String getEyeColor(){
        return this.eyeColor;
    }
   
}