package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        int max = 20; // 최대 판매수
        int sold = 0; // 현재 판매수
        int noShow = 17; // 노쇼 손님

        for (int i = 1; i < 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
            if (i == noShow) {
                System.out.println(i + "번 손님, 기회가 넘어갑니다.");
                continue; // 밑에 있는 동작은 작동하지 않고 새로 반복문이 진행됨
            }
            sold++;
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진 되었습니다.");
                break; // 반복문 탈출
            }
        }
        System.out.println("영업을 종료합니다.");



        // While 문
        sold = 0;
        int index = 0;
        while (true) {
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");
            index ++;
            if (index == noShow) {
                System.out.println(index + "번 손님, 기회가 넘어갑니다.");
                continue; // 밑에 있는 동작은 작동하지 않고 새로 반복문이 진행됨
            }
            sold++;
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진 되었습니다.");
                break; // 반복문 탈출
            }
        }
        System.out.println("영업을 종료합니다.");
    }
}
