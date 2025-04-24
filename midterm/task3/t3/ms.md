# Music Collection Management System

**Author**: Grigori Kikvadze
**Course**: Object Oriented Programming  
**Date**: April 24, 2025  

---

## Description

Create a Music Collection Management System (MCMS) in Java. MCMS is a software system that allows managing a basic music library. It includes the following core features:

1. Storage for songs
2. Ability to add a song to the library
3. Ability to remove a song from the library
4. Ability to print all stored songs

---

## MCMS Structure

The following classes are used to implement the system:

1. `Song` – represents a song.
2. `MCMS` – the music collection management system.
3. `MCMS_tester` – the tester class to test functionality.

---

## Class: Song

```java
package midterm.task3.t3;

public class Song {
    private String title, artist;

    public String getTitle() { return title; }
    public String getArtist() { return artist; }

    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String artist) { this.artist = artist; }
    
    Song(String title, String artist) {
        setAuthor(artist);
        setTitle(title);
    }
}
```
## Class: MCMS

```java
package midterm.task3.t3;

import java.util.ArrayList;
import java.util.List;

public class MCMS {
    private List<Song> storage = new ArrayList<Song>();

    public void addSong(Song song) {
        storage.add(song);
    }

    public boolean removeSong(Song song) {
        boolean removed = false;
        for (int i = 0; i < storage.size(); i++) {
            Song s = storage.get(i);
            if (s.getTitle().equals(song.getTitle()) && s.getArtist().equals(song.getArtist())) {
                storage.remove(i);
                removed = true;
                break;
            }
        }
        return removed;
    }

    public void printStorage() {
        if (storage.isEmpty()) { 
            System.out.println("The storage is empty.");
        } else {
            for (Song s : storage) {
                System.out.println(s.getArtist() + ", " + s.getTitle());
            }
        }
    }

    /**
     * New feature can be seen implemented here
     * Now users can print songs from a specific artist
     */
    public void printTracksByArtist(String artistName) {
        boolean found = false;
        for (Song s : storage) {
            if (s.getArtist().equalsIgnoreCase(artistName)) {
                System.out.println(s.getArtist() + " - " + s.getTitle());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No tracks found by " + artistName);
        }
    }
}
```
## Class: MCMS_tester

```java
package midterm.task3.t3;

public class MCMS_tester {
    public static void main(String[] args){
        
        Song s1 = new Song("song1", "musician1");
        Song s2 = new Song("song2", "musician2");
        Song s3 = new Song("song3", "musician3");
        Song s4 = new Song("song4", "musician2");
        Song s5 = new Song("song5", "musician2");
    
        MCMS mcms = new MCMS();

        mcms.addSong(s1);
        mcms.addSong(s2);
        mcms.addSong(s2);
        mcms.addSong(s3);
        mcms.addSong(s4);
        mcms.addSong(s5);

        mcms.removeSong(s2);

        System.out.println("TEST OF PRINTING THE WHOLE STORAGE");
        mcms.printStorage();

        /**
         * New feature is tested here
         */
        System.out.println();
        System.out.println("TEST OF PRINTING A SPECIFIC ARTIST");
        mcms.printTracksByArtist("musician2");
    } 
}  
```
---

## New Feature

The new feature added to this management system is the ability to print all songs by a specific artist. The method printTracksByArtist(String artistName) in the MCMS class implements this feature. It searches through the song storage and prints only the songs whose artist matches the given input, ignoring case sensitivity.

This allows users to quickly filter their collection and view all tracks by a single artist, improving navigation and usability.