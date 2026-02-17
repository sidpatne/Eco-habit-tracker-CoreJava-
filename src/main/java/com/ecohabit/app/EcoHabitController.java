package com.ecohabit.app;

import com.ecohabit.model.EcoHabit;
import com.ecohabit.repository.EcoHabitRepository;
import java.util.List;

/**
 * Controller coordinating user actions, view and repository.
 */
public class EcoHabitController {
    private final EcoHabitRepository repository;
    private final ConsoleView view;
    private boolean running = true;

    public EcoHabitController(EcoHabitRepository repository, ConsoleView view) {
        this.repository = repository;
        this.view = view;
    }

    public void start() {
        while (running) {
            view.showMenu();
            int choice = view.readInt("");
            switch (choice) {
                case 1: create(); break;
                case 2: listAll(); break;
                case 3: update(); break;
                case 4: delete(); break;
                case 5: findById(); break;
                case 0: running = false; break;
                default: view.showMessage("Unknown option");
            }
        }
        view.showMessage("Goodbye!");
    }

    private void create() {
        String name = view.readLine("Name: ");
        String desc = view.readLine("Description: ");
        String freq = view.readLine("Frequency (daily/weekly/etc): ");
        EcoHabit h = repository.create(name, desc, freq);
        view.showMessage("Created: " + h);
    }

    private void listAll() {
        List<EcoHabit> all = repository.findAll();
        view.showList(all);
    }

    private void update() {
        int id = view.readInt("ID to update: ");
        EcoHabit existing = repository.findById(id);
        if (existing == null) {
            view.showMessage("Not found: id=" + id);
            return;
        }
        String name = view.readLine("Name [" + existing.getName() + "]: ");
        if (name.isEmpty()) name = existing.getName();
        String desc = view.readLine("Description [" + existing.getDescription() + "]: ");
        if (desc.isEmpty()) desc = existing.getDescription();
        String freq = view.readLine("Frequency [" + existing.getFrequency() + "]: ");
        if (freq.isEmpty()) freq = existing.getFrequency();
        boolean ok = repository.update(id, name, desc, freq);
        view.showMessage(ok ? "Updated." : "Update failed.");
    }

    private void delete() {
        int id = view.readInt("ID to delete: ");
        boolean ok = repository.delete(id);
        view.showMessage(ok ? "Deleted." : "Delete failed.");
    }

    private void findById() {
        int id = view.readInt("ID to find: ");
        EcoHabit h = repository.findById(id);
        view.showMessage(h == null ? "Not found." : h.toString());
    }
}
