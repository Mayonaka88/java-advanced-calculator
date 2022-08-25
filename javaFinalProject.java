import java.util.Arrays;
import java.util.Scanner;
import java.util.Random; 
import java.math.*;

public class javaFinalProject {
    public static void main(String[] args) { 

        javaFinalProject.mainMenu();
        
    }
    public static void mainMenu() {
        System.out.println("Choose from the list below (Note: choose from 1 to 6):"+ "\n");
        System.out.println("1. Basic Calculator");
        System.out.println("2. Statistical Calculator");
        System.out.println("3. Matrix Calculator");
        System.out.println("4. Geometeric Calculator");
        System.out.println("5. Mini Games");
        System.out.println("6. Exist"+ "\n");
        Scanner input = new Scanner(System.in);
        int userChoice = input.nextInt();
        switch (userChoice) {
            case 1:javaFinalProject.basicCalculator();
            break;
            case 2:javaFinalProject.statCalc();
            break;
            case 3:javaFinalProject.matrixCalculator();
            break;
            case 4:javaFinalProject.geometericCalculator();
            break;
            case 5:javaFinalProject.games();
            break;
            case 6:
            break;
            default: System.out.println("\n"+"Your choice is invailed. Please choose a valied option");
                     javaFinalProject.mainMenu();
            break;
        }
    }

    public static void basicCalculator() {
        System.out.println("\n"+"Choose the operation you need (Note: choose from 1 to 5):"+ "\n");
        System.out.println("1. Basic Operations (+, -, *, /, ^)");
        System.out.println("2. Sum");
        System.out.println("3. Factorial");
        System.out.println("4. Percentage");
        System.out.println("5. Back to main menu"+ "\n");
        Scanner input = new Scanner(System.in);
        int userChoice = input.nextInt();
        switch (userChoice) {
            case 1:javaFinalProject.basicOperations();
            break;
            case 2:javaFinalProject.sum();
            break;
            case 3:javaFinalProject.factorial();
            break;
            case 4:javaFinalProject.percent();
            break;
            case 5:javaFinalProject.mainMenu();
            break;
            default: System.out.println("\n"+"Your choice is invailed. Please choose a valied option");
                     javaFinalProject.basicCalculator();
            break;
        }
    }

    public static void basicOperations() {
        System.out.println("\n"+"How many numbers are in your operation?");
        Scanner input = new Scanner(System.in);
        int numOfNums = input.nextInt();
        double outcome = 0;
        String outcomeString =" ";

        for(int count = 1; count < numOfNums; ++count){

            if(count==1){
                System.out.println("Enter your number:");
                double userNumber = input.nextDouble();
                System.out.println("Choose between +, -, *, /, ^");
                char operation = input.next().charAt(0);
                System.out.println("Enter your other number:");
                double userNumber2 = input.nextDouble();
                switch (operation) {
                    case '+': outcome = userNumber + userNumber2;
                        outcomeString = "( "+ userNumber + " + "+ userNumber2+" )";
                        System.out.println("\n"+outcomeString +" = "+ outcome + "\n");
                          break;
                    case '-': outcome = userNumber - userNumber2;
                        outcomeString = "( "+ userNumber + " - "+ userNumber2+" )";
                        System.out.println("\n"+outcomeString +" = "+ outcome + "\n");
                          break;
                    case '/': outcome = userNumber / userNumber2;
                        outcomeString = "( "+ userNumber + " / "+ userNumber2+" )";
                        System.out.println("\n"+outcomeString +" = "+ outcome + "\n");
                          break;
                    case '*': outcome = userNumber * userNumber2;
                        outcomeString = "( "+ userNumber + " * "+ userNumber2+" )";
                        System.out.println("\n"+outcomeString +" = "+ outcome + "\n");
                          break;
                    case '^': outcome = javaFinalProject.power(userNumber, userNumber2);
                        outcomeString = "( "+ userNumber + " ^ "+ userNumber2 +" )";
                        System.out.println("\n"+outcomeString +" = "+ outcome + "\n");
                          break;
                    default: System.out.println("\n"+"Choose a valid mathmatical operation");
                        javaFinalProject.basicOperations();
                    break;
                }
            }

            else{
                System.out.println("Choose between +, -, *, /, ^");
                char operation = input.next().charAt(0);
                System.out.println("Enter your other number:");
                double userNumber2 = input.nextDouble();
                switch (operation) {
                    case '+': outcome = outcome + userNumber2;
                        outcomeString = "( "+ outcomeString + " + "+ userNumber2+" )";
                        System.out.println("\n"+outcomeString +" = "+ outcome + "\n");
                          break;
                    case '-': outcome = outcome - userNumber2;
                        outcomeString = "( "+ outcomeString + " - "+ userNumber2+" )";
                        System.out.println("\n"+outcomeString +" = "+ outcome + "\n");
                          break;
                    case '/': outcome = outcome / userNumber2;
                        outcomeString = "( "+ outcomeString + " / "+ userNumber2+" )";
                        System.out.println("\n"+outcomeString +" = "+ outcome + "\n");
                          break;
                    case '*': outcome = outcome * userNumber2;
                        outcomeString = "( "+ outcomeString + " * "+ userNumber2 +" )";
                          System.out.println("\n"+outcomeString +" = "+ outcome + "\n");
                          break;
                    case '^': outcome = javaFinalProject.power(outcome, userNumber2);
                        outcomeString = "( "+ outcomeString + " ^ "+ userNumber2 +" )";
                        System.out.println("\n"+outcomeString +" = "+ outcome + "\n");
                        break;
                    default: System.out.println("\n"+"Choose a valid mathmatical operation");
                        javaFinalProject.basicOperations();
                    break;
                }
                
            }
            
        }
        javaFinalProject.basicCalculator();
    }

