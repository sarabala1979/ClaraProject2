
package com.clara.test.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class DownsizedLarge {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("size")
    @Expose
    private String size;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DownsizedLarge() {
    }

    /**
     * 
     * @param height
     * @param width
     * @param url
     * @param size
     */
    public DownsizedLarge(String url, String width, String height, String size) {
        super();
        this.url = url;
        this.width = width;
        this.height = height;
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public DownsizedLarge withUrl(String url) {
        this.url = url;
        return this;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public DownsizedLarge withWidth(String width) {
        this.width = width;
        return this;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public DownsizedLarge withHeight(String height) {
        this.height = height;
        return this;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public DownsizedLarge withSize(String size) {
        this.size = size;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("url", url).append("width", width).append("height", height).append("size", size).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(height).append(width).append(url).append(size).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DownsizedLarge) == false) {
            return false;
        }
        DownsizedLarge rhs = ((DownsizedLarge) other);
        return new EqualsBuilder().append(height, rhs.height).append(width, rhs.width).append(url, rhs.url).append(size, rhs.size).isEquals();
    }

}
