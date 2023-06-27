package com.pragma.poweup.traceabilitymicroservice.domain.model;

import java.time.LocalDateTime;

public class Traceability {
    private String _id;
    private Long idOrder;
    private Long idClient;
    private String mailClient;
    private LocalDateTime date;
    private String currentState;
    private String previousState;
    private Long idEmployee;
    private String mailEmployee;

    public Traceability() {
    }

    public Traceability(String _id, Long idOrder, Long idClient, String mainClient, LocalDateTime date, String currentState, String previousState, Long idEmployee, String mailEmployee) {
        this._id = _id;
        this.idOrder = idOrder;
        this.idClient = idClient;
        this.mailClient = mainClient;
        this.date = date;
        this.currentState = currentState;
        this.previousState = previousState;
        this.idEmployee = idEmployee;
        this.mailEmployee = mailEmployee;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getMailClient() {
        return mailClient;
    }

    public void setMailClient(String mailClient) {
        this.mailClient = mailClient;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    public String getPreviousState() {
        return previousState;
    }

    public void setPreviousState(String previousState) {
        this.previousState = previousState;
    }

    public Long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getMailEmployee() {
        return mailEmployee;
    }

    public void setMailEmployee(String mailEmployee) {
        this.mailEmployee = mailEmployee;
    }
}
