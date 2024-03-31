package com.example.saurav_shrestha_project2;

public class Category_RecyclerView_List {
    private Integer category_image;
    private String category_name;

    public Category_RecyclerView_List(Integer category_image, String category_name) {
        this.category_image = category_image;
        this.category_name = category_name;
    }

    public Integer getCategory_image() {
        return category_image;
    }

    public void setCategory_image(Integer category_image) {
        this.category_image = category_image;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
}
