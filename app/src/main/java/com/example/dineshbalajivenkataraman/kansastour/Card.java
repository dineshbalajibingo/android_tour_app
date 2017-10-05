package com.example.dineshbalajivenkataraman.kansastour;
public class Card {
    private int imgURL;
    private String title;
    private String description;
    private String location;
    private String phoneNumber;
    private String hours;
    public Card(int imgURL, String title, String description, String location, String phoneNumber, String hours) {
        this.imgURL = imgURL;
        this.title = title;
        this.description = description;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.hours = hours;
    }
    public int getImgURL() {
        return imgURL;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public String getLocation() {
        return location;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getHours() {
        return hours;
    }
    @Override
    public String toString() {
        return "Card{" +
                "imgURL='" + imgURL + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", hours='" + hours + '\'' +
                '}';
    }
}
