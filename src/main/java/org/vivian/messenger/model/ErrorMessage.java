package org.vivian.messenger.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by vsummers on 6/18/17.
 */
@XmlRootElement
public class ErrorMessage {
    private String errorMessage;

    public ErrorMessage(String errorMessage, int errorCode, String documentation) {
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
        this.documentation = documentation;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    private int errorCode;
    private String documentation;
}
