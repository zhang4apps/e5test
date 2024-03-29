import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args){
        // double F = conC(80);
        // System.out.println(F);
        // System.out.println((int)'张'+""+(int)'健');

        /* long l=2147483648l;
        System.out.println(Integer.MAX_VALUE);
        if (l>Integer.MAX_VALUE){
            System.out.println("数值过大，无法转换");
        }else {
            int lor = (int) l;
            System.out.println(lor);
        }*/

       /* int i = 1;
        int j = i++ + ++i * i++;
        System.out.println(j);*/

/*        int m = 1;
        int n = 2;
        System.out.println(m = n);*/
        /*int i = 2;
        int j = i++;
        System.out.println(j);

        int m = 2;
        m=m++;
        System.out.println(m);*/
     /*   Scanner scanner= new Scanner(System.in);
        System.out.println("个数：");
        int fan = scanner.nextInt();
        evenNum(fan);

        scanner.close();*/
        //yue(12,20);
//printb();
        primeNum();

    }

    public static void primeNum() {
        boolean isP = true;
       label: for (int i = 2; i < 100; i++) {
           isP = true;
            for (int j = 2; j < i; j++) {
                if (i%j==0){
                    isP = false;
                    continue label;
                }
            }
            if (isP){
                System.out.println(i);
            }

        }

    }

    public static double conC(double F){
        double C = (F-32)/1.8;
        return C;
    }

    public static int zhuan(long l){
        if (l>Integer.MAX_VALUE){
            System.out.println("数值过大，无法转换");
            return 0;
        }
        int lor =(int) l;
        return lor;
    }

    public static String score(int score){
        if (score==100){
            return "奖励一辆跑车";
        }else if (score<=99&&score>=80){
            return "奖励一辆山地自行车";
        }else if (score<80&&score>=60){
            return "奖励环球影城一日游";
        }else {
            return "兔崽子想挨揍了是吧？";
        }


    }
    public static void switchCaseExer(int i){
        switch (i){
            default:
                System.out.println(6);
                break;
            case 0:
                System.out.println(0);
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
        }
    }


    public static void evenNum(int fan){
        int count = 0;//个数
        int sum = 0; //和
        for (int i = 0;i<=fan;i++){
            if (i%2==0){
                System.out.println(i);
                count++;
                sum+=i;
            }
        }
        System.out.println(fan+"以内，偶数的个数为："+count+"，总和为："+sum);

    }

    //水仙花数
    public static void shui(){
        int count = 0;
        int bai = 0;
        int shi = 0;
        int ge = 0;
        for (int i= 100;i<1000;i++){
            bai = i/100;
            shi = i % 100 / 10;
            ge = i%10;
            if (i == bai*bai*bai+shi*shi*shi+ge*ge*ge){
                System.out.println(bai+"|"+shi+"|"+ge);
                count++;
                System.out.println(i);
            }

        }
        System.out.println("总个数："+count);
    }
    public static void yue(int num1,int num2){
        int min = num1>num2?num1:num2;

        for (int i = min;i>0;i--){
            if (num1%i==0&&num2%i==0){
                System.out.println(num1+","+num2+"最大公约数为："+i);
                break;
            }
        }
    }

    public static void ran(){
        int random = (int) (Math.random()*100+1);
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        while (num != random){
            if (num>random){
                System.out.println("大了");
            }else if (num<random){
                System.out.println("小了");
            }
            num = scanner.nextInt();
        }
        System.out.println("对了"+num+","+random);
        scanner.close();

    }

    public static void paperMon(){

        double m = 8848.86*1000;
        double paper=  0.1;
        int count = 0;

        while (paper<m){
            paper *= 2;
            count++;
        }
        System.out.println("count:"+count);
    }

    public static void printa(){
        for (int i = 0;i<5;i++){
            for (int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void printb(){
        for (int i = 0;i<5;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void printc(){
        for (int i = 0;i<5;i++){
            for (int j=0;j<5-i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void printd(){
        for (int i = 0;i<5;i++){
            for (int j=0;j<5-i-1;j++){

                System.out.print("-");
            }
            for (int k = 0;k<i+1+i;k++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void printf() {
        for (int i = 1; i <= 5; i++) {
            //-
            for (int j = 1; j <= 10 - 2 * i; j++) {
                System.out.print(" ");
            }
            //*
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void x99(){
        for (int i = 1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
    public static void radn(int num1){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        scanner.close();
    }



}
