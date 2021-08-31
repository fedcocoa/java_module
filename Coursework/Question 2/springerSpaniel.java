//Rohan Dewan C1946553

public class springerSpaniel extends dog {

    public springerSpaniel(int inAge, String inName, float inWeight) {
        super(inAge, inName, inWeight);
        hairLength = "short";
        hairColour = "dark brown with white markings";
        dogType = "gun dog";
        origin = "England and Spain";
    }

    public void flush() {
        System.out.println(name + " flushes out some birds from the bushes!");
    }

}