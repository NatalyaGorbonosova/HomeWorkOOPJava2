import java.util.ArrayList;
import java.util.Scanner;


public class Zoo {
    
    public static ArrayList<Animal> allAnimal = new ArrayList<>();

    {
        allAnimal.add(new Cat(0.3, 1.2, "green", "Felix", "british", true, "grey", "06.06.2022", true));
        allAnimal.add(new Dog(0.5, 21, "yellow", "Sharik", "none", false, "brown", "01.02.2021", true));
        allAnimal.add(new Tiger(1, 50, "yellow", "Asia", "01.11.1200"));
        allAnimal.add(new Wolf(0.9, 27, "yellow", "Sibery", "02.11.1988", true));
        allAnimal.add(new Chicken(0.2, 2.3, "yellow", 0));
        allAnimal.add(new Stork(1.2, 12.3, "black", 30));
    }
    public int size(){
        return allAnimal.size();
    }

    void showAll(){
        int counter = 0;
        for (Animal animal : allAnimal) {
            System.out.printf("%d. ", counter);
            System.out.println(animal);
            counter++;
        }
    }
    void removeAnimal(int num){
        allAnimal.remove(num);
    }

    void showAnimal(int num){
       System.out.println(allAnimal.get(num));
       if (allAnimal.get(num) instanceof HomeAnimal){
        ((HomeAnimal)allAnimal.get(num)).showAffection();
       }
       if (allAnimal.get(num) instanceof Flyer){
        ((Flyer)allAnimal.get(num)).fly(((Bird)allAnimal.get(num)).getFlightAltitude());
       }  
    }

    void animalSay(int num) {
        System.out.println(allAnimal.get(num).sound()); 
    }

    void allAnimalsSay(){
        for (Animal animal : allAnimal) {
            System.out.println(animal.sound());
        }
    }
    public void addCat(Scanner sc){
        double height;
        double weight;
        String eyeColor;
        String nickName;
        String breed;
        String coatColor;
        String birthday;

        System.out.print("nickname: ");
        nickName = sc.next();
        System.out.print("height: ");
        height = sc.nextDouble();
        System.out.print("weight: ");
        weight = sc.nextDouble();
        System.out.print("Eye color: ");
        eyeColor = sc.next();
        System.out.print("breed: ");
        breed = sc.next();
        System.out.print("coutColor: ");
        coatColor = sc.next();
        System.out.print("Birthday: ");
        birthday = sc.next();
        
        Zoo.allAnimal.add(new Cat(height, weight, eyeColor, nickName, breed, false, coatColor, birthday, true));
    }
    public void addDog(Scanner sc){
        double height;
        double weight;
        String eyeColor;
        String nickName;
        String breed;
        String coatColor;
        String birthday;

        System.out.print("nickname: ");
        nickName = sc.next();
        System.out.print("height: ");
        height = sc.nextDouble();
        System.out.print("weight: ");
        weight = sc.nextDouble();
        System.out.print("Eye color: ");
        eyeColor = sc.next();
        System.out.print("breed: ");
        breed = sc.next();
        System.out.print("coutColor: ");
        coatColor = sc.next();
        System.out.print("Birthday: ");
        birthday = sc.next();
        
        Zoo.allAnimal.add(new Dog(height, weight, eyeColor, nickName, breed, false, coatColor, birthday, false));
    }
    public void addTiger(Scanner sc){
        double height;
        double weight;
        String eyeColor;
        String habitat;
        String dateFind;
        
        System.out.print("height: ");
        height = sc.nextDouble();
        System.out.print("weight: ");
        weight = sc.nextDouble();
        System.out.print("Eye color: ");
        eyeColor = sc.next();
        System.out.print("habitat: ");
        habitat = sc.next();
        System.out.print("date find: ");
        dateFind = sc.next();
        
        Zoo.allAnimal.add(new Tiger(height, weight, eyeColor, habitat, dateFind));
    }

    public void addWolf(Scanner sc){
        double height;
        double weight;
        String eyeColor;
        String habitat;
        String dateFind;
        
        System.out.print("height: ");
        height = sc.nextDouble();
        System.out.print("weight: ");
        weight = sc.nextDouble();
        System.out.print("Eye color: ");
        eyeColor = sc.next();
        System.out.print("habitat: ");
        habitat = sc.next();
        System.out.print("date find: ");
        dateFind = sc.next();
        
        Zoo.allAnimal.add(new Wolf(height, weight, eyeColor, habitat, dateFind, false));
    }
    public void addChicken(Scanner sc){
        double height;
        double weight;
        String eyeColor;
        
        
        System.out.print("height: ");
        height = sc.nextDouble();
        System.out.print("weight: ");
        weight = sc.nextDouble();
        System.out.print("Eye color: ");
        eyeColor = sc.next();
        
        
        Zoo.allAnimal.add(new Chicken(height, weight, eyeColor, 0));
    }

    public void addStork(Scanner sc){
        double height;
        double weight;
        String eyeColor;
        double flightAltitude;
        
        System.out.print("height: ");
        height = sc.nextDouble();
        System.out.print("weight: ");
        weight = sc.nextDouble();
        System.out.print("Eye color: ");
        eyeColor = sc.next();
        System.out.print("flight altitude: ");
        flightAltitude = sc.nextDouble();
        
        Zoo.allAnimal.add(new Stork(height, weight, eyeColor, flightAltitude));
    }
}
