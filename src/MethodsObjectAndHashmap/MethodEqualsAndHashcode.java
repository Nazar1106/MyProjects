package MethodsObjectAndHashmap;

import java.util.Objects;

public class MethodEqualsAndHashcode {

    private String name;

    private String surname;
    private String phone;
    private int age;

    private long LastSeen;

    public MethodEqualsAndHashcode(String name, String surname, String phone, int age, long lastSeen) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.age = age;
        LastSeen = lastSeen;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MethodEqualsAndHashcode that = (MethodEqualsAndHashcode) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(phone, that.phone);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname, phone, age);
    }

    public static void main(String[] args) {
        MethodEqualsAndHashcode p1 = new MethodEqualsAndHashcode("Nazar","L","293928", 25,23892311L);
        MethodEqualsAndHashcode p2 = new MethodEqualsAndHashcode("Nazar","L","293928", 25,23892389L);


        System.out.println(p1==p2);

        System.out.println(p1.equals(p2));
    }



    static class A{
         Object getA(){
            return this;
        }
    }
    static class B extends A{
        @Override
        public Object getA(){
            return this;
        }

    }
}


