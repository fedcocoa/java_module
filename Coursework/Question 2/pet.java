//Rohan Dewan C1946553

public abstract class pet {

    int age;
    String name;
    float weight;

    pet(int inAge, String inName, float inWeight) {
        age = inAge;
        name = inName;
        weight = inWeight;
    }

    public void describe() {
        System.out.println(name + " is " + age + " years old,");
        System.out.println("they weigh " + weight + "kg!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float newWeight) {
        weight = newWeight;
    }

    abstract public void move();

    abstract public void eat();

    abstract public void drink();

    abstract public void sleep();

}