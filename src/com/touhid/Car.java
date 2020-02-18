package com.touhid;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // Method for manipulate the Model variable because it's private
    public void setModel(String model) {
        String validModel = model.toLowerCase(); // Validation
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model; // need to use this keyword to manipulate the model variable
        } else {
            System.out.println("Unknown");
        }
    }

    public String getModel() {
        return this.model; // to get the value of the model variable
    }
}
