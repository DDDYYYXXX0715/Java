import java.util.Scanner;
public class CharTypeCounter{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入一行字符：");
        String inline = scanner.nextLine();
        int upper = 0;
        int lower = 0;
        int digit = 0;
        int space = 0;
        int other = 0;
        for(int i = 0; i< inline.length(); i ++){
            char ch = inline.charAt(i);
            if(Character.isUpperCase(ch))
                upper ++;
            else if(Character.isLowerCase(ch))
                lower ++;
            else if(Character.isDigit(ch))
                digit ++;
            else if(Character.isSpaceChar(ch))
                space ++;
            else
                other ++;
        }
        System.out.println("大写字母个数："+ upper);
        System.out.println("小写字母个数："+ lower);
        System.out.println("数字个数："+ digit);
        System.out.println("空格个数："+ space);
        System.out.println("其他字符个数："+ other);
    }
}