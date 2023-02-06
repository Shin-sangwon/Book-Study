package com.example.object.chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {

    private Long amount;
    //판매 티켓
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket ... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    //티켓 판매(편의상 첫번째 위치에 저정된 티켓 반환)
    public Ticket getTicket() {
        return tickets.remove(0);
    }

    //판매 금액 차감
    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    //판매 금액 증가
    public void plusAmount(Long amount) {
        this.amount += amount;
    }

}
