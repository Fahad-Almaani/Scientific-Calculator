import java.util.Scanner;
public class Calculator {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        double x,y;
        boolean running = true;

        while(running){
            displayMenu();

            try{
                int userChoice = scanner.nextInt();
                switch (userChoice){
                    case 0: // exit
                        System.out.println("Goodbye");
                        running = false;
                        break;
                    case 1: // add
                        System.out.println("Enter The First Number: ");
                         x = scanner.nextDouble();
                        System.out.println("Enter The second Number: ");
                         y = scanner.nextDouble();
                         System.out.println(add(x,y));
                        break;
                    case 2: // sub
                        System.out.println("Enter The First Number: ");
                         x = scanner.nextDouble();
                        System.out.println("Enter The second Number: ");
                         y = scanner.nextDouble();
                        System.out.println(sub(x,y));
                        break;
                    case 3: // mul
                        System.out.println("Enter The First Number: ");
                         x = scanner.nextDouble();
                        System.out.println("Enter The second Number: ");
                         y = scanner.nextDouble();
                        System.out.println(mul(x,y));
                        break;
                    case 4: // div
                        System.out.println("Enter The First Number: ");
                        x = scanner.nextDouble();
                        System.out.println("Enter The second Number: ");
                        y = scanner.nextDouble();
                        System.out.println(div(x,y));
                        break;
                    case 5: // sqrt
                        System.out.println("Enter The Number: ");
                        x = scanner.nextDouble();
                        System.out.println(sqrt(x));
                        break;
                    case 6: // power
                        break;
                    case 7: // sine
                        System.out.println("Enter The Number: ");
                        x = scanner.nextDouble();
                        System.out.println(sine(x));
                        break;
                    case 8:// cosine
                        System.out.println("Enter The Number: ");
                        x = scanner.nextDouble();
                        System.out.println(calcCosine(x));
                        break;
                    case 9: // tangent
                        System.out.println("Enter The Number: ");
                        x = scanner.nextDouble();
                        System.out.println(calculateTangent(x));
                        break;
                    case 10: // NLog
                        System.out.println("Enter The Number: ");
                        x = scanner.nextDouble();
                        System.out.println(calculateNaturalLogarithm(x));
                        break;
                    case 11: // Abs
                        System.out.println("Enter The Number: ");
                        x = scanner.nextDouble();
                        System.out.println(calculateAbsolute(x));
                        break;
                    case 12: //round
                        System.out.println("Enter The Number: ");
                        long z = scanner.nextLong();
                        System.out.println(roundNumber(z));
                        break;
                    case 13: // ceil
                        System.out.println("Enter The Number: ");
                        x = scanner.nextDouble();
                        System.out.println(ceilingNumber(x));
                        break;
                    case 14: // floor
                        System.out.println("Enter The Number: ");
                        x = scanner.nextDouble();
                        System.out.println(floorNumber(x));
                        break;
                    case 15: // min
                        System.out.println("Enter The First Number: ");
                        x = scanner.nextDouble();
                        System.out.println("Enter The second Number: ");
                        y = scanner.nextDouble();
                        System.out.println(findMin(x,y));
                        break;
                    case 16: // max
                        System.out.println("Enter The First Number: ");
                        x = scanner.nextDouble();
                        System.out.println("Enter The second Number: ");
                        y = scanner.nextDouble();
                        System.out.println(findMax(x,y));
                        break;
                    default: // not found
                        System.out.println("Sorry There is no operation for " + userChoice);
                        break;
                }

            }catch (Exception e){
                System.out.println("Invalid Input");
                scanner.nextLine();
                continue;
            }
        }
    };


    public static void displayMenu(){
        System.out.println("--Scientific Calculator--");
        System.out.println("0. Exit");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square Root");
        System.out.println("6. Power");
        System.out.println("7. Sine");
        System.out.println("8. Cosine");
        System.out.println("9. Tangent");
        System.out.println("10. Natural Logarithm");
        System.out.println("11. Absolute Value");
        System.out.println("12. Round Number");
        System.out.println("13. Ceiling Number");
        System.out.println("14. Floor Number");
        System.out.println("15. Minimum");
        System.out.println("16. Maximum");
    }

    public static void preformOperation(Scanner scanner,int choice){
//        if(twoOprands){
//            System.out.println("Enter The First Number: ");
//            double x = scanner.nextDouble();
//            System.out.println("Enter The second Number: ");
//            double y = scanner.nextDouble();
//        }else{
//
//        }

    }

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

    public static double calcPower(double x,double y){
        return Math.pow(x,y);
    }

    public static double sine(double x){
        return Math.sin(x);
    };

    public static double calcCosine(double x){
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