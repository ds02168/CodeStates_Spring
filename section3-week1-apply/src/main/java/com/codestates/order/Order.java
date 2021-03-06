package com.codestates.order;

public class Order {
    private long memberId;
    private long coffeeId;

    public Order(long memberId, long coffeeId){
        this.memberId = memberId;
        this.coffeeId = coffeeId;
    }

    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public long getCoffeeId() {
        return coffeeId;
    }

    public void setCoffeeId(long coffeeId) {
        this.coffeeId = coffeeId;
    }
}
