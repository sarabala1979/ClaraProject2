
package com.clara.test.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class FixedWidthSmallStill {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("height")
    @Expose
    private String height;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FixedWidthSmallStill() {
    }

    /**
     * 
     * @param height
     * @param width
     * @param url
     */
    public FixedWidthSmallStill(String url, String width, String height) {
        super();
        this.url = url;
        this.width = width;
        this.height = height;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public FixedWidthSmallStill withUrl(String url) {
        this.url = url;
        return this;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public FixedWidthSmallStill withWidth(String width) {
        this.width = width;
        return this;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public FixedWidthSmallStill withHeight(String height) {
        this.height = height;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("url", url).append("width", width).append("height", height).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(height).append(width).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FixedWidthSmallStill) == false) {
            return false;
        }
        FixedWidthSmallStill rhs = ((FixedWidthSmallStill) other);
        return new EqualsBuilder().append(height, rhs.height).append(width, rhs.width).append(url, rhs.url).isEquals();
    }

}
