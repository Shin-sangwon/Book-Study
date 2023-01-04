package com.example.object.chapter1;

public class Bag {

    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    //초대장 보유 여부
    public boolean hasInvitation() {
        return invitation != null;
    }

    //티켓 보유 여부
    public boolean hasTicket() {
        return ticket != null;
    }

    //초대장을 티켓으로 교환
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    //현금 감소
    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    //현금 증가
    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
