public class Main {
    public static void main(String[] args) {
        HeroManager manager = new HeroManager();

        // Add initial heroes
        manager.addHero(new Hero("Spider-Man", 85, Affiliation.AVENGERS));
        manager.addHero(new Hero("Batman", 80, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Wolverine", 90, Affiliation.X_MEN));
        manager.addHero(new Hero("Wonder Woman", 95, Affiliation.JUSTICE_LEAGUE));

        System.out.println("Original List:");
        manager.displayHeroes();

        // Bubble sort
        manager.bubbleSortByPower();
        System.out.println("\nAfter Bubble Sort by Power:");
        manager.displayHeroes();

        // Add them back in original order for insertion sort demonstration
        manager = new HeroManager();
        manager.addHero(new Hero("Spider-Man", 85, Affiliation.AVENGERS));
        manager.addHero(new Hero("Batman", 80, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Wolverine", 90, Affiliation.X_MEN));
        manager.addHero(new Hero("Wonder Woman", 95, Affiliation.JUSTICE_LEAGUE));

        // Insertion sort
        manager.insertionSortByPower();
        System.out.println("\nAfter Insertion Sort by Power:");
        manager.displayHeroes();

        // Remove a hero
        System.out.println("\nRemoving Batman...");
        manager.removeHero("Batman");
        manager.displayHeroes();

        // Add a new hero
        System.out.println("\nAdding Iron Man...");
        manager.addHero(new Hero("Iron Man", 88, Affiliation.AVENGERS));
        manager.displayHeroes();

        // Display in 2D Array format
        System.out.println("\n2D Array Display:");
        manager.displayHeroes2D();
    }
}
