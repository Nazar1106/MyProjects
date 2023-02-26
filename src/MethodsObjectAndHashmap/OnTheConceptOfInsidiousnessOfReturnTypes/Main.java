package MethodsObjectAndHashmap.OnTheConceptOfInsidiousnessOfReturnTypes;

public class Main {

    static class Fruit{

    }

    static class Citrus extends Fruit{

    }

    static class Orange extends Citrus{

    }

    static class BigRoundOrange extends Orange{

    }

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Citrus citrus = new Citrus();
        Orange orange = new Orange();
    }
}
