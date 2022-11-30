package com.example.demo;

public class Player
{
    int points;
    String marker;
    String name;
    public Player(String marker, String name){
        this.points = 0;
        this.marker = marker;
        this.name = name;
    }

    public int getPoints()
    {
        return points;
    }

    public void setPoints(int points)
    {
        this.points = points;
    }

    public String getMarker()
    {
        return marker;
    }

    public void setMarker(String marker)
    {
        this.marker = marker;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
