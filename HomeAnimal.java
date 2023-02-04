public class HomeAnimal extends Animal{
    private String nickName;
    private String breed;
    private boolean vaccination;
    private String coatColor;
    private String birthday;

    protected HomeAnimal(double height, double weight, String eyeColor, String nickName, String breed, boolean vaccination, String coatColor, String birthday){
        super(height, weight, eyeColor);
        nickName = this.nickName;
        breed = this.breed;
        vaccination = this.vaccination;
        coatColor = this.coatColor;
        birthday = this.birthday;
    }

    public String showAffection(){
        return "show affection";
    }
    @Override
    public String toString() {
        String infoUpper = String.format("height: %.1f m, weight: %.1f kg, eye color: %s", super.getHeight(), super.getWeight(), super.getEyeColor());
        String info = infoUpper + String.format("\n nickName: %s, breed: %s, vaccination: %s, coatColor: %s, birthday: %s", this.nickName, this.breed, String.valueOf(this.vaccination), this.coatColor, this.birthday);
        return info;
    }
    @Override
    public String sound() {
        String sound = "Home " + super.sound();
        return sound;
    }
    public String getNickName(){
        return this.nickName;
    }
    public String getBreed(){
        return this.breed;
    }
    public boolean getVaccination(){
        return this.vaccination;
    }
    public String getCoatColor(){
        return this.coatColor;
    }
    public String getBirthday(){
        return this.birthday;
    }

    
}
