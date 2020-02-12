package by.tr.mod1;

public class Thirteen {
    public static void main(String[] args) {
        double x1,x2,y1,y2,x3,y3,p,s;
        x1 = 0;
        y1 = 0;
        x2 = 2;
        y2 = 2;
        x3 = -2;
        y3 = -1;

        p = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2))+Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2))+Math.sqrt(Math.pow(x2-x3,2)+Math.pow(y2-y3,2));
        s = Math.abs((x1-x3)*(y2-y3)-(x2-x3)*(y1-y3))/2;

        System.out.println("Perimetr = " + p);
        System.out.println("Square = " + s);
    }
}
