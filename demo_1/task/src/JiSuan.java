public class JiSuan {
    public static void main(String[] args) {
//        double x=1.0;
//        double y= 5.0;
//        double z= x-- + (++y);
//        double m= x-- + y++;
//        System.out.println("z= "+z);
//        System.out.println("m= "+m);

        int y = 0;
        for(int x= 0;x < 10; ++x){
            y += x;
        }
        System.out.println(y);
    }
}
