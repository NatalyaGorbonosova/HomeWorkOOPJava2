public class Cat extends HomeAnimal{
    private boolean wool;
    public Cat(double height, double weight, String eyeColor, String nickName, String breed, boolean vaccination, String coatColor, String birthday, boolean wool){
        super(height, weight, eyeColor, nickName, breed, vaccination, coatColor, birthday);
        this.wool = wool;
    }
    @Override
    public String sound() {
        String info = "Cat say: Meow";
        return info;
    }
    @Override
    public String toString() {
        String infoUpper1 = String.format("Cat  height: %.1f m, weight: %.1f kg, eye color: %s", this.getHeight(), this.getWeight(), this.getEyeColor());
        String infoUpper2 = String.format("\n nickName: %s, breed: %s, vaccination: %s, coatColor: %s, birthday: %s", this.getNickName(), this.getBreed(), String.valueOf(this.getVaccination()), this.getCoatColor(), this.getBirthday());
        String info = infoUpper1 + infoUpper2 + String.format(" wool: %s", String.valueOf(wool));
        return info;
    }
    @Override
    public String showAffection() {
        String affection = "Cat " + super.showAffection();
        return affection;
    }
    public boolean getWool(){
        return this.wool;
    }
}
