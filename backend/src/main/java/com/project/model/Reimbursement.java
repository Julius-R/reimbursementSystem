package com.project.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reimbursement")
public class Reimbursement {

    @Id
    @Column(name = "reimbursement_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int reimbId;

    @Column(name = "reimbursement_amount")
    private String reimbAmount;

    @Column(name = "reimbursement_submit_date")
    @CreationTimestamp
    private LocalDateTime reimbSubmitted;

    @Column(name = "reimbursement_resolved_date")
    @UpdateTimestamp
    private LocalDateTime reimbResolved;

    @Column(name = "reimbursement_description")
    private String reimbDescription;

    @ManyToOne
    @JoinColumn(name = "author_fk")
    private User reimbAuthor;

    @ManyToOne
    @JoinColumn(name = "resolver_fk")
    private User reimbResolver;

    @Enumerated(EnumType.STRING)
    @Column(name = "reimbursement_type")
    private ReimbursementType reimbType;

    @Enumerated(EnumType.STRING)
    @Column(name = "reimbursement_status")
    private ReimbursementStatus reimbStatus;



    public Reimbursement() {
    }

    public Reimbursement(int reimbId, String reimbAmount, LocalDateTime reimbSubmitted, LocalDateTime reimbResolved, String reimbDescription, User reimbAuthor, User reimbResolver, ReimbursementType reimbType, ReimbursementStatus reimbStatus) {
        this.reimbId = reimbId;
        this.reimbAmount = reimbAmount;
        this.reimbSubmitted = reimbSubmitted;
        this.reimbResolved = reimbResolved;
        this.reimbDescription = reimbDescription;
        this.reimbAuthor = reimbAuthor;
        this.reimbResolver = reimbResolver;
        this.reimbType = reimbType;
        this.reimbStatus = reimbStatus;
    }

    public int getReimbId() {
        return reimbId;
    }

    public void setReimbId(int reimbId) {
        this.reimbId = reimbId;
    }

    public String getReimbAmount() {
        return reimbAmount;
    }

    public void setReimbAmount(String reimbAmount) {
        this.reimbAmount = reimbAmount;
    }

    public LocalDateTime getReimbSubmitted() {
        return reimbSubmitted;
    }

    public void setReimbSubmitted(LocalDateTime reimbSubmitted) {
        this.reimbSubmitted = reimbSubmitted;
    }

    public LocalDateTime getReimbResolved() {
        return reimbResolved;
    }

    public void setReimbResolved(LocalDateTime reimbResolved) {
        this.reimbResolved = reimbResolved;
    }

    public String getReimbDescription() {
        return reimbDescription;
    }

    public void setReimbDescription(String reimbDescription) {
        this.reimbDescription = reimbDescription;
    }

    public User getReimbAuthor() {
        return reimbAuthor;
    }

    public void setReimbAuthor(User reimbAuthor) {
        this.reimbAuthor = reimbAuthor;
    }

    public User getReimbResolver() {
        return reimbResolver;
    }

    public void setReimbResolver(User reimbResolver) {
        this.reimbResolver = reimbResolver;
    }

    public ReimbursementType getReimbType() {
        return reimbType;
    }

    public void setReimbType(ReimbursementType reimbType) {
        this.reimbType = reimbType;
    }

    public ReimbursementStatus getReimbStatus() {
        return reimbStatus;
    }

    public void setReimbStatus(ReimbursementStatus reimbStatus) {
        this.reimbStatus = reimbStatus;
    }
}
