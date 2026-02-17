package com.ecohabit.model;

/**
 * Model class representing an Eco Habit entity.
 * Simple POJO with id, name, description and frequency fields.
 */
public class EcoHabit {
    private int id;
    private String name;
    private String description;
    private String frequency; // e.g., daily, weekly

    public EcoHabit() {}

    public EcoHabit(int id, String name, String description, String frequency) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.frequency = frequency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "EcoHabit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", frequency='" + frequency + '\'' +
                '}';
    }
}
