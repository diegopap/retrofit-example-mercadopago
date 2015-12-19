package com.example.diego.paymentmethods.model;

/**
 * Created by diego on 17/12/15.
 */
public class Bin
{
    private String pattern;

    private String installments_pattern;

    private String exclusion_pattern;

    public String getPattern ()
    {
        return pattern;
    }

    public void setPattern (String pattern)
    {
        this.pattern = pattern;
    }

    public String getInstallments_pattern ()
    {
        return installments_pattern;
    }

    public void setInstallments_pattern (String installments_pattern)
    {
        this.installments_pattern = installments_pattern;
    }

    public String getExclusion_pattern ()
    {
        return exclusion_pattern;
    }

    public void setExclusion_pattern (String exclusion_pattern)
    {
        this.exclusion_pattern = exclusion_pattern;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [pattern = "+pattern+", installments_pattern = "+installments_pattern+", exclusion_pattern = "+exclusion_pattern+"]";
    }
}
