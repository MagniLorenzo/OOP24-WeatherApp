package org.app.travelmode.model.exception;

import java.io.Serial;

/**
 * Exception thrown when errors occur during the static map generation process.
 */
public class MapGenerationException extends Exception {

    @Serial
    private static final long serialVersionUID = -6218593020920459707L;

    /**
     * Constructs a new map generation exception with the specified detail message.
     *
     * @param message the detail message describing the error condition
     */
    public MapGenerationException(final String message) {
        super(message);
    }

    /**
     * Constructs a new map generation exception with the specified detail message and cause.
     *
     * @param message the detail message describing the error condition
     * @param cause   the cause of this exception
     */
    public MapGenerationException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
