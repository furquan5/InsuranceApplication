package com.ftj.entity;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CitizenPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer citizenId;
    private String citizenName;
    private String gender;
    private String planName;
    private String planStatus;
    private LocalDate planStartDate;
    private LocalDate planEndDate;
    private Double benefitAmount;
    private String denialReason;
    private LocalDate terminationDate;
    private String terminationReason;

    // Constructors
    public CitizenPlan() {
    }

    public CitizenPlan(Integer citizenId, String citizenName, String gender, String planName, String planStatus,
            LocalDate planStartDate, LocalDate planEndDate, Double benefitAmount, String denialReason,
            LocalDate terminationDate, String terminationReason) {
        this.citizenId = citizenId;
        this.citizenName = citizenName;
        this.gender = gender;
        this.planName = planName;
        this.planStatus = planStatus;
        this.planStartDate = planStartDate;
        this.planEndDate = planEndDate;
        this.benefitAmount = benefitAmount;
        this.denialReason = denialReason;
        this.terminationDate = terminationDate;
        this.terminationReason = terminationReason;
    }

    // Getter and Setter methods
    public Integer getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(Integer citizenId) {
        this.citizenId = citizenId;
    }

    public String getCitizenName() {
        return citizenName;
    }

    public void setCitizenName(String citizenName) {
        this.citizenName = citizenName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getPlanStatus() {
        return planStatus;
    }

    public void setPlanStatus(String planStatus) {
        this.planStatus = planStatus;
    }

   
    public void setPlanStartDate(LocalDate planStartDate) {
        this.planStartDate = planStartDate;
    }

    public LocalDate getPlanStartDate() {
        return planStartDate;
    }
    public LocalDate getPlanEndDate() {
        return planEndDate;
    }

    public void setPlanEndDate(LocalDate planEndDate) {
        this.planEndDate = planEndDate;
    }

    public Double getBenefitAmount() {
        return benefitAmount;
    }

    public void setBenefitAmount(Double benefitAmount) {
        this.benefitAmount = benefitAmount;
    }

    public String getDenialReason() {
        return denialReason;
    }

    public void setDenialReason(String denialReason) {
        this.denialReason = denialReason;
    }

    public LocalDate getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(LocalDate terminationDate) {
        this.terminationDate = terminationDate;
    }

    public String getTerminationReason() {
        return terminationReason;
    }

    public void setTerminationReason(String terminationReason) {
        this.terminationReason = terminationReason;
    }

    // toString, equals, and hashCode methods can also be manually implemented if needed
    
    @Override
    public String toString() {
        return "CitizenPlan{" +
                "citizenId=" + citizenId +
                ", citizenName='" + citizenName + '\'' +
                ", gender='" + gender + '\'' +
                ", planName='" + planName + '\'' +
                ", planStatus='" + planStatus + '\'' +
                ", planStartDate=" + planStartDate +
                ", planEndDate=" + planEndDate +
                ", benefitAmount=" + benefitAmount +
                ", denialReason='" + denialReason + '\'' +
                ", terminationDate=" + terminationDate +
                ", terminationReason='" + terminationReason + '\'' +
                '}';
    }
}
