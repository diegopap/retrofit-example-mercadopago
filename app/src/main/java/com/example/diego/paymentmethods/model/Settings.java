package com.example.diego.paymentmethods.model;

/**
 * Created by diego on 17/12/15.
 */
public class Settings
{
    private CardNumber card_number;

    private Bin bin;

    private SecurityCode security_code;

    public CardNumber getCard_number ()
    {
        return card_number;
    }

    public void setCard_number (CardNumber card_number)
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

    public SecurityCode getSecurity_code ()
    {
        return security_code;
    }

    public void setSecurity_code (SecurityCode security_code)
    {
        this.security_code = security_code;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [card_number = "+card_number+", bin = "+bin+", security_code = "+security_code+"]";
    }
}
