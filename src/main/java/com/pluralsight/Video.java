package com.pluralsight;

public class Video {
    private String title;
    private int durationInMinutes;
    private int amountOfLikes;

    public Video(String title) {
        this.title = title;
    }
// method
    public void LikeVideo() {
        amountOfLikes++;
        System.out.println("Video Liked! Total Likes: " + amountOfLikes);
    }
}
