package Birds;

public class Eagle extends Birds implements Fly {
    public Eagle(String name, int age, String eyes, TypeBird typeBird) {
        super(name, age, eyes, typeBird);
    }
    @Override
    public String toString() {
        return "Eagle" +
                " name = " + name +
                ", age =" + age +
                ", eyes =" + eyes +
                ", typeBird = " + typeBird+ ".";
    }
    @Override
    public Integer flyBirds() {
        Integer speed = 10*2;
        System.out.println("Eagle's speed = "+speed+".");
        return speed;
    }
}
