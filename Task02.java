package Seminar01.Homework01;

// 2) Вывести все простые числа от 1 до 1000

public class Task02 {
    public static void main(String[] args) {
        GetSimpleNumbers(1000);
    }

    static void GetSimpleNumbers(int number){
        System.out.print("Простые числа от 1 до "+number+": ");
        for(int i=1; i<=number; i++)
        {
            boolean isSimple = true;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    isSimple = false;
                    break;
                }
            }
            if(isSimple){
                System.out.print(i+" ");
            }
        }
    }
}
