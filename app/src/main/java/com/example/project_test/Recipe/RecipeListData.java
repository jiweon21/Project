package com.example.project_test.Recipe;

public class RecipeListData {
    private int img;
    private String title, day, id, con;
    private String tabTitle;

    /*private int comment_cnt,like_cnt;*/

    public RecipeListData(int img, String title, String day, String id, String tabTitle, String con) {
        this.img = img;
        this.title = title;
        this.day = day;
        this.id = id;
        this.tabTitle = tabTitle;
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

    public String getTabTitle() {return this.tabTitle;}

    public String getCon() {return this.con;}
}
