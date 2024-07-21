package com.emp.dep.entiyt;

import jakarta.persistence.*;

import java.util.List;

@Entity

public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String name;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")

    private List<Employee> employee;


    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
