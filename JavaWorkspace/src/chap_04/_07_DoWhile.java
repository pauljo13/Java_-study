package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile
        int distance = 25; // 거리
        int move = 0; // 현재 거리
        int height = 2; // 키 2m
        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move );
            move += 3;
        }
        System.out.println("도착했습니다.");
        System.out.println("--- 반복문 #1 ---");

        // 키가 엄청나게 큰 사람 ?
        move = 0;
        height = 25; // 조건을 버서나는 상황 바로 탈출
        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move );
            move += 3;
        }
        System.out.println("도착했습니다.#2");
        System.out.println("--- 반복문 #2 ---");

        // Do While 반복문
        // 구조
//        do { -> 조건에 안 맞어도 일단 수행
//            ... 행동 문 ...
//        } while ( 조건 ) {
//            ... 행동 문 ...
//        }
        do {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move );
            move += 3;
        } while (move + height < distance);
        System.out.println("도착했습니다. #3");
    }
}
