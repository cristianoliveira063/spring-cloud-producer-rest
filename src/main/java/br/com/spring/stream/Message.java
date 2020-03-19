package br.com.spring.stream;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Message {
    private String message;
    private String timestamp;

    public Message() {
        this.message = "This is a custom message";
        this.timestamp = getActualTime();
    }

    public Message(String customMessage) {
        this.message = customMessage;
        this.timestamp = getActualTime();
    }

    private String getActualTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        return sdf.format(new Date(System.currentTimeMillis()));
    }

    public String getMessage() {
        return this.message;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public String getCompleteMessage() {
        return this.message + " sent at " + getActualTime();
    }

}
