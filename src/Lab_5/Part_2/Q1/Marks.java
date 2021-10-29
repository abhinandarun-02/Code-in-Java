package Lab_5.Part_2.Q1;

public abstract class Marks {

    protected int sub1;
    protected int sub2;
    protected int sub3;
    protected int sub4;

    Marks(int sub1, int sub2, int sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    Marks(int sub1, int sub2, int sub3, int sub4) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }

    public abstract float get_percentage();

}
