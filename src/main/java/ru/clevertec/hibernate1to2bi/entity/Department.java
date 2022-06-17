package ru.clevertec.hibernate1to2bi.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String departmentName;
    @Column(name = "max_salary")
    private int maxSalary;
    @Column(name = "min_salary")
    private int minSalary;
    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "department",
//            fetch = FetchType.EAGER)
            fetch = FetchType.LAZY)
    private List<Employee> empsList;

    public Department() {
    }

    public Department(String departmentName, int maxSalary, int minSalary) {
        this.departmentName = departmentName;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    public void addEmployeeToDepartment(Employee employee) {
        if (empsList == null) {
            empsList = new ArrayList<>();
        }
        empsList.add(employee);
        employee.setDepartment(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public List<Employee> getEmpsList() {
        return empsList;
    }

    public void setEmpsList(List<Employee> empsList) {
        this.empsList = empsList;
    }

    @Override
    public String toString() {
        return "Department{"
                + "id=" + id
                + ", departmentName='" + departmentName + '\''
                + ", minSalary=" + minSalary
                + ", maxSalary=" + maxSalary
//                + ", empsList=" + empsList
                + '}';
    }
}
