
package com.clara.test.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Original {

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
    @SerializedName("frames")
    @Expose
    private String frames;
    @SerializedName("mp4")
    @Expose
    private String mp4;
    @SerializedName("mp4_size")
    @Expose
    private String mp4Size;
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
    public Original() {
    }

    /**
     * 
     * @param webpSize
     * @param webp
     * @param mp4Size
     * @param height
     * @param frames
     * @param width
     * @param mp4
     * @param url
     * @param size
     */
    public Original(String url, String width, String height, String size, String frames, String mp4, String mp4Size, String webp, String webpSize) {
        super();
        this.url = url;
        this.width = width;
        this.height = height;
        this.size = size;
        this.frames = frames;
        this.mp4 = mp4;
        this.mp4Size = mp4Size;
        this.webp = webp;
        this.webpSize = webpSize;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Original withUrl(String url) {
        this.url = url;
        return this;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public Original withWidth(String width) {
        this.width = width;
        return this;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public Original withHeight(String height) {
        this.height = height;
        return this;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Original withSize(String size) {
        this.size = size;
        return this;
    }

    public String getFrames() {
        return frames;
    }

    public void setFrames(String frames) {
        this.frames = frames;
    }

    public Original withFrames(String frames) {
        this.frames = frames;
        return this;
    }

    public String getMp4() {
        return mp4;
    }

    public void setMp4(String mp4) {
        this.mp4 = mp4;
    }

    public Original withMp4(String mp4) {
        this.mp4 = mp4;
        return this;
    }

    public String getMp4Size() {
        return mp4Size;
    }

    public void setMp4Size(String mp4Size) {
        this.mp4Size = mp4Size;
    }

    public Original withMp4Size(String mp4Size) {
        this.mp4Size = mp4Size;
        return this;
    }

    public String getWebp() {
        return webp;
    }

    public void setWebp(String webp) {
        this.webp = webp;
    }

    public Original withWebp(String webp) {
        this.webp = webp;
        return this;
    }

    public String getWebpSize() {
        return webpSize;
    }

    public void setWebpSize(String webpSize) {
        this.webpSize = webpSize;
    }

    public Original withWebpSize(String webpSize) {
        this.webpSize = webpSize;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("url", url).append("width", width).append("height", height).append("size", size).append("frames", frames).append("mp4", mp4).append("mp4Size", mp4Size).append("webp", webp).append("webpSize", webpSize).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(webpSize).append(webp).append(mp4Size).append(height).append(frames).append(width).append(mp4).append(url).append(size).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Original) == false) {
            return false;
        }
        Original rhs = ((Original) other);
        return new EqualsBuilder().append(webpSize, rhs.webpSize).append(webp, rhs.webp).append(mp4Size, rhs.mp4Size).append(height, rhs.height).append(frames, rhs.frames).append(width, rhs.width).append(mp4, rhs.mp4).append(url, rhs.url).append(size, rhs.size).isEquals();
    }

}
