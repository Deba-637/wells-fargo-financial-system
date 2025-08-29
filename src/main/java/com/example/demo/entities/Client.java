package com.example.demo.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clientId;

    private String name;
    private String email;
    private String signupDate;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private FinancialAdvisor advisor;

    @OneToMany(mappedBy = "client")
    private List<Portfolio> portfolios;

    public Client() {}

    public Client(String name, String email, String signupDate) {
        this.name = name;
        this.email = email;
        this.signupDate = signupDate;
    }

    public Integer getClientId() { return clientId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getSignupDate() { return signupDate; }
    public void setSignupDate(String signupDate) { this.signupDate = signupDate; }
}
