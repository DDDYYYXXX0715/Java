public class OddSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) { // 判断是否为奇数
                sum += i;
            }
        }
        System.out.println("1+3+5+...+99的和为：" + sum);
    }
}

