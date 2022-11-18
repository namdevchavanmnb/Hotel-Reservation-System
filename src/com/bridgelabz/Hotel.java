package com.bridgelabz;

public class Hotel {
    String hotelName;
    int rating;
    int weekDayRate;
    int weekendRate;
    int regularCustomerRate;

    public Hotel(String hotelName, int rating, int weekDayRate, int weekendRate, int regularCustomerRate) {
        this.hotelName = hotelName;
        this.rating = rating;
        this.weekDayRate = weekDayRate;
        this.weekendRate = weekendRate;
        this.regularCustomerRate = regularCustomerRate;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getWeekDayRate() {
        return weekDayRate;
    }

    public void setWeekDayRate(int weekDayRate) {
        this.weekDayRate = weekDayRate;
    }

    public int getWeekendRate() {
        return weekendRate;
    }

    public void setWeekendRate(int weekendRate) {
        this.weekendRate = weekendRate;
    }

    public int getRegularCustomerRate() {
        return regularCustomerRate;
    }

    public void setRegularCustomerRate(int regularCustomerRate) {
        this.regularCustomerRate = regularCustomerRate;
    }

    @Override
    public String toString() {
        return "Hotel Details :- "+'\n'+
                "HotelName = " + hotelName +"  " +
                "Rating =" + rating +" "+
                "WeekDayRate =" + weekDayRate +" "+
                "WeekendRate =" + weekendRate +" "+
                "RegularCustomerRate =" + regularCustomerRate;
    }
}

