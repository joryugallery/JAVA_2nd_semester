package ai0915;

import java.util.Scanner;

public class PasswordGenerator {
    public static boolean checkPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        for (int i = 0; i<password.length(); i++){
            char c = password.charAt(i);
            if(!Character.isAlphabetic(c)){
                System.out.println("비밀번호에는 한글 또는 영문만 사용가능합니다.");
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("새 비밀번호를 입력 : ");
        String password = s.nextLine();

        if (checkPassword(password)) {
            System.out.println("비밀번호 규칙에 맞습니다.");
        }
    }
}
