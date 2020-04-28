package com.changhay.sell.utils;

public class MathUtil {

    private static final double MONEY_RANGE = 0.01;

    /**
     * 比较2个金额是否相等
     * @param d1
     * @param d2
     * @return
     */
    public static boolean equals(double d1, double d2) {
        double result = Math.abs(d1 - d2);
        if (result < MONEY_RANGE) {
            return true;
        }

        return false;
    }

}
