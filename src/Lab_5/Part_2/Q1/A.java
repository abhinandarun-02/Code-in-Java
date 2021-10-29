package Lab_5.Part_2.Q1;

public class A extends Marks {

    A(int s1, int s2, int s3) {
        super(s1, s2, s3);
    }

    public float get_percentage() {
        return ((sub1 + sub2 + sub3) / 3.0f);
    }
}
