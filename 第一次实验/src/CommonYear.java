// 从屏幕输出 1800 年到 2024 年之间的所有平年
public class CommonYear {
    public static void main(String[] args) {
        System.out.println("1800-2024年的所有平年：");
        int count = 0;
        for(int year = 1800; year <= 2024; year++){
            if(!(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                System.out.print(year + " ");
                count ++;
                if(count % 10 == 0){
                    System.out.println();
                }
            }
        }
    }
}
