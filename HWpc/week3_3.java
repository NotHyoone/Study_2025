// [3주차] 로봇언어 / 상
// https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&problemLevel=4&problemLevel=5&contestProbId=AZVqPrHaAy_HBIOy&categoryId=AZVqPrHaAy_HBIOy&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=5&pageSize=10&pageIndex=1

// 처음에는 그냥 L, R, ? 개수 세서 L-R 절대값 해서 ? 더해주면 될거라고 생각했다.
// 하지만 테스트케이스의 3번째가 결과값이 제대로 출력이 안 된다는 것을 깨닫고
// 문자열을 돌때마다 L, R에 따른 값을 증감하고 마지막에 절대값 취해서 ?에 대해서 값을 계산해야겠다.
// 이렇게 했는데도 정답이 다르게 나와서 결국 구글링을 통해서 해결했다.

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class week3_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int T = sc.nextInt();
        sc.nextLine();


        for(int test_case = 0; test_case < T; test_case++) {
            String s = sc.nextLine();
            int sum = 0;
            int maxSum = 0;
            int qCount = 0;
            
            
            for(int c = 0; c < s.length(); c++) {
                char ch = s.charAt(c);
                if(ch == 'L') {         // L 이면 sum - 1
                    sum--;
                }else if(ch == 'R') {   // R 이면 sum + 1
                    sum++;
                }else if(ch == '?'){    // ? 이면 qCount + 1
                    qCount++;
                }
                // ? 를 L 이라고 가정
                int left = Math.abs(sum-qCount);
                // ? 를 R 이라고 가정
                int right = Math.abs(sum+qCount);

                // 현재 최대 거리와 ?를 L이라고 가정한 것과 R이라고 가정한 것의 절대값의 최대값을 비교해서 maxSum에 최신화
                maxSum = Math.max(maxSum, Math.max(left, right));   

            }
            System.out.println(maxSum);
        }
        sc.close();
    }
}
