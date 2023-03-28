package com_java_maintenance_application_model_package_sama_velma_andin;

public class MaintenanceInventory {
    private String Car_Name;
    private String Transmission;
    private String Color;
    private String Seat;
    private String Quantity;
    private String Price;
    private String Discount;

    public MaintenanceInventory(String Car_Name, String Transmission, String Color, String Seat, String Quantity, String Price, String Discount) {
        this.Car_Name = Car_Name;
        this.Transmission = Transmission;
        this.Color = Color;
        this.Seat = Seat;
        this.Quantity = Quantity;
        this.Price = Price;
        this.Discount = Discount;
    }

    public String getCar_Name() {
        return Car_Name;
    }

    public void setCar_Name(String Car_Name) {
        this.Car_Name = Car_Name;
    }

    public String getTransmission() {
        return Transmission;
    }

    public void setTransmission(String Transmission) {
        this.Transmission = Transmission;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getSeat() {
        return Seat;
    }

    public void setSeat(String Seat) {
        this.Seat = Seat;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public String getDiscount() {
        return Discount;
    }

    public void setDiscount(String Discount) {
        this.Discount = Discount;
    }

}
