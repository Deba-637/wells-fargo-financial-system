package com.example.demo.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class FinancialAdvisor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer advisorId;

    private String name;
    private String contactInfo;

    @OneToMany(mappedBy = "advisor")
    private List<Client> clients;

    public FinancialAdvisor() {}

    public FinancialAdvisor(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public Integer getAdvisorId() { return advisorId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getContactInfo() { return contactInfo; }
    public void setContactInfo(String contactInfo) { this.contactInfo = contactInfo; }
}
