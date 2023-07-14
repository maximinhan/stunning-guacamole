package com.example.companionobject.javasample;

import java.time.LocalDateTime;
import java.util.List;

public class JavaEntityClass {
    private String title;
    private String content;
    private String sender;
    private List<String> receiver;
    private LocalDateTime requestTime;
    private String type;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public List<String> getReceiver() {
        return receiver;
    }

    public void setReceiver(List<String> receiver) {
        this.receiver = receiver;
    }

    public LocalDateTime getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(LocalDateTime requestTime) {
        this.requestTime = requestTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "JavaEntityClass{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", sender='" + sender + '\'' +
                ", receiver=" + receiver +
                ", requestTime=" + requestTime +
                ", type='" + type + '\'' +
                '}';
    }
}
