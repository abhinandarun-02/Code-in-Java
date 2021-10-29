package Lab_5.Part_2.Q1;

public class B extends Marks {
    B(int s1, int s2, int s3, int s4) {
        super(s1, s2, s3, s4);
    }

    public float get_percentage() {
        return ((sub1 + sub2 + sub3 + sub4) / 4.0f);
    }
}
