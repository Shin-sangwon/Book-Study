package com.example.object.chapter1;

public class Bag {

    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    /* 이벤트에 당첨된 관람객의 가방 안에는 현금과 초대장이 들어있지만 이벤트에 당첨되지 않은 관람객의 가방 안에는
    *  초대장이 들어있지 않을 것이다. 따라서 Bag 인스턴스의 상태는 현금 + 초대장 or 초대장 없이 현금만 보유한 상태 일 것이다.
    *  이를 생성자를 통해 강제하도록 하자.
    * */
    public Bag(long amount) {
        this(null, amount);
    }

    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }


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
