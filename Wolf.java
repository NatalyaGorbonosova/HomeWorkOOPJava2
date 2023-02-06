public class Wolf extends WildAnimal{
    private boolean packLeader;

    public Wolf(double height, double weight, String eyeColor, String habitat, String dateFind, boolean packLeader){
        super(height, weight, eyeColor, habitat, dateFind);
        this.packLeader = packLeader;
    }
    @Override
    public String toString() {
        String infoUpper = String.format("Wolf height: %.1f m, weight: %.1f kg, eye color: %s", super.getHeight(), super.getWeight(), super.getEyeColor());
        String info = infoUpper + String.format(" habitat: %s, date find: %s, pack leader: %s", this.getHabitat(), this.getDateFind(), String.valueOf(packLeader));
        return info;
    }
    @Override
    public String sound() {
        String info =  "Wolf say: Rrr - rrr";
        return info;
    }

    public boolean getPackLeader(){
        return packLeader;
    }
    
}
