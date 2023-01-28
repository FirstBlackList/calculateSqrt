package ru.netology.sqr;

public class SqrtService {
    public int sqrtCalc(int minRange, int maxRange) {
        int numberOfSqr = 0;
        for (int i = 10; i <= 90; i++) {
            if (i * i >= minRange && i * i <= maxRange) {
                numberOfSqr++;
            }
        }
        System.out.println("Number of square roots: " + numberOfSqr);
        return numberOfSqr;
    }
}
