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
