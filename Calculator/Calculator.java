/*
    @author: Prashant Kumar Moroliya

    WAP to make a calculator app (No GUI.. simple terminal outpuut calculator).
        - It is allowed to do few operations. Such as,
            -- Addition.
            -- Subtraction.
            -- Multiplication.
            -- Division.
            -- Modulo.
            -- Special Operations.
                --- Square Root.
                --- Square.
                --- Cube Root.
                --- Exponential Operations.
                --- Logorithmic Operations.
                --- Trignometric Functions.
                --- Hyperbolic Functions.
 */

import java.util.*;
import java.lang.*;
import java.lang.reflect.Array;

class SpecialOperations {
    Scanner scan = new Scanner(System.in);

    // function to get Exponential Operations...
    public double exponentialOperation(double expoValue) {
        return Math.exp(expoValue);
    }

    // Function to get square root...
    public double squareRoot(double sqRootValue) {
        return Math.sqrt(sqRootValue);
    }

    // Function to get cube root...
    public double cubeRoot(double cubeRootValue) {
        return Math.cbrt(cubeRootValue);
    }

    // Function to get square of a value...
    public double square(double squareValue) {
        return Math.pow(squareValue, 2);
    }

    // Function to get logarithmic value...
    public double logOfValue(double logInput) {
        return Math.log(logInput);
    }

    // Function to get Trignometric Functions...
    public void trignometricFunctions(double degree) {
        double radian = Math.toRadians(degree);

        System.out.println("What trignometric function you want to perform on?");
        System.out.println("1. Trignometric Functions.");
        System.out.println("2. Inverse Trignometric Functions.");
        int choice = scan.nextInt();
        switch (choice) {
            case 1: {   // Trignometric Function.
                System.out.println("1. Sine     (sin)");
                System.out.println("2. Cosine   (cos)");
                System.out.println("3. Tangent  (tan)");
                System.out.println("4. Cosecant (cosec)");
                System.out.println("5. Secant   (sec)");
                System.out.println("6. Cotangent (cot)");
                int ch = scan.nextInt();
                switch (ch) {
                    case 1: { // sin
                        System.out.println("sin " + degree + " = " + Math.sin(radian));
                        break;
                    }
                    case 2: { // cos
                        System.out.println("cos " + degree + " = " + Math.cos(radian));
                        break;
                    }
                    case 3: { // tan
                        System.out.println("tan " + degree + " = " + Math.tan(radian));
                        break;
                    }
                    case 4: { // cosec
                        System.out.println("cosec " + degree + " = " + (1 / Math.sin(radian)));
                        break;
                    }
                    case 5: { // sec
                        System.out.println("sec " + degree + " = " + (1 / Math.cos(radian)));
                        break;
                    }
                    case 6: { // cot
                        System.out.println("cot " + degree + " = " + (1 / Math.tan(radian)));
                        break;
                    }
                }
                break;
            }

            case 2: {   // Inverse Trignometric Function.
                System.out.println("1. Inverse Sine      or Arcsine       (sin^-1)");
                System.out.println("2. Inverse Cosine    or Arccosine     (cos^-1)");
                System.out.println("3. Inverse Tangent   or Arctangent    (tan^-1)");
                System.out.println("4. Inverse Cosecant  or Arccosecant   (cosec^-1)");
                System.out.println("5. Inverse Secant    or Arcsecant     (sec^-1)");
                System.out.println("6. Inverse Cotangent or Arccotangent  (cot^-1)");
                int ch = scan.nextInt();
                switch (ch) {
                    case 1: { // sin^-1
                        System.out.println("sin^-1 " + degree + " = " + Math.asin(radian));
                        break;
                    }
                    case 2: { // cos^-1
                        System.out.println("cos^-1 " + degree + " = " + Math.acos(radian));
                        break;
                    }
                    case 3: { // tan^-1
                        System.out.println("tan^-1 " + degree + " = " + Math.atan(radian));
                        break;
                    }
                    case 4: { // cosec^-1
                        System.out.println("cosec^-1 " + degree + " = " + (1 / Math.asin(radian)));
                        break;
                    }
                    case 5: { // sec^-1
                        System.out.println("sec^-1 " + degree + " = " + (1 / Math.acos(radian)));
                        break;
                    }
                    case 6: { // cot^-1
                        System.out.println("cot^-1 " + degree + " = " + (1 / Math.atan(radian)));
                        break;
                    }
                }
                break;
            }
            default:
                System.out.println("Enter correct input");
                break;
        }
    }

