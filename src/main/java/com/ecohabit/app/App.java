package com.ecohabit.app;

import com.ecohabit.repository.EcoHabitRepository;

/**
 * Application entry point for the Eco Habit Tracker console app.
 */
public class App {
    public static void main(String[] args) {
        EcoHabitRepository repo = new EcoHabitRepository();
        ConsoleView view = new ConsoleView();
        EcoHabitController controller = new EcoHabitController(repo, view);

        // seed with a sample habit for convenience
        repo.create("Use reusable bag", "Bring reusable bags to grocery shopping", "daily");

        // show seeded data so running interactively clearly reflects initial state
        System.out.println("(seed) Current habits at startup:");
        for (var h : repo.findAll()) {
            System.out.println(h);
        }

        controller.start();
    }
}
