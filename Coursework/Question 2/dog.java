//Rohan Dewan C1946553

public abstract class dog extends pet {

    String hairColour;
    String hairLength;
    boolean goodDog;
    String origin;
    String dogType;

    dog(int inAge, String inName, float inWeight) {
        super(inAge, inName, inWeight);
        goodDog = true;
    }

    public void describe() {
        super.describe();
        System.out.println(name + " comes from " + origin + ".");
        System.out.println("They have a " + hairLength + " coat.");
        if(goodDog) {
            System.out.println("They are also a good dog and deserve treats!");
        } else {
            System.out.println("They are a bit mischievous though!");
        }
    }
    
    public void eat() {
        System.out.println(name + " goes over to their food bowl and starts munching away.");
    }

    public void puppyEyes() {
        System.out.println(name + " is making puppy eyes at you. It's too cute!");
    }

    public void move() {
        System.out.println(name + " picks a random direction and wanders off.");
    }

    public void drink() {
        System.out.println(name + " goes over to their water bowl and starts slurping.");
    }

    public void sleep() {
        System.out.println(name + " circles a couple times on their bed and they slump down.");
    }
}