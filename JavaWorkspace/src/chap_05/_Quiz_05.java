package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        // 신발 사이즈 250 - 295 (5단위)
        // 신발 사이즈 수는 총 10가지

        String[] sizes = new String[10];
        for (int i = 0; i < sizes.length; i++) {
            sizes[i] = String.valueOf(250 + (5*i));
        }
        for (String size:
             sizes) {
            System.out.println("사이즈 " + size + " (재고 있음)");
        }

    }
}
