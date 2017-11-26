
package com.clara.test.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class FixedWidthDownsampled {

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
    @SerializedName("webp")
    @Expose
    private String webp;
    @SerializedName("webp_size")
    @Expose
    private String webpSize;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FixedWidthDownsampled() {
    }

    /**
     * 
     * @param webpSize
     * @param webp
     * @param height
     * @param width
     * @param url
     * @param size
     */
    public FixedWidthDownsampled(String url, String width, String height, String size, String webp, String webpSize) {
        super();
        this.url = url;
        this.width = width;
        this.height = height;
        this.size = size;
        this.webp = webp;
        this.webpSize = webpSize;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public FixedWidthDownsampled withUrl(String url) {
        this.url = url;
        return this;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public FixedWidthDownsampled withWidth(String width) {
        this.width = width;
        return this;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public FixedWidthDownsampled withHeight(String height) {
        this.height = height;
        return this;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public FixedWidthDownsampled withSize(String size) {
        this.size = size;
        return this;
    }

    public String getWebp() {
        return webp;
    }

    public void setWebp(String webp) {
        this.webp = webp;
    }

    public FixedWidthDownsampled withWebp(String webp) {
        this.webp = webp;
        return this;
    }

    public String getWebpSize() {
        return webpSize;
    }

    public void setWebpSize(String webpSize) {
        this.webpSize = webpSize;
    }

    public FixedWidthDownsampled withWebpSize(String webpSize) {
        this.webpSize = webpSize;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("url", url).append("width", width).append("height", height).append("size", size).append("webp", webp).append("webpSize", webpSize).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(webpSize).append(webp).append(height).append(width).append(url).append(size).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FixedWidthDownsampled) == false) {
            return false;
        }
        FixedWidthDownsampled rhs = ((FixedWidthDownsampled) other);
        return new EqualsBuilder().append(webpSize, rhs.webpSize).append(webp, rhs.webp).append(height, rhs.height).append(width, rhs.width).append(url, rhs.url).append(size, rhs.size).isEquals();
    }

}
