
package com.clara.test.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Datum {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("bitly_gif_url")
    @Expose
    private String bitlyGifUrl;
    @SerializedName("bitly_url")
    @Expose
    private String bitlyUrl;
    @SerializedName("embed_url")
    @Expose
    private String embedUrl;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("content_url")
    @Expose
    private String contentUrl;
    @SerializedName("source_tld")
    @Expose
    private String sourceTld;
    @SerializedName("source_post_url")
    @Expose
    private String sourcePostUrl;
    @SerializedName("is_indexable")
    @Expose
    private long isIndexable;
    @SerializedName("import_datetime")
    @Expose
    private String importDatetime;
    @SerializedName("trending_datetime")
    @Expose
    private String trendingDatetime;
    @SerializedName("images")
    @Expose
    private Images images;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("user")
    @Expose
    private User user;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Datum() {
    }

    /**
     * 
     * @param importDatetime
     * @param bitlyGifUrl
     * @param contentUrl
     * @param embedUrl
     * @param sourceTld
     * @param type
     * @param trendingDatetime
     * @param url
     * @param bitlyUrl
     * @param id
     * @param title
     * @param username
     * @param source
     * @param sourcePostUrl
     * @param images
     * @param isIndexable
     * @param slug
     * @param rating
     * @param user
     */
    public Datum(String type, String id, String slug, String url, String bitlyGifUrl, String bitlyUrl, String embedUrl, String username, String source, String rating, String contentUrl, String sourceTld, String sourcePostUrl, long isIndexable, String importDatetime, String trendingDatetime, Images images, String title, User user) {
        super();
        this.type = type;
        this.id = id;
        this.slug = slug;
        this.url = url;
        this.bitlyGifUrl = bitlyGifUrl;
        this.bitlyUrl = bitlyUrl;
        this.embedUrl = embedUrl;
        this.username = username;
        this.source = source;
        this.rating = rating;
        this.contentUrl = contentUrl;
        this.sourceTld = sourceTld;
        this.sourcePostUrl = sourcePostUrl;
        this.isIndexable = isIndexable;
        this.importDatetime = importDatetime;
        this.trendingDatetime = trendingDatetime;
        this.images = images;
        this.title = title;
        this.user = user;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Datum withType(String type) {
        this.type = type;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Datum withId(String id) {
        this.id = id;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Datum withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Datum withUrl(String url) {
        this.url = url;
        return this;
    }

    public String getBitlyGifUrl() {
        return bitlyGifUrl;
    }

    public void setBitlyGifUrl(String bitlyGifUrl) {
        this.bitlyGifUrl = bitlyGifUrl;
    }

    public Datum withBitlyGifUrl(String bitlyGifUrl) {
        this.bitlyGifUrl = bitlyGifUrl;
        return this;
    }

    public String getBitlyUrl() {
        return bitlyUrl;
    }

    public void setBitlyUrl(String bitlyUrl) {
        this.bitlyUrl = bitlyUrl;
    }

    public Datum withBitlyUrl(String bitlyUrl) {
        this.bitlyUrl = bitlyUrl;
        return this;
    }

    public String getEmbedUrl() {
        return embedUrl;
    }

    public void setEmbedUrl(String embedUrl) {
        this.embedUrl = embedUrl;
    }

    public Datum withEmbedUrl(String embedUrl) {
        this.embedUrl = embedUrl;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Datum withUsername(String username) {
        this.username = username;
        return this;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Datum withSource(String source) {
        this.source = source;
        return this;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Datum withRating(String rating) {
        this.rating = rating;
        return this;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public Datum withContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
        return this;
    }

    public String getSourceTld() {
        return sourceTld;
    }

    public void setSourceTld(String sourceTld) {
        this.sourceTld = sourceTld;
    }

    public Datum withSourceTld(String sourceTld) {
        this.sourceTld = sourceTld;
        return this;
    }

    public String getSourcePostUrl() {
        return sourcePostUrl;
    }

    public void setSourcePostUrl(String sourcePostUrl) {
        this.sourcePostUrl = sourcePostUrl;
    }

    public Datum withSourcePostUrl(String sourcePostUrl) {
        this.sourcePostUrl = sourcePostUrl;
        return this;
    }

    public long getIsIndexable() {
        return isIndexable;
    }

    public void setIsIndexable(long isIndexable) {
        this.isIndexable = isIndexable;
    }

    public Datum withIsIndexable(long isIndexable) {
        this.isIndexable = isIndexable;
        return this;
    }

    public String getImportDatetime() {
        return importDatetime;
    }

    public void setImportDatetime(String importDatetime) {
        this.importDatetime = importDatetime;
    }

    public Datum withImportDatetime(String importDatetime) {
        this.importDatetime = importDatetime;
        return this;
    }

    public String getTrendingDatetime() {
        return trendingDatetime;
    }

    public void setTrendingDatetime(String trendingDatetime) {
        this.trendingDatetime = trendingDatetime;
    }

    public Datum withTrendingDatetime(String trendingDatetime) {
        this.trendingDatetime = trendingDatetime;
        return this;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public Datum withImages(Images images) {
        this.images = images;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Datum withTitle(String title) {
        this.title = title;
        return this;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Datum withUser(User user) {
        this.user = user;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("id", id).append("slug", slug).append("url", url).append("bitlyGifUrl", bitlyGifUrl).append("bitlyUrl", bitlyUrl).append("embedUrl", embedUrl).append("username", username).append("source", source).append("rating", rating).append("contentUrl", contentUrl).append("sourceTld", sourceTld).append("sourcePostUrl", sourcePostUrl).append("isIndexable", isIndexable).append("importDatetime", importDatetime).append("trendingDatetime", trendingDatetime).append("images", images).append("title", title).append("user", user).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(importDatetime).append(bitlyGifUrl).append(contentUrl).append(embedUrl).append(sourceTld).append(type).append(trendingDatetime).append(url).append(bitlyUrl).append(id).append(title).append(username).append(source).append(sourcePostUrl).append(images).append(isIndexable).append(slug).append(rating).append(user).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Datum) == false) {
            return false;
        }
        Datum rhs = ((Datum) other);
        return new EqualsBuilder().append(importDatetime, rhs.importDatetime).append(bitlyGifUrl, rhs.bitlyGifUrl).append(contentUrl, rhs.contentUrl).append(embedUrl, rhs.embedUrl).append(sourceTld, rhs.sourceTld).append(type, rhs.type).append(trendingDatetime, rhs.trendingDatetime).append(url, rhs.url).append(bitlyUrl, rhs.bitlyUrl).append(id, rhs.id).append(title, rhs.title).append(username, rhs.username).append(source, rhs.source).append(sourcePostUrl, rhs.sourcePostUrl).append(images, rhs.images).append(isIndexable, rhs.isIndexable).append(slug, rhs.slug).append(rating, rhs.rating).append(user, rhs.user).isEquals();
    }

}
