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
        }

        else {
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
