package com.zaurtregulov.spring.mvc.entity;

import com.zaurtregulov.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class EmployeeClass {
    @Size(min = 2, message = "name must be at least 2 symbols")
    private String nameFromClass;
    @NotBlank(message = "surname is a required field")
    private String surnameFromClass;
    @Min(value = 500, message = "must be grater than 499")
    @Max(value = 1000, message = "must be less than 1001")
    private int salaryFromClass;
    private String departmentFromClass;
    private String carBrand;
    private String[] languages;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XXX-XX-XX")
    private String phoneNumber;
    @CheckEmail(value = "abc.com", message = "must ends with abc.com")
    private String email;
    private Map<String, String> departments;
    private Map<String, String> cars;
    private Map<String, String> langList;


    public EmployeeClass() {
        departments = new HashMap<>();
        departments.put("Information Technology", "IT");
        departments.put("Human Resources", "HR");
        departments.put("Sales", "Sales");
        cars = new HashMap<>();
        cars.put("BMW", "BMW");
        cars.put("Bentley", "Bentley");
        cars.put("Mercedes-Benz", "Mercedes-Benz");
        langList = new HashMap<>();
        langList.put("English", "EN");
        langList.put("Deutch", "DE");
        langList.put("Franch", "FR");
    }

    public EmployeeClass(String name, String surname, int salary) {
        this.nameFromClass = name;
        this.surnameFromClass = surname;
        this.salaryFromClass = salary;
    }

    public String getNameFromClass() {
        return nameFromClass;
    }

    public void setNameFromClass(String nameFromClass) {
        this.nameFromClass = nameFromClass;
    }

    public String getSurnameFromClass() {
        return surnameFromClass;
    }

    public void setSurnameFromClass(String surnameFromClass) {
        this.surnameFromClass = surnameFromClass;
    }

    public int getSalaryFromClass() {
        return salaryFromClass;
    }

    public void setSalaryFromClass(int salaryFromClass) {
        this.salaryFromClass = salaryFromClass;
    }

    public String getDepartmentFromClass() {
        return departmentFromClass;
    }

    public void setDepartmentFromClass(String departmentFromClass) {
        this.departmentFromClass = departmentFromClass;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCars() {
        return cars;
    }

    public void setCars(Map<String, String> cars) {
        this.cars = cars;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLangList() {
        return langList;
    }

    public void setLangList(Map<String, String> langList) {
        this.langList = langList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + nameFromClass + '\'' +
                ", surname='" + surnameFromClass + '\'' +
                ", salary=" + salaryFromClass +
                ", department='" + departmentFromClass + '\'' +
                '}';
    }
}
