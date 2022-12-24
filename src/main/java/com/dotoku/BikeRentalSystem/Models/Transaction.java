package com.dotoku.BikeRentalSystem.Models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="transaction")
public class Transaction {

    @Id
    private long transactionId;
    @ManyToOne
    private Member member;
    @Column(name="transaction_Date")
    private Date transactionDate;

    public Transaction() {
    }

    public Transaction(long transactionId, Member member, Date transactionDate) {
        this.transactionId = transactionId;
        this.member = member;
        this.transactionDate = transactionDate;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", member=" + member +
                ", transactionDate=" + transactionDate +
                '}';
    }
}
