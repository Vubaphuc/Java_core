import testclass.Condition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nhập tên hàng hóa
        System.out.println("Mời bạn nhập tên hàng nhập kho");
        String nameProduct = sc.nextLine();
        System.out.println("Tên hàng hóa là: "+ nameProduct);
        // nhập ngày tháng năm sinh
        String ntns = Condition.validateNtns(sc);
        System.out.println("ngày tháng năm sinh là: "+ntns);
        // nhập thời gian nhập hàng
        String bdt = Condition.validatedateAdd(sc);
        System.out.println("ngày giờ nhập hàng là:"+bdt);
        // nhập thời gian
        String time = Condition.valitimeAdd(sc);
        System.out.println("thời gian nhập hàng là: "+ time);
    }
}