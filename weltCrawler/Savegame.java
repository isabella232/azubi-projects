package weltcrawler;

import java.time.LocalDateTime;
import java.util.*;
import java.io.*;

public class Savegame implements Serializable {

    /**
     * Play me!
     */
    public static void main(String...args) {
        final Savegame save = Savegame.load();
        int level, experience;

        if (save == null) {
            System.out.println("Starting a new game .. welcome hero!");
            level = 1;
            experience = 0;
        } else {
            System.out.println("Continuing game .. welcome back, hero!");
            level = save.currentLevel;
            experience = save.experience;
        }

        System.out.println("You're level " + level + " and have " + experience + " XP!");
        level++;
        experience += new Random().nextInt(1000);

        final Savegame newSave = new Savegame();
        newSave.currentLevel = level;
        newSave.experience = experience;

        Savegame.save(newSave);
    }

    LocalDateTime savedAt;
    int experience;
    int currentLevel;

    public static Savegame load() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("savegame.dat"))) {
            return (Savegame) in.readObject();
        } catch (Exception ex) {
            return null;
        }
    }

    public static void save(Savegame savegame) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("savegame.dat"))) {
            savegame.savedAt = LocalDateTime.now();
            out.writeObject(savegame);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static final long serialVersionUID = 4711L; // ignore
}