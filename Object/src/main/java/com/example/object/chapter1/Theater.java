package com.example.object.chapter1;

public class Theater {

    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }
    /* 관람객 맞이하기
    *  소극장은 괌라객의 가방 안에 초대장이 들어 있는지 확인한다.
    *  만약 초대장이 들어 있다면 이벤트에 당첨된 관람객이므로 판매원에게서 받은 티켓을 관람객의 가방 안에 넣어준다.
    *  가방 안에 초대장이 없다면 티켓을 판매해야 한다.
    * */
    public void Enter(Audience audience) {
        ticketSeller.sellTo(audience);
    }
}
