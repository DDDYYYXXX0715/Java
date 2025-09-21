//输入 10 个数并排序，用数组和 for 循环写；
import java.util.Scanner;
public class SortNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];//创建一个长度为10的整型数组
        System.out.println("请输入10个整数：");
        for(int i = 0; i < 10; i ++){
            numbers[i] = scanner.nextInt();//读取用户输入的整数并存入数组；
        }
        scanner.close();
        for(int i = 0; i < numbers.length - 1; i ++){
            for(int j = 0; j < numbers.length-i-1; j++){
                if(numbers[j] > numbers[j + 1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("排序后数组：");
        for (int i = 0; i < numbers.length; i ++){
            System.out.print(numbers[i] + " ");
        }
    }
}
