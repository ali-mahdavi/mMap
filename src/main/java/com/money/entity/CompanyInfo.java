package com.mony.entity;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
@Entity
@Table(name = "tb_company_info")
public class CompanyInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long Id;
    @NotEmpty
    @Column(name = "TITLE")
    private String title;

    @Column(name = "ECONOMIC_CODE")
    private String economicCode;

    @Column(name = "ECONOMIC_PART")
    private String economicPart;

    @Column(name = "NUMBER_OF_HUMAN_RESOURCES")
    private String numberOfHumanResources;

    @Column(name = "DISTANCE_TO_BRANCH")
    private String distanceToBranch;

    public CompanyInfo() {
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEconomicCode() {
        return economicCode;
    }

    public void setEconomicCode(String economicCode) {
        this.economicCode = economicCode;
    }

    public String getEconomicPart() {
        return economicPart;
    }

    public void setEconomicPart(String economicPart) {
        this.economicPart = economicPart;
    }

    public String getNumberOfHumanResources() {
        return numberOfHumanResources;
    }

    public void setNumberOfHumanResources(String numberOfHumanResources) {
        this.numberOfHumanResources = numberOfHumanResources;
    }

    public String getDistanceToBranch() {
        return distanceToBranch;
    }

    public void setDistanceToBranch(String distanceToBranch) {
        this.distanceToBranch = distanceToBranch;
    }
}
