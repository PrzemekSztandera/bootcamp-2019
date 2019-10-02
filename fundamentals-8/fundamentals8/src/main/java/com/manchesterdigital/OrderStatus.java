package com.manchesterdigital;

public enum OrderStatus {
    PENDING("Order is pending"),
    DISPATCHED("Order is dispatched"),
    DECLINED("Order is declined"),
    AWAITING_PAYMENT("Order is awaiting payment"),
    PROCESSED("Order is processed");

    private String message;

    OrderStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
