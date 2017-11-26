
package com.clara.test.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class User {

    @SerializedName("avatar_url")
    @Expose
    private String avatarUrl;
    @SerializedName("banner_url")
    @Expose
    private String bannerUrl;
    @SerializedName("profile_url")
    @Expose
    private String profileUrl;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("twitter")
    @Expose
    private String twitter;
    @SerializedName("is_verified")
    @Expose
    private boolean isVerified;

    /**
     * No args constructor for use in serialization
     * 
     */
    public User() {
    }

    /**
     * 
     * @param isVerified
     * @param twitter
     * @param username
     * @param bannerUrl
     * @param profileUrl
     * @param avatarUrl
     * @param displayName
     */
    public User(String avatarUrl, String bannerUrl, String profileUrl, String username, String displayName, String twitter, boolean isVerified) {
        super();
        this.avatarUrl = avatarUrl;
        this.bannerUrl = bannerUrl;
        this.profileUrl = profileUrl;
        this.username = username;
        this.displayName = displayName;
        this.twitter = twitter;
        this.isVerified = isVerified;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public User withAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public User withBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
        return this;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public User withProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User withUsername(String username) {
        this.username = username;
        return this;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public User withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public User withTwitter(String twitter) {
        this.twitter = twitter;
        return this;
    }

    public boolean isIsVerified() {
        return isVerified;
    }

    public void setIsVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public User withIsVerified(boolean isVerified) {
        this.isVerified = isVerified;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("avatarUrl", avatarUrl).append("bannerUrl", bannerUrl).append("profileUrl", profileUrl).append("username", username).append("displayName", displayName).append("twitter", twitter).append("isVerified", isVerified).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isVerified).append(twitter).append(username).append(bannerUrl).append(profileUrl).append(avatarUrl).append(displayName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof User) == false) {
            return false;
        }
        User rhs = ((User) other);
        return new EqualsBuilder().append(isVerified, rhs.isVerified).append(twitter, rhs.twitter).append(username, rhs.username).append(bannerUrl, rhs.bannerUrl).append(profileUrl, rhs.profileUrl).append(avatarUrl, rhs.avatarUrl).append(displayName, rhs.displayName).isEquals();
    }

}
