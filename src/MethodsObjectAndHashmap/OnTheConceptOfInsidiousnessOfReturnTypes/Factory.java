package MethodsObjectAndHashmap.OnTheConceptOfInsidiousnessOfReturnTypes;

public class Factory {

    Product product(){
        return product();
    }
}

class SweetFactory extends Factory{

    @Override
    Sweets product(){
        return new Sweets();
    }
}

class MilkFactory extends Factory{

    @Override
    Milks product(){
        return new Milks();
    }
}

class ChocolateFactory extends SweetFactory{

    @Override
    Chocolate product(){
        return new Chocolate();
    }
}

class A{
   String getA(){
        return " ";
    }
}

class B extends A{
    @Override
    String getA(){
        return "Hello";
    }
}

