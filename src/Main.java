import java.util.Scanner;

class Triangle {
    //one 50,one 20,two 5,three 1
    public boolean money (int x) {
        int state = 0;
        int money[];
        int y = 0,j;
        money = new int[]{50, 20, 5, 5, 1, 1, 1};
        int length = money.length;

        for ( j = 0; j < length; j++) {
            if (y < x) {
                y += money[j];
            } else if (y == x) {
                break;
            } else {
                if (j != 0) {
                    j -=1;
                    y -= money[j];
                }
            }
//            if(j==length-1){
//
//                return false;
//            }
        }
//        System.out.println(y);
//        System.out.println(j);
        if(j!=length){
            return true;
        }
        else if(x==y){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的金额：");
        int money = sc.nextInt();
        Triangle traignle = new Triangle();
        System.out.println(traignle.money(money));
    }
}