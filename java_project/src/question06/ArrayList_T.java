package question06;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.print("이름을 입력하세요>> ");
            String s = sc.next();
            a.add(s);
        }

        for (String name : a) {
            System.out.print(name + " ");
        }
        System.out.println();

        int longestIndex = 0;
        for (int i = 1; i < a.size(); i++) {
            if (a.get(longestIndex).length() < a.get(i).length()) {
                longestIndex = i;
            }
        }
        System.out.println("가장 긴 이름은: " + a.get(longestIndex));

        sc.close();
    }
}
