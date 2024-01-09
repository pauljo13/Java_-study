package chap_04;

public class _02_Else {
    public static void main(String[] args) {
        // 조건문 IF Else
        int hour = 10;
        if (hour < 14) { // 조건을 만족한다면
            System.out.println("아이스 아메리카노 +1");
        }
        else { // 조건에 만족하지 못한 그외의 경우라면
            System.out.println("아이스 아메리카노 (디카페인) + 1");
        }
        System.out.println("주문 완료 #1");

        hour = 15;
        boolean mCoffee = true;
        if (hour >= 14 || mCoffee){
            System.out.println("아이스 아메리카노 (디카페인) + 1");
        }
        else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("주문 완료 #2");
    }
}
