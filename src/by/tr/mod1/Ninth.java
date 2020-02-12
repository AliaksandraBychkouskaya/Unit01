package by.tr.mod1;

public class Ninth {
    public static void main(String[] args) {
        double a,b,c,d,x;
        a = 6;
        b = 9;
        c = 2;
        d = 3;

        x = ((a/c)*(b/d)) - ((a*b-c)/(c+d));
        if (c == 0 || d == 0) {
            System.out.println("Division by zero");
        }
        else
            System.out.println("Answer = " + x);
    }
}
