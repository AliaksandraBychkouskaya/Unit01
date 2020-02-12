package by.tr.mod1;

public class Triangle {
    public static void main (String [] args){
        double a, b, c, s;
        a = 3;
        b = 4;

        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        s = a*b/2;

        System.out.println("c = "+ c);
        System.out.println("Square = "+ s);
    }
}
