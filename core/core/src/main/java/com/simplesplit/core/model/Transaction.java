package com.simplesplit.core.model;


import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_sequence_generator2")
    @SequenceGenerator(name = "my_sequence_generator2", sequenceName = "TransactionSequence", initialValue = 1000, allocationSize = 1)
    private Long id;

    @Column
    private String owner;
    @Column
    private String tenant;
    @Column
    private Double amount;
    @Column
    private String description;

    @Column
    private Date createdTime;
    @Column
    private String blockHash;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(String blockHash) {
        this.blockHash = blockHash;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", owner='" + owner + '\'' +
                ", tenant='" + tenant + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", createdTime=" + createdTime +
                ", blockHash='" + blockHash + '\'' +
                '}';
    }
}
