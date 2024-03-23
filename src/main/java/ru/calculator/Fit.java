package ru.calculator;

public class Fit {
        public static double manWeight(short heightMan) {
            return (heightMan - 100) * 1.15;
        }

        public static double womanWeight(short heightWoman) {
            return (heightWoman - 110) * 1.15;
        }

        public static void main(String[] args) {
            short heightMan = 187;
            double man = Fit.manWeight(heightMan);
            System.out.println("Man 187 is " + man);
            short heightWoman = 168;
            double woman = Fit.womanWeight(heightWoman);
            System.out.println("Woman 168 is " + woman);
        }
    }

