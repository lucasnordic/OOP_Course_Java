package LecturesMyNotes;

public class Lecture5Song {

    public static void main(String[] args) {
        Song songOne = new Song("Sultans of Swing", "Dire straits", 1983, 03.30);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println(
                "Title is: " + songOne.title +
                "\nArtist name: " +
                songOne.artist +
                "\nRelease year: " +
                songOne.releaseYear +
                "\nSong length: " +
                songOne.songLength
        );
    }
}

class Song {

    // Don't initialize here.
    String title;
    String artist;
    int releaseYear;
    double songLength;

    // constructor
    Song (String title, String artist, int releaseYear, double songLength) {
        this.title = title;
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.songLength = songLength;
    }
}

class SongUnknownTitle {
    String title;
    String artist;
    int releaseYear;
    double songLength;
/*
    SongUnknownTitleLength (String creator, int year) {
        releaseYear = year;
        creator = artist;
    }

 */
}