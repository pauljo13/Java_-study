package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String rr_number1 = "901232-1234567";
        String rr_number2 = "030708-4567890";

        int index_1 = rr_number1.indexOf("-") + 2;
        int index_2 = rr_number2.indexOf("-") + 2;

        System.out.println(rr_number1.substring(0,index_1));
        System.out.println(rr_number2.substring(0,index_2));
    }
}

