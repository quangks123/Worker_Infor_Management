
package views;

import controllers.Validation;
import controllers.WorkerManager;

public class MainMenu extends Menu{

    private Validation v = new Validation();
    private WorkerManager w = new WorkerManager();
            
    public MainMenu(String title, String[] choices) {
        super(title, choices);
    }

    @Override
    public void execute(int ch) {
        
        String code, name, workLocation, date;
        float salary;
        int age;
        
        switch (ch) {
            case 1:
                System.out.println("--------- ADD WORKER ----------");
                System.out.print("Enter name: ");
                name = v.inputString();
                
                while (true) {                    
                    System.out.print("Enter age: ");
                    age = v.inputNum();
                    
                    if (age >= 18 && age <= 50) {
                        break;
                    }
                }
                
                System.out.print("Enter work location: ");
                workLocation = v.inputString();
                
                while (true) {                    
                    System.out.print("Enter salary: ");
                    salary = v.inputFloat();
                    if (salary > 0) {
                        break;
                    }
                }
                
                while (true) {                    
                    System.out.print("Enter date: ");
                    date = v.inputString();
                    if (v.checkDate(date)) {
                        break;
                    }
                }
                
                w.createWorker(name, age, workLocation, salary, date);
                
                System.out.println("ADD SUCCESS!!");
                
                break;
            case 2:
                System.out.println("------- UP SALARY --------");
                
                System.out.print("Enter code: ");
                code = v.inputString();
                
                if (!w.checkExist(code)) {
                    System.out.println("NOT FOUND!!");
                    break;
                }
                
                while (true) {                    
                    System.out.print("Enter salary: ");
                    salary = v.inputFloat();
                    if (salary > 0) {
                        break;
                    }
                }
                
                while (true) {                    
                    System.out.print("Enter date: ");
                    date = v.inputString();
                    if (v.checkDate(date)) {
                        break;
                    }
                }
                
                w.upSalary(code, salary, date);
                System.out.println("UPDATE SUCCESS!!");
                
                break;
            case 3:
                System.out.println("------- DOWN SALARY  --------");
                
                System.out.print("Enter code: ");
                code = v.inputString();
                
                if (!w.checkExist(code)) {
                    System.out.println("NOT FOUND!!");
                    break;
                }
                
                while (true) {                    
                    System.out.print("Enter salary: ");
                    salary = v.inputFloat();
                    if (salary > 0 && w.checkDownSalary(code, salary)) {
                        break;
                    }
                }
                
                while (true) {                    
                    System.out.print("Enter date: ");
                    date = v.inputString();
                    if (v.checkDate(date)) {
                        break;
                    }
                }
                
                w.downSalary(code, salary, date);
                System.out.println("UPDATE SUCCESS!!");
                break;
            case 4:
                System.out.println("------- DISPLAY ALL-------");
                w.displayAll();
                break;
            case 5:
                System.out.println("-------- FIND WORKER INFORMATION SALARY ---------");
                System.out.print("Enter code: ");
                code = v.inputString();
                
                if (!w.checkExist(code)) {
                    System.out.println("NOT FOUND!!");
                    break;
                }
                
                w.find(code);
                break;
           
        }
    }
}
