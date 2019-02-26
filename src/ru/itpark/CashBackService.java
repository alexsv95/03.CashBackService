package ru.itpark;

public class CashBackService {
    public int calculate (int monthCostsRegular, int monthCostsHigh, int monthCostsExtra) {
        if (monthCostsRegular <= 0) {
            return 0;
        }
        if (monthCostsHigh <= 0) {
            return 0;
        }
        if (monthCostsExtra <= 0) {
            return 0;
        }
        int percentRegular = 1;
        int percentHigh = 5;
        int percentExtra = 30;
        int limit = 3_000;

        int result = (monthCostsRegular * percentRegular / 100) + (monthCostsHigh * percentHigh / 100) + (monthCostsExtra * percentExtra / 100);

        if (result > limit) {
            return limit;
        }
        return result;
    }
}
