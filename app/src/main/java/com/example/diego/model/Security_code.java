package com.example.diego.model;

/**
 * Created by diego on 17/12/15.
 */
public class Security_code
{
    private String length;

    private String card_location;

    private String mode;

    public String getLength ()
    {
        return length;
    }

    public void setLength (String length)
    {
        this.length = length;
    }

    public String getCard_location ()
    {
        return card_location;
    }

    public void setCard_location (String card_location)
    {
        this.card_location = card_location;
    }

    public String getMode ()
    {
        return mode;
    }

    public void setMode (String mode)
    {
        this.mode = mode;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [length = "+length+", card_location = "+card_location+", mode = "+mode+"]";
    }
}
