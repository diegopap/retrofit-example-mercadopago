package com.example.diego.model;

/**
 * Created by diego on 17/12/15.
 */
public class PaymentMethod
{
    private String id;

    private String[] additional_info_needed;

    private String thumbnail;

    private String secure_thumbnail;

    private String status;

    private Settings[] settings;

    private String deferred_capture;

    private String name;

    private String payment_type_id;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String[] getAdditional_info_needed ()
    {
        return additional_info_needed;
    }

    public void setAdditional_info_needed (String[] additional_info_needed)
    {
        this.additional_info_needed = additional_info_needed;
    }

    public String getThumbnail ()
    {
        return thumbnail;
    }

    public void setThumbnail (String thumbnail)
    {
        this.thumbnail = thumbnail;
    }

    public String getSecure_thumbnail ()
    {
        return secure_thumbnail;
    }

    public void setSecure_thumbnail (String secure_thumbnail)
    {
        this.secure_thumbnail = secure_thumbnail;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public Settings[] getSettings ()
    {
        return settings;
    }

    public void setSettings (Settings[] settings)
    {
        this.settings = settings;
    }

    public String getDeferred_capture ()
    {
        return deferred_capture;
    }

    public void setDeferred_capture (String deferred_capture)
    {
        this.deferred_capture = deferred_capture;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getPayment_type_id ()
    {
        return payment_type_id;
    }

    public void setPayment_type_id (String payment_type_id)
    {
        this.payment_type_id = payment_type_id;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", additional_info_needed = "+additional_info_needed+", thumbnail = "+thumbnail+", secure_thumbnail = "+secure_thumbnail+", status = "+status+", settings = "+settings+", deferred_capture = "+deferred_capture+", name = "+name+", payment_type_id = "+payment_type_id+"]";
    }
}
