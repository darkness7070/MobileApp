package com.example.mobileapp;

public class Application {
    public int id;
    public String dateTo;
    public String dateFrom;
    public String type;
    public String subdivision;

    public Application(int id, String dateTo, String dateFrom, String type, String subdivision) {
        this.id = id;
        this.dateTo = dateTo;
        this.dateFrom = dateFrom;
        this.type = type;
        this.subdivision = subdivision;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }
}
