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
            counter++;
        }
    }
    public static void main(String[] args) {
        Animal cat1 = new Cat(0.3, 1.2, "green", "Felix", "british", true, "grey", "06.06.2022", true);
        //Animal cat2 = new Cat(1, 2, "green", null, null, false, null, null, true);
        //Animal[] allAnimals = new Animal[] {cat1};
        System.out.println(cat1.toString());
        // showAll(allAnimals);
        
    }
    
}
