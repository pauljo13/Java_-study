package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 주차 요금 정산 프로그램
        // 시간당 4000원
        // 최대 금액 30000원
        // 경차 또는 장애인 차량 --> 50% 할인

        String car = "일반"; //
        int hour = 5;
        int money = 0;
        for (int i = 0; i < hour; i++) {
            money += 4000;
            if (money >= 30000) {
                money = 30000;
                break;
            }
        }
        if (car.equals("경차") || car.equals("장애인")) {
            money /= 2;
        }
        System.out.println("주차 요금은 " + money + " 원입니다.");

        car = "경차";
        money = 0;
        for (int i = 0; i < hour; i++) {
            money += 4000;
            if (money >= 30000) {
                money = 30000;
                break;
            }
        }
        if (car.equals("경차") || car.equals("장애인")) {
            money /= 2;
        }
        System.out.println("주차 요금은 " + money + " 원입니다.");

        car = "장애인";
        hour = 10;
        money = 0;
        for (int i = 0; i < hour; i++) {
            money += 4000;
            if (money >= 30000) {
                money = 30000;
                break;
            }
        }
        if (car.equals("경차") || car.equals("장애인")) {
            money /= 2;
        }
        System.out.println("주차 요금은 " + money + " 원입니다.");

        // 정답
        System.out.println("-------------------------------");
        hour = 5;
        boolean isSamllCar = false;
        boolean person = false;

        int fee = hour * 4000;
        if (fee > 30000){
            fee = 30000;
        }
        if (isSamllCar || person){
            fee /= 2;
        }
        System.out.println("주차 요금은 " + fee + " 원입니다.");
    }
}
