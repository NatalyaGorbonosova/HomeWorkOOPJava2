public abstract class WildAnimal extends Animal {
    private String habitat;
    private String dateFind;

    protected WildAnimal(double height, double weight, String eyeColor, String habitat, String dateFind){
        super(height, weight, eyeColor);
        this.habitat = habitat;
        this.dateFind = dateFind;
    }

    @Override
    public String toString() {
        String infoUpper = String.format("height: %.1f m, weight: %.1f kg, eye color: %s", super.getHeight(), super.getWeight(), super.getEyeColor());
        String info = infoUpper + String.format(" habitat: %s, date find: %s", this.habitat, this.dateFind);
        return info;
    }

    @Override
    public String sound() {
        String sound = "Wild  " + super.sound();
        return sound;
    }

    public String getHabitat(){
        return this.habitat;
    }
    public String getDateFind(){
        return this.dateFind;
    }
}
