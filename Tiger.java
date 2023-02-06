public class Tiger extends WildAnimal{
    public Tiger(double height, double weight, String eyeColor, String habitat, String dateFind){
        super(height, weight, eyeColor, habitat, dateFind);
    }

    @Override
    public String toString() {
        String infoUpper = String.format("Tiger height: %.1f m, weight: %.1f kg, eye color: %s", super.getHeight(), super.getWeight(), super.getEyeColor());
        String info = infoUpper + String.format(" habitat: %s, date find: %s", this.getHabitat(), this.getDateFind());
        return info;
    }
    @Override
    public String sound() {
        String info = "Tiger say: Rrrrr";
        return info;
    }

    
}
