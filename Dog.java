public class Dog extends HomeAnimal implements Gettrain{
    private boolean training;

    public Dog(double height, double weight, String eyeColor, String nickName, String breed, boolean vaccination, String coatColor, String birthday, boolean training){
        super(height, weight, eyeColor, nickName, breed, vaccination, coatColor, birthday);
        this.training = training;
    }
    @Override
    public String toString() {
        String infoUpper1 = String.format("Dog height: %.1f m, weight: %.1f kg, eye color: %s", this.getHeight(), this.getWeight(), this.getEyeColor());
        String infoUpper2 = String.format("\n nickName: %s, breed: %s, vaccination: %s, coatColor: %s, birthday: %s", this.getNickName(), this.getBreed(), String.valueOf(this.getVaccination()), this.getCoatColor(), this.getBirthday());
        String info = infoUpper1 + infoUpper2 + String.format(" training : %s", String.valueOf(training));
        return info;
    }
    @Override
    public String sound() {
        String info = "Dog say: Gav";
        return info;
    }
    @Override
    public String showAffection() {
        String affection = "Dog " + super.showAffection();
        return affection;
    }

    @Override
    public void train() {
        System.out.println("Dog is traning now");
    }
    public boolean getTrainig(){
        return this.training;
    }
}
