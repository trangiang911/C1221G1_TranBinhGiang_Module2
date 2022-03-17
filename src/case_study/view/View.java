package case_study.view;

import case_study.controllers.FuramaController;

public class View {
    private static FuramaController furamaController = new FuramaController();

    public static void main(String[] args) {
        furamaController.displayMainMenu();
    }
}
