
class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean negative = (dividend < 0) != (divisor < 0);

        long remaining = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        long count = 0;

        while (remaining >= d) {
            long multiple = d;
            long value = 1;

            while (remaining >= (multiple << 1)) {
                multiple = multiple << 1;
                value = value << 1;
            }

            remaining = remaining - multiple;
            count = count + value;
        }

        if (negative) {
            count = -count;
        }

        return (int) count;
    }
}
