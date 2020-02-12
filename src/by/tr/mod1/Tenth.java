package by.tr.mod1;

public class Tenth {
    public static void main(String[] args) {
        double x,y,z;
        x = Math.PI/3;
        y = Math.PI/4;

        if (Math.cos(x) == Math.sin(y)){
            System.out.println("Division by zero");
        }
        else {
            z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);

            System.out.println("Answer = " + z);
        }
    }
}

