package codeup.Codeup1000_1050;
import java.util.Scanner;

//split으로 나눈 뒤, parseInt로 정수 형변환해서 순서 바꾸어 출력
//valueOf는 객체로. parseInt는 원시 타입으로 반환.
public class Codeup1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sDate = sc.nextLine();

        String[] newDateForm = sDate.split("\\.");
        int sYear = Integer.parseInt(newDateForm[0]);
        int sMonth = Integer.parseInt(newDateForm[1]);
        int sDay = Integer.parseInt(newDateForm[2]);
        System.out.printf("%02d-%02d-%04d", sDay, sMonth, sYear);
    }

}
