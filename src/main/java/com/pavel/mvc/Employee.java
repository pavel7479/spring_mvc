package com.pavel.mvc;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "name mast been min 2 chars")
    private String name;
    @NotBlank(message = "Surname mast be full")
    private String surname;
    @Min(value = 5000, message = "must be more then 5000")
    @Max(value = 10000, message = "must be less then 10000")
    private int salary;
    private String department;
    private Map<String, String> departments = new HashMap<>();
    private String carBrend;
    private Map<String, String> carBrends = new HashMap<>();
    private String [] lenguges;
    private Map<String, String> lengugeList = new HashMap<>();
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "phone Number must be XXX-XX-XX")
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Map<String, String> getLengugeList() {
        return lengugeList;
    }

    public void setLengugeList(Map<String, String> lengugeList) {
        this.lengugeList = lengugeList;
    }

    public String[] getLenguges() {
        return lenguges;
    }

    public void setLenguges(String[] lenguges) {
        this.lenguges = lenguges;
    }

    public String getCarBrend() {
        return carBrend;
    }

    public void setCarBrend(String carBrend) {
        this.carBrend = carBrend;
    }

    public Map<String, String> getCarBrends() {
        return carBrends;
    }

    public void setCarBrends(Map<String, String> carBrends) {
        this.carBrends = carBrends;
    }

    public Employee() {
        departments.put("Information technology", "IT");
        departments.put("Human research", "HR");
        departments.put("Sales", "Sales");

        carBrends.put("BMW", "BMW");
        carBrends.put("Audi", "Audi");
        carBrends.put("Mersedes-Benz", "MB");

        lengugeList.put("English", "EN");
        lengugeList.put("French", "FR");
        lengugeList.put("Duetch", "DE");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
