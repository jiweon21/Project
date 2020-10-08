package com.example.project_test.Food;

public class FoodListData {
    private int img;
    private String title, day, id, con;

    public FoodListData(int img, String title, String day, String id, String con) {
        this.img = img;
        this.title = title;
        this.day = day;
        this.id = id;
        this.con = con;
    }

    public int getImg() {
        return this.img;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDay() {
        return this.day;
    }

    public String getId() {
        return this.id;
    }

    public String getCon() {
        return this.con;
    }
}
