package testclass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Condition {
    public static String validateNtns(Scanner sc){
        try{
            System.out.println("Mời bạn nhập ngày tháng năm sinh: ");
            String birthDay = sc.nextLine();
            LocalDate ntns = LocalDate.parse(birthDay, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            return ntns.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        }
        catch (Exception ex){
            System.out.println("Nhập giá trị không đúng.Vui lòng nhập đúng định dạng dd-MM-yyyy ");
            return validateNtns(sc);
        }
    }
    public static String validatedateAdd(Scanner sc) {
        try {
            System.out.println("Mời bạn nhập ngày giở nhập hàng: ");
            String birthDayTime = sc.nextLine();
            LocalDateTime bdt = LocalDateTime.parse(birthDayTime, DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
            return bdt.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
        } catch (Exception ex) {
            System.out.println("Nhập giá trị không đúng.Vui lòng nhập đúng định dạng dd-MM-yyyy HH:mm");
            return validatedateAdd(sc);
        }
    }
    public static String valitimeAdd(Scanner sc) {
        try {
            System.out.println("Mời bạn nhập thời gian nhập: ");
            String dayTime = sc.nextLine();
            LocalTime dt = LocalTime.parse(dayTime, DateTimeFormatter.ofPattern("HH:mm:ss"));
            return dt.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        }
        catch (Exception ax) {
            System.out.println("Nhập giá trị không đúng.Vui lòng nhập đúng định dạng HH:mm:ss");
            return  valitimeAdd(sc);
        }
    }
}

