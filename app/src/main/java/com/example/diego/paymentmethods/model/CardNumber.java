package com.example.diego.paymentmethods.model;

/**
 * Created by diego on 17/12/15.
 */
public class CardNumber
{
    private String validation;

    private String length;

    public String getValidation ()
    {
        return validation;
    }

    public void setValidation (String validation)
    {
        this.validation = validation;
    }

    public String getLength ()
    {
        return length;
    }

    public void setLength (String length)
    {
        this.length = length;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [validation = "+validation+", length = "+length+"]";
    }
}
