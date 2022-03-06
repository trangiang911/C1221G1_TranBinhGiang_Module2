package collection_review.controllers;

import collection_review.services.CandidateManager;

import java.util.Scanner;

public class CandidateControllers {
    public static void main(String[] args) {
        CandidateManager candidateManager = new CandidateManager();
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int choice = -1;
        do {
            System.out.println("1.Thêm mới ứng viên\n" +
                    "2.Tìm kiếm học viên\n" +
                    "3.Exit");
            System.out.println("Nhập lựa chọn");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    candidateManager.add();
                    break;
                case 2:
                    candidateManager.find();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Lựa chọn ko đúng");
            }
        } while (choice != 3);
    }
}
