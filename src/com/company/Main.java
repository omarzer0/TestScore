package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // init a scanner to get inputs from command line
        Scanner sc = new Scanner(System.in);

        // show message asking the user for each input
        System.out.println("enter the first number");
        double firstInput = sc.nextDouble();

        System.out.println("enter the second number");
        double secondInput = sc.nextDouble();

        System.out.println("enter the third number");
        double thirdInput = sc.nextDouble();

        // take object
        TestScores testScores = new TestScores(firstInput,secondInput,thirdInput);
        System.out.println("the Average = " +  testScores.getAverage());
    }
}


 class TestScores {
    private double testScore1;
    private double testScore2;
    private double testScore3;

    public TestScores(double testScore1, double testScore2, double testScore3) {
        this.testScore1 = testScore1;
        this.testScore2 = testScore2;
        this.testScore3 = testScore3;
    }

    public double getTestScore1() {
        return testScore1;
    }

    public void setTestScore1(double testScore1) {
        this.testScore1 = testScore1;
    }

    public double getTestScore2() {
        return testScore2;
    }

    public void setTestScore2(double testScore2) {
        this.testScore2 = testScore2;
    }

    public double getTestScore3() {
        return testScore3;
    }

    public void setTestScore3(double testScore3) {
        this.testScore3 = testScore3;
    }

    // method that returns the average
    public double getAverage(){
        return ((testScore1+testScore2+testScore3)/3);
    }
}