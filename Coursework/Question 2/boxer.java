//Rohan Dewan C1946553

public class boxer extends dog {

    public boxer(int inAge, String inName, float inWeight) {
        super(inAge, inName, inWeight);
        hairLength = "short";
        hairColour = "fawn with a white underbelly";
        dogType = "working";
        origin = "Germany";
    }

    public void hunt() {
        System.out.println(name + " goes after a bird it spotted!");
    }

}