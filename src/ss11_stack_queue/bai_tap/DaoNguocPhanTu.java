package ss11_stack_queue.bai_tap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DaoNguocPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String str = scanner.nextLine();
        String[] arr = str.split("");
        String str1 = "";
        System.out.println(Arrays.toString(arr));
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        System.out.println(stack);
        while (!stack.isEmpty()) {
            str1 += stack.pop();
        }
        System.out.println(str1);
    }
}
