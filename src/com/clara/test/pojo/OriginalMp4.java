
package com.clara.test.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class OriginalMp4 {

    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("mp4")
    @Expose
    private String mp4;
    @SerializedName("mp4_size")
    @Expose
    private String mp4Size;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OriginalMp4() {
    }

    /**
     * 
     * @param mp4Size
     * @param height
     * @param width
     * @param mp4
     */
    public OriginalMp4(String width, String height, String mp4, String mp4Size) {
        super();
        this.width = width;
        this.height = height;
        this.mp4 = mp4;
        this.mp4Size = mp4Size;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public OriginalMp4 withWidth(String width) {
        this.width = width;
        return this;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public OriginalMp4 withHeight(String height) {
        this.height = height;
        return this;
    }

    public String getMp4() {
        return mp4;
    }

    public void setMp4(String mp4) {
        this.mp4 = mp4;
    }

    public OriginalMp4 withMp4(String mp4) {
        this.mp4 = mp4;
        return this;
    }

    public String getMp4Size() {
        return mp4Size;
    }

    public void setMp4Size(String mp4Size) {
        this.mp4Size = mp4Size;
    }

    public OriginalMp4 withMp4Size(String mp4Size) {
        this.mp4Size = mp4Size;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("width", width).append("height", height).append("mp4", mp4).append("mp4Size", mp4Size).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mp4Size).append(height).append(width).append(mp4).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OriginalMp4) == false) {
            return false;
        }
        OriginalMp4 rhs = ((OriginalMp4) other);
        return new EqualsBuilder().append(mp4Size, rhs.mp4Size).append(height, rhs.height).append(width, rhs.width).append(mp4, rhs.mp4).isEquals();
    }

}
