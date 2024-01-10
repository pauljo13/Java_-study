package chap_04;

public class _06_While {
    public static void main(String[] args) {
        // 반복문 While
        int distance = 25; // 전체 길이
        int move = 0; // 혅재 길이
        // 구조
//        while (조건) {
//            ... 수행 코드 ...
//        }
        while (move < distance){
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착");

        // 무한 루프
        move = 0;
        while (move < distance){
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
        }
        System.out.println("도착");
    }
}