    public static double power(double num1, double num2) {
        double outcome = 1;
        for(int count = 0; count<num2; ++count ){
            outcome = outcome*num1;
        }
        return outcome;
    }

    public static void sum() {
        System.out.println("\n"+"Enter a number to find the sum:");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        int sum = 0;
        for (int count=1; count<=userInput; count=count + 1){
            sum = sum+count;
        }
        System.out.println("The sum of all the numbers from "+userInput+" to 0 is equal to " + sum);
        javaFinalProject.basicCalculator();
    }

    public static void factorial(){
        System.out.println("\n"+"Enter a number to find the factorial: ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        int factorial = 1;
        for (int count=1; count<=userInput; count=count + 1){
            factorial = factorial*count;
        }
        System.out.println(userInput+"! is equal to " + factorial);
        javaFinalProject.basicCalculator();
    }

    public static void percent() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n"+"What do you want to find?"+"\n");
        System.out.println("1. A number from a percentage");
        System.out.println("2. A percentage from a number");
        int userChoice = input.nextInt();
        switch (userChoice) {
            case 1:javaFinalProject.percent1();
            break;
            case 2:javaFinalProject.percent2();
            break;
            default: System.out.println("\n"+"Your choice is invailed. Please choose a valied option");
                     javaFinalProject.percent();
            break;
        }
    }

