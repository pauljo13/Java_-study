package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자
        // \n \t \\ \" \'
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        // \n 줄바꿈
        System.out.println("자바가\n너무\n재미있어요");

        // \t Tab 효과를 줌 글자 맞추기
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t7000원");

        // \\ "\" 을 작성하고 싶을 때
        System.out.println("C:\\program Files\\Java");

        // \" 따움표를 그래로 출력하고 싶을 때
        System.out.println("단비가 \"냐용~\" 이라고 했어요.");
        // \' 작은 따움표를 표현하고 싶을 때
        System.out.println("단비가 \'뭘 바?\' 라는 표정을 지었어요.");
        System.out.println("단비가 '뭘 바?' 라는 표정을 지었어요.");

        char c = 'A';
        c = '\'';
        System.out.println(c);
    }
}
