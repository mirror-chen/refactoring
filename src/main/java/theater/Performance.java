package theater;

/**
 * Class representing a performance of a play.
 */
public class Performance {

    private final String playID;
    private final int audience;

    /**
     * Constructs a Performance with a specific play ID and audience size.
     *
     * @param playID   the ID of the play being performed
     * @param audience the number of people in the audience
     */
    public Performance(String playID, int audience) {
        this.playID = playID;
        this.audience = audience;
    }

    /**
     * Returns the ID of the play.
     *
     * @return the play ID
     */
    public final String getPlayID() {
        return playID;
    }

    /**
     * Returns the size of the audience.
     *
     * @return the audience size
     */
    public final int getAudience() {
        return audience;
    }
}