    // Function to get Hyperbolic Functions...
    public void hyperbolicFunctions(double degree) {
        double radian = Math.toRadians(degree);

        double sol = 0;

        double invSinHA = Math.log(radian + Math.sqrt((radian * radian) + 1));
        double invCosHA = Math.log(radian + Math.sqrt((radian * radian) - 1));
        double invTanHA = Math.log(1 + radian / 1 - radian) / 2;
        double invCosecHA = Math.log(1 + Math.sqrt((1 + (radian * radian)) / radian));
        double invSecHA = Math.log(1 + Math.sqrt((1 - (radian * radian)) / radian));
        double invCotHA = Math.log(1 + radian / 1 - radian) / 2;

        System.out.println("What trignometric function you want to perform on?");
        System.out.println("1. Hyperbolic Functions.");
        System.out.println("2. Inverse Hyperbolic Functions.");
        int choice = scan.nextInt();
        switch (choice) {
            case 1: {   // Trignometric Function.
                System.out.println("1. Hyperbolic Sine      (sinh)");
                System.out.println("2. Hyperbolic Cosine    (cosh)");
                System.out.println("3. Hyperbolic Tangent   (tanh)");
                System.out.println("4. Hyperbolic Cosecant  (cosech)");
                System.out.println("5. Hyperbolic Secant    (sech)");
                System.out.println("6. Hyperbolic Cotangent (coth)");
                int ch = scan.nextInt();
                switch (ch) {
                    case 1: { // sinh
                        System.out.println("sinh " + degree + " = " + Math.sinh(radian));
                        break;
                    }
                    case 2: { // cosh
                        System.out.println("cosh " + degree + " = " + Math.cosh(radian));
                        break;
                    }
                    case 3: { // tanh
                        System.out.println("tanh " + degree + " = " + Math.tanh(radian));
                        break;
                    }
                    case 4: { // cosech
                        System.out.println("cosech " + degree + " = " + (1 / Math.sinh(radian)));
                        break;
                    }
                    case 5: { // sech
                        System.out.println("sech " + degree + " = " + (1 / Math.cosh(radian)));
                        break;
                    }
                    case 6: { // coth
                        System.out.println("coth " + degree + " = " + (1 / Math.tanh(radian)));
                        break;
                    }
                }
                break;
            }

            case 2: {   // Inverse Trignometric Function.
                System.out.println("1. Inverse Hyperbolic Sine      (sinh^-1)");
                System.out.println("2. Inverse Hyperbolic Cosine    (cosh^-1)");
                System.out.println("3. Inverse Hyperbolic Tangent   (tanh^-1)");
                System.out.println("4. Inverse Hyperbolic Cosecant  (cosech^-1)");
                System.out.println("5. Inverse Hyperbolic Secant    (sech^-1)");
                System.out.println("6. Inverse Hyperbolic Cotangent (coth^-1)");
                int ch = scan.nextInt();
                switch (ch) {
                    case 1: { // sinh^-1
                        System.out.println("sinh^-1 " + degree + " = " + invSinHA);
                        break;
                    }
                    case 2: { // cosh^-1
                        System.out.println("cosh^-1 " + degree + " = " + invCosHA);
                        break;
                    }
                    case 3: { // tanh^-1
                        System.out.println("tanh^-1 " + degree + " = " + invTanHA);
                        break;
                    }
                    case 4: { // cosech^-1
                        System.out.println("cosech^-1 " + degree + " = " + invCosecHA);
                        break;
                    }
                    case 5: { // sech^-1
                        System.out.println("sech^-1 " + degree + " = " + invSecHA);
                        break;
                    }
                    case 6: { // coth^-1
                        System.out.println("coth^-1 " + degree + " = " + invCotHA);
                        break;
                    }
                }
                break;
            }
            default:
                System.out.println("Enter correct input");
                break;
        }
    }
}

