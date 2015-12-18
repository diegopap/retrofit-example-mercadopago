package com.example.diego.model;

/**
 * Created by diego on 17/12/15.
 */
public class Settings
{
    private Card_number card_number;

    private Bin bin;

    private Security_code security_code;

    public Card_number getCard_number ()
    {
        return card_number;
    }

    public void setCard_number (Card_number card_number)
    {
        this.card_number = card_number;
    }

    public Bin getBin ()
    {
        return bin;
    }

    public void setBin (Bin bin)
    {
        this.bin = bin;
    }

    public Security_code getSecurity_code ()
    {
        return security_code;
    }

    public void setSecurity_code (Security_code security_code)
    {
        this.security_code = security_code;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [card_number = "+card_number+", bin = "+bin+", security_code = "+security_code+"]";
    }
}
