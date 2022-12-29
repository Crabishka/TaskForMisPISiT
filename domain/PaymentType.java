package ru.lukomorebo.lukomorye_site.domain;

public enum PaymentType {
    PerDays("По дням"),
    PerHours("По часам"),
    SingleDay("Один день");

    private final String description;

    PaymentType(String name) {
        this.description = name;
    }

    public String getDescription() {
        return description;
    }
}