    public static void percent1() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n"+"Enter your percentage as a whole number (Example: 25 is 25%):");
        double percent = input.nextDouble();
        System.out.println("\n"+"Enter the number to find the percentage from: ");
        double fullNum = input.nextDouble();
        double outcome = ((percent*fullNum) / 100);
        System.out.println("\n"+percent+"% of "+fullNum+ " is equal to " + outcome);
        javaFinalProject.basicCalculator();
    }

    public static void percent2() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n"+"Enter your total number:");
        double fullNum = input.nextDouble();
        System.out.println("\n"+"Enter the number to find the percentage from the first: ");
        double sideNum = input.nextDouble();
        double outcome = ((sideNum*100) / fullNum);
        System.out.println("\n"+sideNum+" is "+outcome+ "% of " + fullNum);
        javaFinalProject.basicCalculator();
    }

    public static void geometericCalculator() {
        System.out.println("\n"+"Choose the operation you need (Note: choose from 1 to 4):"+ "\n");
        System.out.println("1. Area and Perimeter");
        System.out.println("2. Pythagorean Theorem");
        System.out.println("3. Measurement Finder");
        System.out.println("4. Back to main menu"+ "\n");
        Scanner input = new Scanner(System.in);
        int userChoice = input.nextInt();
        switch (userChoice) {
            case 1:javaFinalProject.areaAndPerimeter();
            break;
            case 2:javaFinalProject.pythagoreanTheorem();
            break;
            case 3:javaFinalProject.measurementFinder();
            break;
            case 4:javaFinalProject.mainMenu();
            break;
            default: System.out.println("\n"+"Your choice is invailed. Please choose a valied option");
                     javaFinalProject.geometericCalculator();
            break;
        }
    }

    public static void areaAndPerimeter() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n"+"Choose your shape:"+"\n");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Parallellogram");
        System.out.println("4. Triangle");
        System.out.println("5. Trapezium");
        System.out.println("6. Rhombus");
        System.out.println("7. Kite"+"\n");
        int userChoice = input.nextInt();
        switch (userChoice) {
            case 1:javaFinalProject.shapeSquareArea();
            break;
            case 2:
            case 3:javaFinalProject.shapeGroup1Area();
            break;
            case 4:javaFinalProject.shapeTriangleArea();
            break;
            case 5:javaFinalProject.shapeTrapeziumArea();
            break;
            case 6:
            case 7:javaFinalProject.shapeGroup2Area();
            break;
            default: System.out.println("\n"+"Your choice is invailed. Please choose a valied option");
            javaFinalProject.geometericCalculator();
            break;
        }
    }

    public static void shapeSquareArea() {
        Scanner input1 = new Scanner(System.in);
        System.out.println("\n"+"What do you want to find?"+"\n");
        System.out.println("1. Area");
        System.out.println("2. Perimeter");
        int userChoice = input1.nextInt();
        switch(userChoice){
            case 1:
            double area;
            System.out.println("\n"+"What is the length of one of the sides?");
            double length = input1.nextDouble();
            area = javaFinalProject.power(length, 2);
            System.out.println("\n"+"The area of your shape is " + area);
            javaFinalProject.geometericCalculator();
            break;
            case 2:
            javaFinalProject.shapeSquarePerimeter();
            break;
            default:
            System.out.println("\n"+"Your choice is invailed. Please choose a valied option");
            javaFinalProject.areaAndPerimeter();
            break;
        }
    }

    public static void shapeGroup1Area() {
        Scanner input1 = new Scanner(System.in);
        System.out.println("\n"+"What do you want to find?"+"\n");
        System.out.println("1. Area");
        System.out.println("2. Perimeter");
        int userChoice = input1.nextInt();
        switch(userChoice){
            case 1:
            double area;
            System.out.println("\n"+"What is the base?");
            double base = input1.nextDouble();
            System.out.println("\n"+"What is the height?");
            double height = input1.nextDouble();
            area = base*height;
            System.out.println("\n"+"The area of your shape is " + area);
            javaFinalProject.geometericCalculator();
            break;
            case 2:
            javaFinalProject.shapeGroup1perimeter();
            break;
            default:
            System.out.println("\n"+"Your choice is invailed. Please choose a valied option");
            javaFinalProject.areaAndPerimeter();
            break;
        }
    }

    public static void shapeTriangleArea() {
        Scanner input1 = new Scanner(System.in);
        System.out.println("\n"+"What do you want to find?"+"\n");
        System.out.println("1. Area");
        System.out.println("2. Perimeter");
        int userChoice = input1.nextInt();
        switch(userChoice){
            case 1:
            double area;
            System.out.println("\n"+"What is the base?");
            double base = input1.nextDouble();
            System.out.println("\n"+"What is the height?");
            double height = input1.nextDouble();
            area = (base*height)/2;
            System.out.println("\n"+"The area of your shape is " + area);
            javaFinalProject.geometericCalculator();
            break;
            case 2:
            javaFinalProject.shapeGroup2perimeter();
            break;
            default:
            System.out.println("\n"+"Your choice is invailed. Please choose a valied option");
            javaFinalProject.areaAndPerimeter();
            break;
        }
    }

    public static void shapeTrapeziumArea() {
        Scanner input1 = new Scanner(System.in);
        System.out.println("\n"+"What do you want to find?"+"\n");
        System.out.println("1. Area");
        System.out.println("2. Perimeter");
        int userChoice = input1.nextInt();
        switch(userChoice){
            case 1:
            double area;
            System.out.println("\n"+"What is the upper side?");
            double upperSide = input1.nextDouble();
            System.out.println("\n"+"What is the lower side?");
            double lowerSide = input1.nextDouble();
            System.out.println("\n"+"What is the height?");
            double height = input1.nextDouble();
            area = ((upperSide+lowerSide)*height)/2;
            System.out.println("\n"+"The area of your shape is " + area);
            javaFinalProject.geometericCalculator();
            break;
            case 2:
            javaFinalProject.shapeGroup1perimeter();
            break;
            default:
            System.out.println("\n"+"Your choice is invailed. Please choose a valied option");
            javaFinalProject.areaAndPerimeter();
            break;
        }
    }

    public static void shapeGroup2Area() {
        Scanner input1 = new Scanner(System.in);
        System.out.println("\n"+"What do you want to find?"+"\n");
        System.out.println("1. Area");
        System.out.println("2. Perimeter");
        int userChoice = input1.nextInt();
        switch(userChoice){
            case 1:
            double area;
            System.out.println("\n"+"What is the length?");
            double length = input1.nextDouble();
            System.out.println("\n"+"What is the height?");
            double height = input1.nextDouble();
            area = (base*length)/2;
            System.out.println("\n"+"The area of your shape is " + area);
            javaFinalProject.geometericCalculator();
            break;
            case 2:
            javaFinalProject.shapeGroup1perimeter();
            break;
            default:
            System.out.println("\n"+"Your choice is invailed. Please choose a valied option");
            javaFinalProject.areaAndPerimeter();
            break;
        }
        
    }

    public static void shapeGroup1perimeter() {
        Scanner input1 = new Scanner(System.in);
        double perimeter;
        System.out.println("\n"+"What is the length of side 1?");
        double side1 = input1.nextDouble();
        System.out.println("\n"+"What is the length of side 2?");
        double side2 = input1.nextDouble();
        System.out.println("\n"+"What is the length of side 3?");
        double side3 = input1.nextDouble();
        System.out.println("\n"+"What is the length of side 4?");
        double side4 = input1.nextDouble();
        perimeter = side1+side2+side3+side4;
        System.out.println("\n"+"The perimeter of your shape is " + perimeter);
        javaFinalProject.geometericCalculator();
    }

    public static void shapeGroup2perimeter() {
        Scanner input1 = new Scanner(System.in);
        double perimeter;
        System.out.println("\n"+"What is the length of side 1?");
        double side1 = input1.nextDouble();
        System.out.println("\n"+"What is the length of side 2?");
        double side2 = input1.nextDouble();
        System.out.println("\n"+"What is the length of side 3?");
        double side3 = input1.nextDouble();
        perimeter = side1+side2+side3;
        System.out.println("\n"+"The perimeter of your shape is " + perimeter);
        javaFinalProject.geometericCalculator();
    }

    public static void shapeSquarePerimeter() {
        Scanner input1 = new Scanner(System.in);
        double perimeter;
        System.out.println("\n"+"What is the length of one of the sides?");
        double side1 = input1.nextDouble();
        perimeter = side1*4;
        System.out.println("\n"+"The perimeter of your shape is " + perimeter);
        javaFinalProject.geometericCalculator();
    }

    public static void measurementFinder() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n"+"Choose your shape:"+"\n");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Parallellogram");
        System.out.println("4. Triangle");
        System.out.println("5. Rhombus");
        System.out.println("6. Kite"+"\n");
        int userChoice = input.nextInt();
        switch (userChoice) {
            case 1:
            case 2:
            case 3:javaFinalProject.shapeGroup1MeasurementFinder();
            break;
            case 4:
            case 5:
            case 6:javaFinalProject.shapeGroup2MeasurementFinder();
            break;
            default: System.out.println("\n"+"Your choice is invailed. Please choose a valied option");
            javaFinalProject.geometericCalculator();
            break;
        }
    }

    public static void shapeGroup1MeasurementFinder() {
        Scanner input1 = new Scanner(System.in);
        double measurement2;
        System.out.println("\n"+"Enter one of the measurements you have (length or height):");
        double measurement1 = input1.nextDouble();
        System.out.println("\n"+"Enter the area you have:");
        double area = input1.nextDouble();
        measurement2 = area/measurement1;
        System.out.println("\n"+"The missing measurement of your shape is " + measurement2);
        javaFinalProject.geometericCalculator();
    }

    public static void shapeGroup2MeasurementFinder() {
        Scanner input1 = new Scanner(System.in);
        double measurement2;
        System.out.println("\n"+"Enter one of the measurements you have (length or height):");
        double measurement1 = input1.nextDouble();
        System.out.println("\n"+"Enter the area you have:");
        double area = input1.nextDouble();
        measurement2 = (area*2)/measurement1;
        System.out.println("\n"+"The missing measurement of your shape is " + measurement2);
        javaFinalProject.geometericCalculator();
    }

    public static void pythagoreanTheorem () {
        Scanner input1 = new Scanner(System.in);
        double sideC;
        System.out.println("\n"+"Enter the measurements of the base:");
        double sideA = input1.nextDouble();
        System.out.println("\n"+"Enter the measurements of the hieght:");
        double sideB = input1.nextDouble();
        sideC = Math.sqrt(javaFinalProject.power(sideA, 2)+javaFinalProject.power(sideB, 2));
        System.out.println("\n"+"The hypotenuse of your right triangle is " + sideC);
        javaFinalProject.geometericCalculator();
    }

    public static void matrixCalculator() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n"+"What operation do you want to preform?");
        System.out.println("Choose between + and -");
        char operation = input.next().charAt(0);
        switch (operation) {
            case '+':javaFinalProject.addMatrices();
            break;
            case '-':javaFinalProject.subtractMatrices();
            break;
            default: System.out.println("\n"+"Your choice is invailed. Please choose a valied option");
                    javaFinalProject.matrixCalculator();
            break;
            }
    }

    public static void addMatrices() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n"+"How many rows are in your first matrix?");
        int matrix1Rows = input.nextInt();
        System.out.println("\n"+"How many columns are in your first matrix?");
        int matrix1Columns = input.nextInt();
        double[][] matrix1 = new double[matrix1Rows][matrix1Columns];
        System.out.println("\n"+"For your first matrix:");
        for(int count = 0; count<matrix1Rows; ++count){
            for(int count1 = 0; count1<matrix1Columns; ++count1){
                System.out.println("\n"+"Enter your number in row "+(count+1)+" and column "+ (count1+1));
                matrix1[count][count1] = input.nextDouble();
            }
        }

        System.out.println("\n"+"How many rows are in your second matrix?");
        int matrix2Rows = input.nextInt();
        System.out.println("\n"+"How many columns are in your second matrix?");
        int matrix2Columns = input.nextInt();
        double[][] matrix2 = new double[matrix2Rows][matrix2Columns];
        System.out.println("\n"+"For your second matrix:");
        for(int count = 0; count<matrix2Rows; ++count){
            for(int count1 = 0; count1<matrix2Columns; ++count1){
                System.out.println("\n"+"Enter your number in row "+(count+1)+" and column "+ (count1+1));
                matrix2[count][count1] = input.nextDouble();
            }
        }

        if((matrix1Rows != matrix2Rows)||(matrix1Columns != matrix2Columns)){
            System.out.println("\n"+"Operation could not be preformed because the matrices are not the same size" + "\n");
            javaFinalProject.mainMenu();
        }

        else{
            double[][] outcomeMatrix = new double[matrix1Rows][matrix1Columns];
            for(int count = 0; count<matrix1Rows; ++count){
                for(int count1 = 0; count1<matrix1Columns; ++count1){
                    outcomeMatrix[count][count1] = matrix1[count][count1] + matrix2[count][count1];
                }
            }
            for(int count = 0; count<matrix1Rows; ++count){
                System.out.println();
                for(int count1 = 0; count1<matrix1Columns; ++count1){
                    System.out.print(outcomeMatrix[count][count1]+"\t");
                }
            }
            System.out.println("\n");
            javaFinalProject.mainMenu();
        }
        
    }

    public static void subtractMatrices() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n"+"How many rows are in your first matrix?");
        int matrix1Rows = input.nextInt();
        System.out.println("\n"+"How many columns are in your first matrix?");
        int matrix1Columns = input.nextInt();
        double[][] matrix1 = new double[matrix1Rows][matrix1Columns];
        System.out.println("\n"+"For your first matrix:");
        for(int count = 0; count<matrix1Rows; ++count){
            for(int count1 = 0; count1<matrix1Columns; ++count1){
                System.out.println("\n"+"Enter your number in row "+(count+1)+" and column "+ (count1+1));
                matrix1[count][count1] = input.nextDouble();
            }
        }

        System.out.println("\n"+"How many rows are in your second matrix?");
        int matrix2Rows = input.nextInt();
        System.out.println("\n"+"How many columns are in your second matrix?");
        int matrix2Columns = input.nextInt();
        double[][] matrix2 = new double[matrix2Rows][matrix2Columns];
        System.out.println("\n"+"For your second matrix:");
        for(int count = 0; count<matrix2Rows; ++count){
            for(int count1 = 0; count1<matrix2Columns; ++count1){
                System.out.println("\n"+"Enter your number in row "+(count+1)+" and column "+ (count1+1));
                matrix2[count][count1] = input.nextDouble();
            }
        }

        if((matrix1Rows != matrix2Rows)||(matrix1Columns != matrix2Columns)){
            System.out.println("\n"+"Operation could not be preformed because the matrices are not the same size" + "\n");
            javaFinalProject.mainMenu();
        }

        else{
            double[][] outcomeMatrix = new double[matrix1Rows][matrix1Columns];
            for(int count = 0; count<matrix1Rows; ++count){
                for(int count1 = 0; count1<matrix1Columns; ++count1){
                    outcomeMatrix[count][count1] = matrix1[count][count1] - matrix2[count][count1];
                }
            }
            for(int count = 0; count<matrix1Rows; ++count){
                System.out.println();
                for(int count1 = 0; count1<matrix1Columns; ++count1){
                    System.out.print(outcomeMatrix[count][count1]+"\t");
                }
            }
            System.out.println("\n");
            javaFinalProject.mainMenu();
        }
        
    }

    public static void statCalc() {
        double mean = 0;
        double median;
        double range;
        double sampleVariance;
        double populationVariance;
        double sampleDeviation;
        double populationDeviation;

        Scanner input = new Scanner(System.in);
        System.out.println("\n"+"How many values do you have?");
        int size = input.nextInt();
        double[] data = new double[size];

        for(int count = 0; count<size; ++count){
            System.out.println("\n"+"Enter the value of value "+(count+1));
            data[count] = input.nextDouble();
            mean = mean + data[count];
        }
        Arrays.sort(data);
        mean = mean/size;
        if(size%2 != 0){
            median = data[(size)/2];
        }
        else{
            median = ((data[((size)/2)] + data[((size)/2)-1]) / 2);
        }
        range = data[size-1]-data[0];
        double sumOfMeanAndData=0;
        for(int count = 0; count<size; ++count){
            sumOfMeanAndData = sumOfMeanAndData + (mean-data[count]);
        }
        sampleVariance = sumOfMeanAndData/(size-1);
        populationVariance = sumOfMeanAndData/(size-1);
        sampleDeviation = Math.sqrt(sampleVariance);
        populationDeviation = Math.sqrt(populationVariance);

        System.out.println("\n"+"Mean = " +mean);
        System.out.println("Median = " +median);
        System.out.println("Range = " +range);
        System.out.println("Sum Of (Mean - Data) = " +sumOfMeanAndData);
        System.out.println("Sample Variance = " +sampleVariance);
        System.out.println("Population Variance = " +populationVariance);
        System.out.println("Sample Deviation = " +sampleDeviation);
        System.out.println("Population Deviation = " +populationDeviation +"\n");

        javaFinalProject.mainMenu();

    }

    public static void games() {

        Scanner input = new Scanner(System.in);
        System.out.println("\n"+"What game do you want to play today?"+"\n");
        System.out.println("1. Rock Paper Scissors");
        System.out.println("2. Russian Roulette");
        System.out.println("3. Back to main menu"+"\n");
        int userChoice = input.nextInt();
        switch (userChoice) {
            case 1:System.out.println("Welcome to Rock Paper Scissors!" + "\n");
            javaFinalProject.rockPaperScissorsGame(0, 0);
            break;
            case 2:javaFinalProject.russianRoulette();
            break;
            case 3:javaFinalProject.mainMenu();
            break;
            default: System.out.println("\n"+"Your choice is invailed. Please choose a valied option");
            javaFinalProject.games();
            break;
        }
        
    }

    public static void rockPaperScissorsGame(int userScore, int pcScore) {
        Random rand = new Random(); 
        int pcChoice = rand.nextInt(3);
        int userNumber = 3;
        Scanner input = new Scanner(System.in);
        System.out.println("Choose between Rock, Paper or Scissors:"+"\n");
        
        char userChoice = input.next().charAt(0);
        switch (userChoice) {
            case 'r':
            case 'R':userNumber = 0;
            break;
            case 'p':
            case 'P':userNumber = 1;
            break;
            case 's':
            case 'S':userNumber = 2;
            break;
            default: System.out.println("\n"+"Your choice is invailed. Please choose a valied option");
                    javaFinalProject.games();
            break;
        }
        
        if(userNumber == 0){
            if(pcChoice==1){
                pcScore = pcScore+1;
            }
            else if(pcChoice==2){
                userScore = userScore+1;
            }
            else{
                System.out.println("\n"+"Both of you and the computer chose the same thing! No one wins!"+"\n");
            }
        }
        if(userNumber == 1){
            if(pcChoice==0){
                userScore = userScore+1;
            }
            else if(pcChoice==2){
                pcScore = pcScore+1;
            }
            else{
                System.out.println("\n"+"Both of you and the computer chose the same thing! No one wins!"+"\n");
            }
        }
        else{
            if(pcChoice==0){
                pcScore = pcScore+1;
            }
            else if(pcChoice==1){
                userScore = userScore+1;
            }
            else{
                System.out.println("Both of you and the computer chose the same thing! No one wins!"+"\n");
            }
        }
        System.out.println("\n"+"User Score: "+userScore);
        System.out.println("Computer Score: "+pcScore);
        if(userScore>pcScore){
            System.out.println("\n"+"The user is winning!");
        }
        else if(userScore<pcScore){
            System.out.println("\n"+"The computer is winning!");
        }
        else{
            System.out.println("\n"+"It's a tie!");
        }

        System.out.println("Do you want to continue?"+"\n");
        System.out.println("1. Yes");
        System.out.println("2. No"+"\n");
        
        int userChoice1 = input.nextInt();
        switch (userChoice1) {
            case 1:javaFinalProject.rockPaperScissorsGame(userScore, pcScore);
            break;
            case 2:System.out.println("Thank you for playing!"+"\n");
            javaFinalProject.mainMenu();
            break;
            default: System.out.println("\n"+"Your choice is invailed. Please choose a valied option");
                    javaFinalProject.games();
            break;
        }
    }

    public static void russianRoulette() {
        boolean[] chambers = new boolean[6];
        Random rand = new Random();
        for(int count = 0; count<6; ++count){
            chambers[count] = false;
        }
        chambers[rand.nextInt(6)] = true;
        System.out.println("\n"+"Choose a number between 1 to 6:");
        Scanner input = new Scanner(System.in);
        int userChoice = input.nextInt();
        userChoice = userChoice - 1;
        switch(userChoice){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            break;
            default:System.out.println("\n"+"Your choice is invailed. Please choose a valied option");
            javaFinalProject.games();
            break;
        }
        int pcChoice = rand.nextInt(6);
        if(chambers[userChoice]==true){
            System.out.println("\n"+"The chamber was loaded! Game Over! You died!");
            javaFinalProject.games();
        }
        else{
            System.out.println("\n"+"You survived! It is the computer's turn now!");
            if(chambers[pcChoice]==true){
                System.out.println("\n"+"The chamber was loaded! The computer died! You win!");
                javaFinalProject.games();
            }
            else{
                System.out.println("\n"+"The computer survived!");
                javaFinalProject.russianRoulette();
            }
        }
    }

    



}