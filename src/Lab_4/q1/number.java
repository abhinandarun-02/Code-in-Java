package Lab_4.q1;

class number {
    private float floatNum;
    private double real, complex;
    private float u,v;

    number()
    {
        floatNum=0;
        real=complex=0;
        u=v=0;
    }

    public void Add(float a,float b)
    {
        floatNum = a+b;
        System.out.println(a + " + " + b + " = " + floatNum);
    }
    public void Add(double r1,double c1, double r2, double c2)
    {
        real = r1+r2;
        complex = c1+c2;
        System.out.println(r1 + " + i" + c1 + " + " + r2 + "+ i" + c2 + " = " + real + "+ i" + complex);
    }
    public void Add(float u1 , float v1, float u2, float v2)
    {
        u = u1+u2;
        v = v1+v2;
        System.out.println("<" + u1 + "," + v1 + ">" + " + " + "<" + u2 + "," + v2 + ">" + " = " + "< " + u + "," + v + ">");
    }
}