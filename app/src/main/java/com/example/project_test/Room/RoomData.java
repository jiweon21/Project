package com.example.project_test.Room;

import com.google.gson.annotations.SerializedName;

public class RoomData {
    @SerializedName("post_code")
    public int post_code;

    @SerializedName("post_title")
    public String post_title;

    @SerializedName("post_con")
    public String post_con;

    @SerializedName("post_day")
    public String post_day;

    @SerializedName("id")
    public String id;

    @SerializedName("room_lct")
    public String room_lct;

    @SerializedName("room_day")
    public String room_day;

    @SerializedName("room_p")
    public String room_p;

    @Override
    public String toString() {
        return "RoomData{" +
                "post_title='" + post_title + '\'' +
                ", post_con='" + post_con + '\'' +
                ", id='" + id + '\'' +
                ", room_lct='" + room_lct + '\'' +
                ", room_day='" + room_day + '\'' +
                '}';
    }
}
