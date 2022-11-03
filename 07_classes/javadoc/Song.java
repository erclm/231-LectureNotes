/** A representation of a Song on a music streaming platform.
 * Holds variables for the title and author 
 * and whether or not the song is favorited or currently playing.
 * 
 * @author Murphy Studebaker
 * @version 1.0
 */
public class Song {
    private String title;
    private String author;
    private boolean isFavorited;
    private boolean isPlaying;
    /** No Covers are allowed on the platform */
    public static final boolean isCover = false;
    /** A running tally of how many Song Objects have been constructed */
    public static int songsOnPlatform = 0;

    /** Default Constructor sets title and author to null 
     * and isFavorited and isPlaying to false */
    public Song() {
        // default constructor
        this.title = null;
        this.author = null;
        this.isFavorited = false;
        this.isPlaying = false;
        songsOnPlatform++;
    }

    /** Overloaded Constructor accepts values for title and artist 
     * @param title the String representation of the song's title and any remix information
     * @param artist the String representation of the Artist and any collaborators 
     */
    public Song(String title, String artist) {
        // overloaded constructor
        this.title = title;
        this.author = artist;
        this.isFavorited = false;
        this.isPlaying = false;
        songsOnPlatform++;
    }

    /** Copy Constructor
     * @param other is another Song of which to copy over all values
     */
    public Song(Song other) {
        // copy constructor
        this.title = other.getTitle();
        this.author = other.getAuthor();
        this.isFavorited = other.isFavorited();
        this.isPlaying = other.isPlaying();
        songsOnPlatform++;
    }

    /** Accessor for the String representation of title
     * @return the String representation of title
     */
    public String getTitle() {
        return this.title;
    }

    /** Mutator for Title
     * @param newTitle the new String representation of the song's title with any remix information
     */
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    /** Accessor for Author
     * @return author of the song and any collaborators
     */
    public String getAuthor() {
        return author;
    }

    /** Accessor for isFavorited
     * @return isFavorited, a boolean value denoting whether or not the current user has favorited this song
     */
    public boolean isFavorited() {
        return isFavorited;
    }

    /** Accessor for isPlaying
     * @return isPlaying the boolean representation of whether or not the song is playing out loud
     */
    public boolean isPlaying() {
        return isPlaying;
    }

    /** The Overriden toString
     * @return the Title and Author 
     */
    public String toString() {
        return title + " by " + author;
    }

    /** Two Song objects are equal if they share the same title and author
     * @return whether or not the two songs are equal
     */
    public boolean equals(Object o) {
        // make sure o is a Song
        // (and not something else like Playlist)
        if (!(o instanceof Song)) {
            return false;
        } else {
            // cast "down" into an object of this class
            Song other = (Song) o;
            return other.getTitle().equals(this.title)
                && other.getAuthor().equals(this.author);
        }
    }
}

