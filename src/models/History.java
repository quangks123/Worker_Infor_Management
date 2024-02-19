
package models;

public class History {
    private String status, date;
    private float salary;

    public History(String status, String date, float salary) {
        this.status = status;
        this.date = date;
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("%-7s | %-11s | %-11s", salary, status, date);
    }
    
    
}
