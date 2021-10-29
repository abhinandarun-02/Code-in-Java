package Lab_5.Part_1.Q1;

public class Person{
    private String name;
    private int age;

    Person(String str,int age1){
        name = str;
        age =age1;
    }

    public void to_string() {
        String str = String.format("Name : %s\nAge : %d",name, age);
        System.out.println(str);
    }

}