package com.ttzh.concertTicket.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "serial_no", nullable = false)
    private String serialNo;
    private String rowNo;
    private Long seatNo;
    /*private Long areaId;
    private Long eventId;*/
    private Long orderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eventId", nullable = false)
    @JsonIgnoreProperties("tickets")
    private Event events;

    @ManyToOne(fetch = FetchType.LAZY)
    /*@JoinColumn(name = "areaId", nullable = false)*/
    @JsonIgnoreProperties("tickets")
    private TicketType ticketTypes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getRowNo() {
        return rowNo;
    }

    public void setRowNo(String rowNo) {
        this.rowNo = rowNo;
    }

    public Long getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(Long seatNo) {
        this.seatNo = seatNo;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public TicketType getTicketTypes() {
        return ticketTypes;
    }

    public void setTicketTypes(TicketType ticketTypes) {
        this.ticketTypes = ticketTypes;
    }

    public Event getEvents() {
        return events;
    }

    public void setEvents(Event events) {
        this.events = events;
    }

}
