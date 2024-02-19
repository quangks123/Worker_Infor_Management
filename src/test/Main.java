
package test;

import views.MainMenu;

public class Main {
    public static void main(String[] args) {
        String[] choices = {"ADD WORKER", "UP SALARY", "DOWN SALARY", "DISPLAY INFORMATION SALARY", "FIND WORKER INFORMATION SALARY", "EXIT"};
        new MainMenu("======== Worker Management =========", choices).run();
    }
}
