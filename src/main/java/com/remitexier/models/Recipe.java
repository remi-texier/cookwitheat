package com.remitexier.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Ingredient {
    public String name;
    public String amount;
    public String unit;

    public Ingredient(String name, String amount, String unit) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public String getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }
}

public class Recipe {
    private String title;
    private Date publishDate;
    private ArrayList<Ingredient> ingredients;
    private ArrayList<String> preparation;
    private String comment;
    private ArrayList<String> nutrition;
    private String related;

    public Recipe(String title, 
                  Date publisDate, 
                  ArrayList<Ingredient> ingredients,
                  ArrayList<String> preparation,
                  String comment, 
                  ArrayList<String> nutrition,
                  String related) {
        this.title = title;
        this.publishDate = new Date(publishDate.getTime());
        this.ingredients = new ArrayList<>(ingredients);
        this.preparation = new ArrayList<>(preparation);
        this.comment = comment;
        this.nutrition = new ArrayList<>(nutrition);
        this.related = related;
    }

    public String getTitle() {
        return title;
    }

    public Date getPublishDate() {
        return new Date(publishDate.getTime());
    }

    public List<Ingredient> getIngredients() {
        return new ArrayList<>(ingredients);
    }

    public List<String> getPreparation() {
        return new ArrayList<>(preparation);
    }

    public String getComment() {
        return comment;
    }

    public List<String> getNutrition() {
        return new ArrayList<>(nutrition);
    }

    public String getRelated() {
        return related;
    }
}
