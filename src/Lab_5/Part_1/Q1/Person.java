package Lab_5.Part_1.Q1;

public class Person{
    private String name;
    private int age;

    Person(String str,int age1){
        name = str;
        age =age1;
    }
    @Override
    public String toString() {
        return String.format("Name : %s\nAge : %d",name, age);
    }

}