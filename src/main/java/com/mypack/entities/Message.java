package com.mypack.entities;
import lombok.*;
import java.time.LocalDateTime;
@Getter
@Setter
@Data  // Automatically generates Getters & Setters
//@NoArgsConstructor  // Generates No-Args Constructor
@AllArgsConstructor // Generates Constructor with all fields
public class Message {
    private String sender;
    private String content;
    private LocalDateTime timeStamp;

    public Message(String sender, String content) {
        this.sender = sender;
        this.content = content;
        this.timeStamp = LocalDateTime.now();
    }
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }
    public Message() {
        // Needed for frameworks like Spring/JPA
    }
}
