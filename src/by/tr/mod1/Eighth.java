package by.tr.mod1;

public class Eighth {
    public static void main(String[] args) {
        double a,b,c,x;
        a = 5;
        b = 7;
        c = 14;

        if (a==0){
            System.out.println("Division by zero");
        }
        else {
            x = (b + Math.sqrt((Math.pow(b,2)+4*a*c)))/(2*a)- Math.pow(a,3)*c + Math.pow(b,-2);

            System.out.println("Answer = " + x);
        }
    }
}
