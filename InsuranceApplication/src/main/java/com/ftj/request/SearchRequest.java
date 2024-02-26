package com.ftj.request;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

//form binding

public class SearchRequest {
    private String planName;
    private String planStatus;
    private String gender;
    private String startDate;
    private String endDate;

    // Getter for planName
    public String getPlanName() {
        return planName;
    }

    // Setter for planName
    public void setPlanName(String planName) {
        this.planName = planName;
    }

    // Getter for planStatus
    public String getPlanStatus() {
        return planStatus;
    }

    // Setter for planStatus
    public void setPlanStatus(String planStatus) {
        this.planStatus = planStatus;
    }

    // Getter for gender
    public String getGender() {
        return gender;
    }

    // Setter for gender
    public void setGender(String gender) {
        this.gender = gender;
    }

    // Getter for startDate
    public String getStartDate() {
        return startDate;
    }

    // Setter for startDate
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    // Getter for endDate
    public String getEndDate() {
        return endDate;
    }

    // Setter for endDate
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    // equals() method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SearchRequest that = (SearchRequest) o;

        if (planName != null ? !planName.equals(that.planName) : that.planName != null) return false;
        if (planStatus != null ? !planStatus.equals(that.planStatus) : that.planStatus != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        return endDate != null ? endDate.equals(that.endDate) : that.endDate == null;
    }

    // hashCode() method
    @Override
    public int hashCode() {
        int result = planName != null ? planName.hashCode() : 0;
        result = 31 * result + (planStatus != null ? planStatus.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        return result;
    }

    // toString() method
    @Override
    public String toString() {
        return "SearchRequest{" +
                "planName='" + planName + '\'' +
                ", planStatus='" + planStatus + '\'' +
                ", gender='" + gender + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
