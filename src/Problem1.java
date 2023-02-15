public class Problem1 {

    /**
     * 10보다 작은 자연수 중에서 3 또는 5의 배수는 3, 5, 6, 9 이고, 이것을 모두 더하면 23입니다.
     *
     * 1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면 얼마일까요?
     */
    public static void main(String[] args) {
        final int MAX_VALUE = 1000;

        int x = 1;
        int sum = 0;
        while (x < MAX_VALUE) {
            if (x % 3 == 0 || x % 5 == 0) {
                sum += x;
            }
            x++;
        }

        System.out.println(sum);
    }
}
