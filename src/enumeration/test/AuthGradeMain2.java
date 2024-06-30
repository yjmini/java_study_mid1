package enumeration.test;

import java.util.Arrays;
import java.util.Scanner;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AuthGrade[] values = AuthGrade.values();

        System.out.print("당신의 등급을 입력하세요" + Arrays.toString(values) + ": ");

        String grade = scanner.nextLine();

        if (grade.equals("GUEST")) {
            System.out.println("당신의 등급은 " + AuthGrade.GUEST.name() + "입니다.");
            System.out.println("==메뉴 목록==");
            System.out.println("- 메인 화면");
        } else if (grade.equals("LOGIN")) {
            System.out.println("당신의 등급은 " + AuthGrade.GUEST.name() + "입니다.");
            System.out.println("==메뉴 목록==");
            System.out.println("- 메인 화면");
            System.out.println("- 이메일 관리 화면");
        } else if (grade.equals("ADMIN")) {
            System.out.println("당신의 등급은 " + AuthGrade.GUEST.name() + "입니다.");
            System.out.println("==메뉴 목록==");
            System.out.println("- 메인 화면");
            System.out.println("- 이메일 관리 화면");
            System.out.println("- 관리자 화면");
        }
    }
}
