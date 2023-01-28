package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SqrtServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/parametrs.csv")
    void calculateSqrRange(int expected, int minRange, int maxRange) {
        SqrtService sqrService = new SqrtService();

        int actual = sqrService.sqrtCalc(minRange, maxRange);
        assertEquals(expected, actual);
    }

}