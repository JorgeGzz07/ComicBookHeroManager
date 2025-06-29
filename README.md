# Comic Book Hero Management System

A Java-based console application by [JorgeGzz07](https://github.com/JorgeGzz07) that allows users to manage a list of comic book heroes. The system supports adding, removing, sorting (Bubble Sort and Insertion Sort), and displaying heroes in a 2D array format.

## 📚 Features

- Create and manage comic book heroes with:
  - Name
  - Power Level
  - Team Affiliation (Enum)
- Add and remove heroes dynamically using `ArrayList`
- Sort heroes by power level using:
  - Bubble Sort
  - Insertion Sort
- Display hero data in a 2D array structure using `Arrays.deepToString()`

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Enums
- ArrayList
- Sorting Algorithms (Bubble Sort & Insertion Sort)

## 📁 File Structure

ComicBookHeroManager/
├── Affiliation.java # Enum for hero affiliations
├── Hero.java # Hero class with attributes and methods
├── HeroManager.java # Manages the list of heroes
└── Main.java # Runs and tests the application


## ▶️ How to Run

1. Make sure you have Java installed (`java -version` to check).
2. Clone the repo or download the folder.
3. Open terminal/command prompt and navigate to the project folder:
   ```bash
   cd path/to/ComicBookHeroManager
Compile the Java files:
javac *.java
Run the program:
java Main
✅ Example Output

Original List:
Spider-Man (Power: 85, Affiliation: AVENGERS)
...

After Bubble Sort by Power:
...

2D Array Display:
[[Spider-Man, 85, AVENGERS], ...]
🧠 Bonus Ideas

Add a superpower or originCity attribute to heroes
Implement search by name or team
Add GUI using JavaFX or Swing (future improvement)
👨‍💻 Author

GitHub: JorgeGzz07