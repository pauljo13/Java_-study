package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRoss + " 하나");
        System.out.println(coffeeRachel + " 하나");
        System.out.println(coffeeChandler + " 하나");
        System.out.println(coffeeMonica + " 하나");
        System.out.println("주세요.");

        // 배열 선언 방법
        // #1
        String[] coffees = new String[4];
        // #2
        //String coffees[] = new String[4];

        coffees[0]  = "아메리카노"; // 0부터 시작한다.
        coffees[1] = "카페모카";
        coffees[2] = "라떼";
        coffees[3] = "카푸치노";

        // #3
        String[] coffees2 = new String[] {"아메리카노","카페모카","라떼","카푸치노"};

        // #4
        String[] coffees3 = {"아메리카노","카페모카","라떼","카푸치노"};

        System.out.println("-----------------");

        // 주문
        System.out.println(coffees3[0] + " 하나");
        System.out.println(coffees3[1] + " 하나");
        coffees3[2] = "에스프레소";
        System.out.println(coffees3[2] + " 하나");
        System.out.println(coffees3[3] + " 하나");
        System.out.println("주세요.");

        // 다른 자료형
        int[] i = {1,2,3};
        double[] d = {10.0,11.2,13.5};
        boolean[] b = {true,false,true};

    }
}
