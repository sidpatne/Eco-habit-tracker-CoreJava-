package com.ecohabit.app;

import com.ecohabit.model.EcoHabit;
import java.util.List;
import java.util.Scanner;

/**
 * Console-based view for interacting with the user.
 */
public class ConsoleView {
    private final Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("\n=== Eco Habit Tracker ===");
        System.out.println("1) Create habit");
        System.out.println("2) List habits");
        System.out.println("3) Update habit");
        System.out.println("4) Delete habit");
        System.out.println("5) Find habit by id");
        System.out.println("0) Exit");
        System.out.print("Choose an option: ");
    }

    public int readInt(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print(prompt);
        }
        int val = scanner.nextInt();
        scanner.nextLine(); // consume newline
        return val;
    }

    public String readLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    public void showList(List<EcoHabit> list) {
        if (list.isEmpty()) {
            System.out.println("No habits yet.");
            return;
        }
        System.out.println("\n-- Habits --");
        for (EcoHabit h : list) {
            System.out.println(h);
        }
    }

    public void showMessage(String msg) {
        System.out.println(msg);
    }
}
