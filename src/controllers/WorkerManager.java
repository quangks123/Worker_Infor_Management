
package controllers;

import java.util.ArrayList;
import models.History;
import models.Worker;

public class WorkerManager {
    private ArrayList<Worker> w;
    private int id;

    public WorkerManager() {
        w = new ArrayList<>();
        initiate();
        id = w.size();
    }
    
    private void initiate() {
        w.add(new Worker("W01", "Hieu", 21, "DANANG", 1000, "No change", "01/01/2023"));
        w.add(new Worker("W02", "Hai", 21, "DANANG", 2000, "No change", "02/02/2022"));
        w.add(new Worker("W03", "Huy", 20, "DANANG", 1500, "No change", "01/01/2024"));
    }
    
    private String createID() {
        id++;
        if (id / 10 == 0) {
            return "W0" + id;
        }
        
        return "W" + id;
    }
    
    public void createWorker(String name, int age, String workLocation, float salary, String date) {
        w.add(new Worker(createID(), name, age, workLocation, salary, "No change", date));
    }
    
    public boolean checkExist(String code) {
        for (Worker worker : w) {
            if (code.equals(worker.getCode())) {
                return true;
            }
        }
        return false;
    }
    
    public void upSalary(String code, float salary, String date) {
        for (int i = 0; i < w.size(); i++) {
            if (w.get(i).getCode().equals(code)) {
                w.get(i).setSalary(w.get(i).getSalary() + salary);
                w.get(i).getHistories().add(new History("UP", date, w.get(i).getSalary()));
                break;
            }
        }
    }
    
    public boolean checkDownSalary(String code, float salary) {
        for (Worker worker : w) {
            if (worker.getCode().equals(code)) {
                if (salary < worker.getSalary()) {
                    return true;
                }
                return false;
            }
        }
        
        return false;
    }
    
    public void downSalary(String code, float salary, String date) {
        for (int i = 0; i < w.size(); i++) {
            if (w.get(i).getCode().equals(code)) {
                w.get(i).setSalary(w.get(i).getSalary() - salary);
                w.get(i).getHistories().add(new History("DOWN", date, w.get(i).getSalary()));
                break;
            }
        }
    }
    
    public void displayAll() {
        System.out.println(String.format("%-4s | %-10s | %-3s | %-7s | %-11s | %-11s", "Code", "Name", "Age", "Salary", "Status", "Date"));
        for (Worker worker : w) {
            System.out.println(worker);
        }
    }
    
    public void find(String code) {
        for (Worker worker : w) {
            if (worker.getCode().equals(code)) {
                worker.getDetail();
            }
        }
    }
}
