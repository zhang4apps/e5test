import java.util.Scanner;

public class StudentLv {
    public static void main(String[] args) {
        //1. 根据提示，获取学生人数
        System.out.print("请输入学生人数：");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        //2. 根据学生人数，创建指定长度的数组 (使用动态初始化)
        int[] scores = new int[count];

        char[] lv = new char[]{'A','B','C','D'};

        int maxScore=  0;

        for (int i = 0;i<scores.length;i++){
            scores[i] = scanner.nextInt();

            if (scores[i]>maxScore){
                maxScore = scores[i];
            }
        }
        System.out.println("最高分为"+maxScore);
        char grade;
        for (int i = 0; i < scores.length; i++) {

            if(scores[i] >= maxScore - 10){
                grade = 'A';
            }else if(scores[i] >= maxScore - 20){
                grade = 'B';
            }else if(scores[i] >= maxScore - 30){
                grade = 'C';
            }else{
                grade = 'D';
            }
            System.out.println("student " + i + " socre is " + scores[i] + ", grade is " + grade);
        }
        //关闭资源
        scanner.close();



    }
}
