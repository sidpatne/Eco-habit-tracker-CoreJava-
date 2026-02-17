package com.ecohabit.repository;

import com.ecohabit.model.EcoHabit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Simple in-memory repository for EcoHabit entities.
 * Provides basic CRUD operations.
 */
public class EcoHabitRepository {
    private final List<EcoHabit> data = new ArrayList<>();
    private int nextId = 1;

    /**
     * Create a new EcoHabit and store it in memory.
     */
    public EcoHabit create(String name, String description, String frequency) {
        EcoHabit habit = new EcoHabit(nextId++, name, description, frequency);
        data.add(habit);
        return habit;
    }

    /**
     * Return a copy of all stored habits.
     */
    public List<EcoHabit> findAll() {
        return new ArrayList<>(data);
    }

    /**
     * Find habit by id.
     */
    public EcoHabit findById(int id) {
        for (EcoHabit h : data) {
            if (h.getId() == id) return h;
        }
        return null;
    }

    /**
     * Update habit fields. Returns true if updated, false if not found.
     */
    public boolean update(int id, String name, String description, String frequency) {
        EcoHabit h = findById(id);
        if (h == null) return false;
        h.setName(name);
        h.setDescription(description);
        h.setFrequency(frequency);
        return true;
    }

    /**
     * Delete habit by id. Returns true if removed.
     */
    public boolean delete(int id) {
        Iterator<EcoHabit> it = data.iterator();
        while (it.hasNext()) {
            if (it.next().getId() == id) {
                it.remove();
                return true;
            }
        }
        return false;
    }
}
