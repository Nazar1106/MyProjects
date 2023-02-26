package Birds;

public class Hawk extends Birds implements Fly {
    String hawColor;
    public Hawk(String name, int age, String eyes, TypeBird typeBird, String hawColor) {
        super(name, age, eyes, typeBird);
        this.hawColor = hawColor;
    }
    @Override
    public Integer flyBirds() {
        Integer speed = 10*4;
        System.out.println("Hawk's speed = "+speed+".");
        return speed;
    }
    @Override
    public void eatMice() {
        System.out.println("Hawk ate mice.");
    }
    @Override
    public String toString() {
        return "Hawk " +
                "name = " + name +
                ", age = " + age +
                ", eyes = " + eyes +
                ", hawColor = " + hawColor+".";
    }
}
