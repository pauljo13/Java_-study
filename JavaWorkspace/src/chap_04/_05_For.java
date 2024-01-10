package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 for
        // 고객 방문시 인사
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        // 새로운 인사법
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        // 매장 변경
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");

        System.out.println("---- 반복문 ----");
        // 반복문 for
//        for (선언;조건;증감) {
//            ... 수행 코드 ...
//        }
        for (int i = 0; i < 10; i++) {
            System.out.println("어서오세요. 나코입니다. " + i);
        }

        // 짝수만 출력 (fori 만 적고 엔터)
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }
        System.out.println();
        // 홀수만 출력
        for (int i = 1; i < 10; i+= 2) {
            System.out.println(i);
        }

        System.out.println();
        // 거꾸로 숫자
        for (int i = 5; i > 0 ; i--) {
            System.out.println(i);
        }

        System.out.println();
        // 1 부터 10까지의 합
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("현재 총 합 : " + sum);
        }
        System.out.println("1부터 10까지의 합 : " + sum);

        System.out.println("---- 반복 조건 ----");

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }


    }
}
