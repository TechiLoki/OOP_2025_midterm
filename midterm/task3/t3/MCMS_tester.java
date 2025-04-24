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
