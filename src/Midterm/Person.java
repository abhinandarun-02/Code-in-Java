package Midterm;

public class Person implements name {
    private String name;
    private int age;

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
    public void count_vowels() throws myException {
        int count = 0;
        String str = name.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        if (count % 2 == 0) throw new myException();
        else System.out.println(count);
    }

    @Override
    public String get_initials() {
        boolean flag = false;
        String res = "";
        for (int i = 0; i < name.length(); i++) {
            if (!flag && name.charAt(i) == '.') {
                flag = true;
                i++;
            }
            if (flag) {
                res = res + name.charAt(i);
            }
        }
        return res;
    }
}
