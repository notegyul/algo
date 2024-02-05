package year2024.step01;


import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // 문자열로 입력 받아서 toCharArray()로 변환할 거임
        String strNum = sc.next();
        char[] charArr = strNum.toCharArray();

        int answer = 0;
        for (int i=0; i<N; i++) {
            // char 타입에서 문자 '0'을 빼줌으로써 숫자로 변환하는 것
            answer += charArr[i] - '0';
        }

        System.out.println(answer);

        // 아스키코드에서 같은 의미의 문자와 숫자의 코드 값 차이는 48
        // ex. 문자 '1'의 아스키코드 값은 49임 (숫자 1과 48만큼 차이)
    }
}
