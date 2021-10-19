package Lab_2;

class AddressBook {
    String name, street_address, city, state;
    int ZIP_code;

    void set_address(String a, String b, String c, String d, int e) {
        name = a;
        street_address = b;
        city = c;
        state = d;
        ZIP_code = e;
    }

    void get_address() {
        System.out.print("Name : " + name + '\n');
        System.out.print("Street : " + street_address + '\n');
        System.out.print("City : " + city + '\n');
        System.out.print("State : " + state + '\n');
        System.out.print("ZIP code : " + ZIP_code);
    }
}

public class q5 {
    public static void main(String[] args) {
        AddressBook obj = new AddressBook();
        obj.set_address("Abhinand Arun", "Karunagappally", "Kollam", "Kerala", 690544);
        obj.get_address();
    }
}