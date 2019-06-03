import java.util.Scanner;

public class checkYear {
    public static void main(String[] args) {
        System.out.println("Nhập vào đây một năm để kiểm tra");

        Scanner scanner=new Scanner(System.in);

        int year=scanner.nextInt();

        if(year%4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.println("Đây là năm nhuận");
                }else {
                    System.out.println("Đây không phải năm nhuận");
                }
            }else {
                System.out.println("Đây là năm nhuận");
            }
        }else {
            System.out.println("Đây không phải năm nhuận");
        }
    }
}
