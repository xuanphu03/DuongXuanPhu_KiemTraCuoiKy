package com.ute.kiemtracuoiky_duongxuanphu;

public class BookmarkItem {
    private String title;
    private String description;
    private int imageResourceId;

    public BookmarkItem(String title, String description, int imageResourceId) {
        this.title = title;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
