class animal{
    String name;
    int age;
    String color;
    int weight;  
}

class dog extends animal {
    String breed;
    boolean isindo;
}

class cat extends animal {
    int height;
}

public class inherience {
    public static void main(String[] args) {
        dog dog1 = new dog();
        dog1.name = "Buddy";
        dog1.age = 3;
        dog1.color = "Brown";
        dog1.breed = "Labrador";
        dog1.isindo = true;

        cat cat1 = new cat();
        cat1.name = "Whiskers";
        cat1.age = 2;
        cat1.color = "Black";
        cat1.height = 25;

        System.out.println("Dog Details:");
        System.out.println("Name: " + dog1.name);
        System.out.println("Age: " + dog1.age);
        System.out.println("Color: " + dog1.color);
        System.out.println("Breed: " + dog1.breed);
        System.out.println("Is Indoors: " + dog1.isindo);

        System.out.println("\nCat Details:");
        System.out.println("Name: " + cat1.name);
        System.out.println("Age: " + cat1.age);
        System.out.println("Color: " + cat1.color);
        System.out.println("Height: " + cat1.height + " cm");
    }
}