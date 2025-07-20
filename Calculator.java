import java.util.Scanner;
public class Calculator {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);

    };

    public static double add(double x, double y){
      return  x + y;
    };

    public static double sub(double x,double y){
        return  x-y;
    };

    public static double mul(double x,double y){
        return x*y;
    }

    public static  double div(double x, double y){
        return x/y;
    }

    public static double sqrt(double x){
        return Math.sqrt(x);
    }

    public static double power(double x,double y){
        return Math.pow(x,y);
    }

    public static double sine(double x){
        return Math.sin(x);
    }

    public static double Cosine(double x){
        return  Math.cos(x);
    }

    public static double calculateTangent(double x){
        return  Math.tan(x);
    }

    public static double calculateNaturalLogarithm(double x){
        return Math.log(x);
    }

    public static double calculateAbsolute(double x){
        return Math.abs(x);
    }

    public static long roundNumber(long x){
        return Math.round(x);
    }

    public static double ceilingNumber(double x){
        return Math.ceil(x);
    }

    public static double floorNumber(double x){
        return  Math.floor(x);
    }

    public static double findMin(double x,double y){
        return Math.min(x,y);
    }

    public static double findMax(double x,double y){
        return Math.max(x,y);
    }



}