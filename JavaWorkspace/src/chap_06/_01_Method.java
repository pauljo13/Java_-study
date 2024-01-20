package chap_06;

public class _01_Method {
    // 메소드 정의
    public static void sayHello() { //이름은 동사를 많이 사용한다,
        System.out.println("Hello! It is method.");
    }
    public static void main(String[] args) {
        // 메소드(함수)
        // 메소드 호출
        System.out.println("메소드 전");
        sayHello();
        System.out.println("메소드 후");

        for (int i = 0; i < 3; i++) {
            sayHello();
        }
    }
}
