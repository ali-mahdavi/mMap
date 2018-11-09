package com.mony.entity;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@Table(name = "tb_marketing_item_issues")
public class MarketingItemIssues {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long Id;
    @NotEmpty
    @Column(name = "TITLE")
    private String title;

    @Column(name = "AMOUNT")
    private String amount;


    public MarketingItemIssues() {
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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
