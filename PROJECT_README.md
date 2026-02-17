# Eco Habit Tracker (Core Java, Console, MVC)

Simple core Java console application demonstrating a small MVC-style CRUD app for tracking eco habits.

Structure (3 modules/packages):
- `com.ecohabit.model` - contains the `EcoHabit` model
- `com.ecohabit.repository` - in-memory `EcoHabitRepository` (CRUD)
- `com.ecohabit.app` - controller, console view and `App` entrypoint

How to compile and run (from project root):

```bash
# compile
javac -d out $(find src -name "*.java")

# run
java -cp out com.ecohabit.app.App
```

