package com.example.project_test.SharenRent;

public class ShareListData {
    private int img;
    private String title, day, id, con, price;

    public ShareListData(int img, String title , String price /*, String day, String id, String con*/) {
        this.img = img;
        this.title = title;
        this.price = price;
        //this.day = day;
        //this.id = id;
        //this.con = con;
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

    public String getPrice() {
        return this.price;
    }
}