class Calculator {
    public static void main(String[] args) {
        SpecialOperations so = new SpecialOperations();

        Scanner scan = new Scanner(System.in);

        int numOfInputValues;

        System.out.println("----------------------------------------------------");
        System.out.println("------------------ CALCULATOR ----------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("<+> Addition.");
        System.out.println("<-> Subtraction.");
        System.out.println("<*> Multiplication.");
        System.out.println("</> Division.");
        System.out.println("<%> Modulo.");
        System.out.println("<$> Special Operations.");
        System.out.println("<e> Exit");
        System.out.print("What operation you want to perform? :");
        char ops = scan.next().charAt(0);
        switch (ops) {
            // Addition ops...
            case '+': {
                double addition = 0.0;

                System.out.print("How many values you want to perform the calculation? : ");
                numOfInputValues = scan.nextInt();

                double valuesInput[] = new double[numOfInputValues];

                for (int i = 0; i < valuesInput.length; i++) {
                    System.out.print("Enter " + (i + 1) + " value: ");
                    valuesInput[i] = scan.nextDouble();
                }

                for (double i : valuesInput) {
                    addition += i;
                }
                System.out.println("Addition of " + numOfInputValues + " input values = " + addition);
                break;
            }

            // Subtraction ops...
            case '-': {
                double subtraction = 0.0;

                System.out.print("How many values you want to perform the calculation? : ");
                numOfInputValues = scan.nextInt();

                double valuesInput[] = new double[numOfInputValues];

                for (int i = 0; i < valuesInput.length; i++) {
                    System.out.print("Enter " + (i + 1) + " value: ");
                    valuesInput[i] = scan.nextDouble();
                }

                for (int i = 0; i < valuesInput.length; i++) {
                    valuesInput[i] = valuesInput[1] + valuesInput[i];
                    subtraction = valuesInput[0] - valuesInput[i];
                }
                System.out.println("Subtraction of " + numOfInputValues + " input values = " + subtraction);
                break;
            }

            // Multiplication ops...
            case '*': {
                double multiply = 1.0;

                System.out.print("How many values you want to perform the calculation? : ");
                numOfInputValues = scan.nextInt();

                double valuesInput[] = new double[numOfInputValues];

                for (int i = 0; i < valuesInput.length; i++) {
                    System.out.print("Enter " + (i + 1) + " value: ");
                    valuesInput[i] = scan.nextDouble();
                }

                for (double i : valuesInput) {
                    System.out.println(i);
                    multiply *= i;
                }
                System.out.println("Multiplication of " + numOfInputValues + " input values = " + multiply);
                break;
            }

            // Division ops...
            case '/': {
                double division = 0.0;

                System.out.print("Enter numerator : ");
                double numerator = scan.nextDouble();
                System.out.print("Enter denominator : ");
                double denominator = scan.nextDouble();

                if (denominator == 0) {
                    System.out.println("Division not possible. You can't divide a number with '0'.");
                } else if (denominator == 1) {
                    System.out.println("Division of " + numerator + "/" + denominator + " = " + numerator);
                } else {
                    division = numerator / denominator;
                    System.out.println("Division of " + numerator + "/" + denominator + " = " + division);
                }
                break;
            }

            // Modulo ops...
            case '%': {
                double remainder = 0.0;

                System.out.print("Enter first number which is dividend : ");
                double firstNumber = scan.nextDouble();
                System.out.print("Enter second number which is divisor : ");
                double secondNumber = scan.nextDouble();

                if (secondNumber == 0) {
                    System.out.println("Division not possible. You can't divide a number with '0'.");
                } else {
                    remainder = firstNumber % secondNumber;
                    System.out.println(firstNumber + " mod " + secondNumber + "[" + firstNumber + "%" + secondNumber + "] = " + remainder);
                }
                break;
            }

            // Special ops...
            case '$': {
                System.out.println("--------------------------------------");
                System.out.println("----------SPECIAL OPERATIONS----------");
                System.out.println("--------------------------------------");
                System.out.println("1. Squares");
                System.out.println("2. Square Roots");
                System.out.println("3. Cube Roots");
                System.out.println("4. Exponential Operations");
                System.out.println("5. Logorithmic Operations");
                System.out.println("6. Trignometric Functions");
                System.out.println("7. Hyperbolic Functions");
                System.out.println("8. Return to menu.");
                System.out.println("9. Exit");
                System.out.println("Enter your choice: ");
                int choice = scan.nextInt();

                if (choice == 1) {  // Square...
                    System.out.print("Enter number of which you want square: ");
                    double squareValue = scan.nextDouble();
                    System.out.println("Square of " + squareValue + " = " + so.square(squareValue));
                    break;
                } else if (choice == 2) {     // Square Root...
                    System.out.print("Enter number of which you want square root: ");
                    double squareRootValue = scan.nextDouble();
                    System.out.println("Square of " + squareRootValue + " = " + so.squareRoot(squareRootValue));
                    break;
                } else if (choice == 3) {     // Cube Root...
                    System.out.print("Enter number of which you want square root: ");
                    double cubeRootValue = scan.nextDouble();
                    System.out.println("Square of " + cubeRootValue + " = " + so.cubeRoot(cubeRootValue));
                    break;
                } else if (choice == 4) {     // Exponential Operations...
                    System.out.print("Enter exponent or power of exponential: ");
                    double exponentValueOfExpo = scan.nextDouble();
                    System.out.println("Exponential value [e^" + exponentValueOfExpo + "]" + so.exponentialOperation(exponentValueOfExpo));
                    break;
                } else if (choice == 5) {     // Logorithmic Operations...
                    System.out.print("Enter value to find the natural log of: ");
                    double logValue = scan.nextDouble();
                    System.out.println("Square of " + logValue + " = " + so.logOfValue(logValue));
                    break;
                } else if (choice == 6) {     // Trignometric Functions...
                    System.out.print("Enter degree to which you want to perform Trignometric Operations: ");
                    double degreeTrigno = scan.nextDouble();
                    so.trignometricFunctions(degreeTrigno);
                    break;
                } else if (choice == 7) {     // Hyperbolic Functions...
                    System.out.print("Enter degree to which you want to perform Hyperbolic Operations: ");
                    double degreeHyper = scan.nextDouble();
                    so.hyperbolicFunctions(degreeHyper);
                    break;
                } else if (choice == 8) {
                    break;
                } else if (choice == 9) {
                    System.out.println("Turning off calculator.");
                    return;
                } else {
                    System.out.println("Enter correct choice.");
                }
            }

            // Exit Calculator...
            case 'e': {
                System.out.println("Turning off calculator.");
                return;
            }

            default:
                System.out.println("enter correct option.");
                break;
        }
    }
}
