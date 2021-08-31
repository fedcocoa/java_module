//Rohan Dewan C1946553

public abstract class fish extends pet {

    WaterType waterType;

    public enum WaterType {
        FRESHWATER,
        COLDWATER,
        SALTWATER
    }

    fish(int inAge, String inName, float inWeight, WaterType inWaterType) {
        super(inAge, inName, inWeight);
        waterType = inWaterType;
    }

    public void describe() {
        super.describe();
        String waterString = "";
        switch(waterType) {
            case FRESHWATER:
                waterString = "fresh water";
                break;
            case COLDWATER:
                waterString = "cold water";
                break;
            case SALTWATER:
                waterString = "salt water";
                break;
        }
        System.out.println(name + " is a " + waterString + " fish.");
    }

    public void drink() {
        System.out.println(name + " swims around and absorbs the water through their gills.");
    }

    public void eat() {
        System.out.println(name + " swims to the closest piece of fish food and gobbles it up.");
    }

    public void move() {
        System.out.println("Their little fins flap as they work their way through the water.");
    }

    public void sleep() {
        System.out.println("They don't have eyelids and so they rest with their eyes open.");
    }
}