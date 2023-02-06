import java.util.Scanner;

public class Program {
    public static void showAll(Animal[] animals){
        int counter = 1;
        for(Animal animal:animals){
            System.out.println(counter + ". " + animal.toString());
            System.out.println(animal.sound());
            if (animal instanceof HomeAnimal){
                HomeAnimal homeAnimal = (HomeAnimal)animal;
                System.out.println(homeAnimal.showAffection());
            }
            if (animal instanceof Flyer) {
                Bird bird = (Bird)animal;
                ((Flyer)animal).fly(bird.getFlightAltitude());
            }
            if (animal instanceof Gettrain){
                ((Gettrain)animal).train();
            }
            counter++;
        }
    }
    public static void menu(Zoo zoo, Scanner sc){
        System.out.println("1. Add animal");
        System.out.println("2. Remove animal");
        System.out.println("3. Show one animal");
        System.out.println("4. What an animal says");
        System.out.println("5. Show all animals in Zoo");
        System.out.println("6. What all animals say");
        System.out.println("7. Exit");
        System.out.println("Chose number of menu");
        int numMenu = sc.nextInt();

        switch (numMenu) {
            case 1:
                addAnimal(zoo, sc);
                menu(zoo, sc);
            case 2:
                removeAnimal(zoo, sc);
                menu(zoo, sc);
            case 3:
                showAnimal(zoo, sc);
                menu(zoo, sc);
            case 4:
                animalSay(zoo, sc);
                menu(zoo, sc);
            case 5:
                zoo.showAll();
                menu(zoo, sc);
            case 6:
                zoo.allAnimalsSay();
                menu(zoo, sc);
            case 7:
                break;
        }
    }

    public static void addAnimal(Zoo zoo, Scanner sc){
        System.out.println("1. Add Cat");
        System.out.println("2. Add Dog");
        System.out.println("3. Add Tiger");
        System.out.println("4. Add Wolf");
        System.out.println("5. Add Chicken");
        System.out.println("6. Add Stork");
        System.out.println("7. Exit");
        System.out.println("Chose animal");
        int num = sc.nextInt();
        switch(num){
            case 1:
                zoo.addCat(sc);
                menu(zoo, sc);
            case 2:
                zoo.addDog(sc);
                menu(zoo, sc);
            case 3:
                zoo.addTiger(sc);
                menu(zoo, sc);
            case 4: 
                zoo.addWolf(sc);
                menu(zoo, sc);
            case 5:
                zoo.addChicken(sc);
                menu(zoo, sc);
            case 6:
                zoo.addStork(sc);
                menu(zoo, sc);
            case 7:
                break;
        }
    }
    public static void removeAnimal(Zoo zoo, Scanner sc){
        System.out.println("Chose number");
        int num = sc.nextInt();
        if (num < zoo.size()){
            zoo.removeAnimal(num);
            System.out.println("Animal was remove");
            menu(zoo, sc);
        } else {
            System.out.println("Wrong number");
            menu(zoo, sc);
        }
    }
    public static void showAnimal(Zoo zoo, Scanner sc){
        System.out.println("Chose number");
        int num = sc.nextInt();
        if (num < zoo.size()){
            zoo.showAnimal(num);
            menu(zoo, sc);
        } else {
            System.out.println("Wrong number");
            menu(zoo, sc);
        }
    }
    public static void animalSay(Zoo zoo, Scanner sc){
        System.out.println("Chose number");
        int num = sc.nextInt();
        if (num < zoo.size()){
            zoo.animalSay(num);
            menu(zoo, sc);
        } else {
            System.out.println("Wrong number");
            menu(zoo, sc);
        }
    }
    
    public static void main(String[] args) {

        // Первое задание без зоопарка
        Animal cat1 = new Cat(0.3, 1.2, "green", "Felix", "british", true, "grey", "06.06.2022", true);
        Animal cat2 = new Cat(0.4, 2, "green", "Barsik", "none", false, "black", "20.01.2020", true);
        Animal dog1 = new Dog(0.5, 21, "yellow", "Sharik", "none", false, "brown", "01.02.2021", true);
        Animal tiger1 = new Tiger(1, 50, "yellow", "Asia", "01.11.1200");
        Animal wolf1 = new Wolf(0.9, 27, "yellow", "Sibery", "02.11.1988", true);
        Animal chicken1 = new Chicken(0.2, 2.3, "yellow", 0);
        Animal storm1 = new Stork(1.2, 12.3, "black", 30);
        Animal[] allAnimals = new Animal[] {cat1, cat2, dog1, tiger1, wolf1, chicken1, storm1};
        showAll(allAnimals); // показывает все что могут классы


        // Задание с зоопарком
        Scanner sc = new Scanner(System.in);
        Zoo zoo1 = new Zoo();
        menu(zoo1, sc);
        sc.close();
    }
    
}
