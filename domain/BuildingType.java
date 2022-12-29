package ru.lukomorebo.lukomorye_site.domain;


public enum BuildingType {
    Cottage("Коттеджи"),
    SummerBuilding("Летний корпус"),
    Hotel("Гостиница"),
    Pavilion("Беседки"),
    BathHouse("Бани");

    private final String description;

    BuildingType(String name) {
        this.description = name;
    }

    public String getDescription() {
        return description;
    }
}
