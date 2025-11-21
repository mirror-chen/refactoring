package theater;

/**
 * Class representing a play performed in the theater.
 */
public class Play {

    private final String name;
    private final String type;

    /**
     * Constructs a Play with a specific name and type.
     *
     * @param name the name of the play
     * @param type the genre/type of the play (e.g., "tragedy", "comedy")
     */
    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Returns the name of the play.
     *
     * @return the play name
     */
    public final String getName() {
        return name;
    }

    /**
     * Returns the type of the play.
     *
     * @return the play type
     */
    public final String getType() {
        return type;
    }
}