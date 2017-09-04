package org.vivian.messenger.Exception;

/**
 * Created by vsummers on 6/18/17.
 */
public class DataNotFoundException extends RuntimeException  {

    private static final long serialVersionUID = -62839032432423523L;

    public DataNotFoundException(String message) {
        super(message);
    }
}
