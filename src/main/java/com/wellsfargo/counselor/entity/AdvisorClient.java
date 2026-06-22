package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class AdvisorClient {

    @Id
    @GeneratedValue()
    private long advisorClientId;

    @Column(nullable = false)
    private long advisorId;

    @Column(nullable = false)
    private long clientId;

    @Column(nullable = false)
    private String assignedDate;

    protected AdvisorClient() {
    }

    public AdvisorClient(long advisorId, long clientId, String assignedDate) {
        this.advisorId = advisorId;
        this.clientId = clientId;
        this.assignedDate = assignedDate;
    }

    public Long getAdvisorClientId() {
        return advisorClientId;
    }

    public long getAdvisorId() {
        return advisorId;
    }

    public void setAdvisorId(long advisorId) {
        this.advisorId = advisorId;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public String getAssignedDate() {
        return assignedDate;
    }

    public void setAssignedDate(String assignedDate) {
        this.assignedDate = assignedDate;
    }
}