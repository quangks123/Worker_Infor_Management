
package models;

import java.util.ArrayList;

public class Worker {
    private ArrayList<History> histories = new ArrayList<>();
    private float salary;
    private String code, name, workLocation;
    private int age;

    public Worker(String code, String name, int age, String workLocation, float salary, String status, String date) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.workLocation = workLocation;
        this.salary = salary;
        histories.add(new History(status, date, salary));
    }

    public ArrayList<History> getHistories() {
        return histories;
    }

    public void setHistories(ArrayList<History> histories) {
        this.histories = histories;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%-4s | %-10s | %-3s | ", code, name, age) + histories.getLast();
    }
    
    public void getDetail() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Work location: " + workLocation);
        
        System.out.println(String.format("%-7s | %-11s | %-11s", "Salary", "Status", "Date"));
        for (History h : histories) {
            System.out.println(h);
        }
        
    }
    
}
