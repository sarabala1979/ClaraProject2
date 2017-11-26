
package com.clara.test.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Images {

    @SerializedName("fixed_height_still")
    @Expose
    private FixedHeightStill fixedHeightStill;
    @SerializedName("original_still")
    @Expose
    private OriginalStill originalStill;
    @SerializedName("fixed_width")
    @Expose
    private FixedWidth fixedWidth;
    @SerializedName("fixed_height_small_still")
    @Expose
    private FixedHeightSmallStill fixedHeightSmallStill;
    @SerializedName("fixed_height_downsampled")
    @Expose
    private FixedHeightDownsampled fixedHeightDownsampled;
    @SerializedName("preview")
    @Expose
    private Preview preview;
    @SerializedName("fixed_height_small")
    @Expose
    private FixedHeightSmall fixedHeightSmall;
    @SerializedName("downsized_still")
    @Expose
    private DownsizedStill downsizedStill;
    @SerializedName("downsized")
    @Expose
    private Downsized downsized;
    @SerializedName("downsized_large")
    @Expose
    private DownsizedLarge downsizedLarge;
    @SerializedName("fixed_width_small_still")
    @Expose
    private FixedWidthSmallStill fixedWidthSmallStill;
    @SerializedName("preview_webp")
    @Expose
    private PreviewWebp previewWebp;
    @SerializedName("fixed_width_still")
    @Expose
    private FixedWidthStill fixedWidthStill;
    @SerializedName("fixed_width_small")
    @Expose
    private FixedWidthSmall fixedWidthSmall;
    @SerializedName("downsized_small")
    @Expose
    private DownsizedSmall downsizedSmall;
    @SerializedName("fixed_width_downsampled")
    @Expose
    private FixedWidthDownsampled fixedWidthDownsampled;
    @SerializedName("downsized_medium")
    @Expose
    private DownsizedMedium downsizedMedium;
    @SerializedName("original")
    @Expose
    private Original original;
    @SerializedName("fixed_height")
    @Expose
    private FixedHeight fixedHeight;
    @SerializedName("looping")
    @Expose
    private Looping looping;
    @SerializedName("original_mp4")
    @Expose
    private OriginalMp4 originalMp4;
    @SerializedName("preview_gif")
    @Expose
    private PreviewGif previewGif;
    @SerializedName("480w_still")
    @Expose
    private com.clara.test.pojo._480wStill _480wStill;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Images() {
    }

    /**
     * 
     * @param previewGif
     * @param originalMp4
     * @param originalStill
     * @param fixedHeightSmallStill
     * @param downsizedMedium
     * @param previewWebp
     * @param fixedWidth
     * @param looping
     * @param downsizedLarge
     * @param downsizedStill
     * @param fixedWidthSmallStill
     * @param fixedWidthSmall
     * @param fixedHeight
     * @param fixedWidthStill
     * @param fixedWidthDownsampled
     * @param preview
     * @param fixedHeightSmall
     * @param downsizedSmall
     * @param _480wStill
     * @param original
     * @param fixedHeightDownsampled
     * @param fixedHeightStill
     * @param downsized
     */
    public Images(FixedHeightStill fixedHeightStill, OriginalStill originalStill, FixedWidth fixedWidth, FixedHeightSmallStill fixedHeightSmallStill, FixedHeightDownsampled fixedHeightDownsampled, Preview preview, FixedHeightSmall fixedHeightSmall, DownsizedStill downsizedStill, Downsized downsized, DownsizedLarge downsizedLarge, FixedWidthSmallStill fixedWidthSmallStill, PreviewWebp previewWebp, FixedWidthStill fixedWidthStill, FixedWidthSmall fixedWidthSmall, DownsizedSmall downsizedSmall, FixedWidthDownsampled fixedWidthDownsampled, DownsizedMedium downsizedMedium, Original original, FixedHeight fixedHeight, Looping looping, OriginalMp4 originalMp4, PreviewGif previewGif, com.clara.test.pojo._480wStill _480wStill) {
        super();
        this.fixedHeightStill = fixedHeightStill;
        this.originalStill = originalStill;
        this.fixedWidth = fixedWidth;
        this.fixedHeightSmallStill = fixedHeightSmallStill;
        this.fixedHeightDownsampled = fixedHeightDownsampled;
        this.preview = preview;
        this.fixedHeightSmall = fixedHeightSmall;
        this.downsizedStill = downsizedStill;
        this.downsized = downsized;
        this.downsizedLarge = downsizedLarge;
        this.fixedWidthSmallStill = fixedWidthSmallStill;
        this.previewWebp = previewWebp;
        this.fixedWidthStill = fixedWidthStill;
        this.fixedWidthSmall = fixedWidthSmall;
        this.downsizedSmall = downsizedSmall;
        this.fixedWidthDownsampled = fixedWidthDownsampled;
        this.downsizedMedium = downsizedMedium;
        this.original = original;
        this.fixedHeight = fixedHeight;
        this.looping = looping;
        this.originalMp4 = originalMp4;
        this.previewGif = previewGif;
        this._480wStill = _480wStill;
    }

    public FixedHeightStill getFixedHeightStill() {
        return fixedHeightStill;
    }

    public void setFixedHeightStill(FixedHeightStill fixedHeightStill) {
        this.fixedHeightStill = fixedHeightStill;
    }

    public Images withFixedHeightStill(FixedHeightStill fixedHeightStill) {
        this.fixedHeightStill = fixedHeightStill;
        return this;
    }

    public OriginalStill getOriginalStill() {
        return originalStill;
    }

    public void setOriginalStill(OriginalStill originalStill) {
        this.originalStill = originalStill;
    }

    public Images withOriginalStill(OriginalStill originalStill) {
        this.originalStill = originalStill;
        return this;
    }

    public FixedWidth getFixedWidth() {
        return fixedWidth;
    }

    public void setFixedWidth(FixedWidth fixedWidth) {
        this.fixedWidth = fixedWidth;
    }

    public Images withFixedWidth(FixedWidth fixedWidth) {
        this.fixedWidth = fixedWidth;
        return this;
    }

    public FixedHeightSmallStill getFixedHeightSmallStill() {
        return fixedHeightSmallStill;
    }

    public void setFixedHeightSmallStill(FixedHeightSmallStill fixedHeightSmallStill) {
        this.fixedHeightSmallStill = fixedHeightSmallStill;
    }

    public Images withFixedHeightSmallStill(FixedHeightSmallStill fixedHeightSmallStill) {
        this.fixedHeightSmallStill = fixedHeightSmallStill;
        return this;
    }

    public FixedHeightDownsampled getFixedHeightDownsampled() {
        return fixedHeightDownsampled;
    }

    public void setFixedHeightDownsampled(FixedHeightDownsampled fixedHeightDownsampled) {
        this.fixedHeightDownsampled = fixedHeightDownsampled;
    }

    public Images withFixedHeightDownsampled(FixedHeightDownsampled fixedHeightDownsampled) {
        this.fixedHeightDownsampled = fixedHeightDownsampled;
        return this;
    }

    public Preview getPreview() {
        return preview;
    }

    public void setPreview(Preview preview) {
        this.preview = preview;
    }

    public Images withPreview(Preview preview) {
        this.preview = preview;
        return this;
    }

    public FixedHeightSmall getFixedHeightSmall() {
        return fixedHeightSmall;
    }

    public void setFixedHeightSmall(FixedHeightSmall fixedHeightSmall) {
        this.fixedHeightSmall = fixedHeightSmall;
    }

    public Images withFixedHeightSmall(FixedHeightSmall fixedHeightSmall) {
        this.fixedHeightSmall = fixedHeightSmall;
        return this;
    }

    public DownsizedStill getDownsizedStill() {
        return downsizedStill;
    }

    public void setDownsizedStill(DownsizedStill downsizedStill) {
        this.downsizedStill = downsizedStill;
    }

    public Images withDownsizedStill(DownsizedStill downsizedStill) {
        this.downsizedStill = downsizedStill;
        return this;
    }

    public Downsized getDownsized() {
        return downsized;
    }

    public void setDownsized(Downsized downsized) {
        this.downsized = downsized;
    }

    public Images withDownsized(Downsized downsized) {
        this.downsized = downsized;
        return this;
    }

    public DownsizedLarge getDownsizedLarge() {
        return downsizedLarge;
    }

    public void setDownsizedLarge(DownsizedLarge downsizedLarge) {
        this.downsizedLarge = downsizedLarge;
    }

    public Images withDownsizedLarge(DownsizedLarge downsizedLarge) {
        this.downsizedLarge = downsizedLarge;
        return this;
    }

    public FixedWidthSmallStill getFixedWidthSmallStill() {
        return fixedWidthSmallStill;
    }

    public void setFixedWidthSmallStill(FixedWidthSmallStill fixedWidthSmallStill) {
        this.fixedWidthSmallStill = fixedWidthSmallStill;
    }

    public Images withFixedWidthSmallStill(FixedWidthSmallStill fixedWidthSmallStill) {
        this.fixedWidthSmallStill = fixedWidthSmallStill;
        return this;
    }

    public PreviewWebp getPreviewWebp() {
        return previewWebp;
    }

    public void setPreviewWebp(PreviewWebp previewWebp) {
        this.previewWebp = previewWebp;
    }

    public Images withPreviewWebp(PreviewWebp previewWebp) {
        this.previewWebp = previewWebp;
        return this;
    }

    public FixedWidthStill getFixedWidthStill() {
        return fixedWidthStill;
    }

    public void setFixedWidthStill(FixedWidthStill fixedWidthStill) {
        this.fixedWidthStill = fixedWidthStill;
    }

    public Images withFixedWidthStill(FixedWidthStill fixedWidthStill) {
        this.fixedWidthStill = fixedWidthStill;
        return this;
    }

    public FixedWidthSmall getFixedWidthSmall() {
        return fixedWidthSmall;
    }

    public void setFixedWidthSmall(FixedWidthSmall fixedWidthSmall) {
        this.fixedWidthSmall = fixedWidthSmall;
    }

    public Images withFixedWidthSmall(FixedWidthSmall fixedWidthSmall) {
        this.fixedWidthSmall = fixedWidthSmall;
        return this;
    }

    public DownsizedSmall getDownsizedSmall() {
        return downsizedSmall;
    }

    public void setDownsizedSmall(DownsizedSmall downsizedSmall) {
        this.downsizedSmall = downsizedSmall;
    }

    public Images withDownsizedSmall(DownsizedSmall downsizedSmall) {
        this.downsizedSmall = downsizedSmall;
        return this;
    }

    public FixedWidthDownsampled getFixedWidthDownsampled() {
        return fixedWidthDownsampled;
    }

    public void setFixedWidthDownsampled(FixedWidthDownsampled fixedWidthDownsampled) {
        this.fixedWidthDownsampled = fixedWidthDownsampled;
    }

    public Images withFixedWidthDownsampled(FixedWidthDownsampled fixedWidthDownsampled) {
        this.fixedWidthDownsampled = fixedWidthDownsampled;
        return this;
    }

    public DownsizedMedium getDownsizedMedium() {
        return downsizedMedium;
    }

    public void setDownsizedMedium(DownsizedMedium downsizedMedium) {
        this.downsizedMedium = downsizedMedium;
    }

    public Images withDownsizedMedium(DownsizedMedium downsizedMedium) {
        this.downsizedMedium = downsizedMedium;
        return this;
    }

    public Original getOriginal() {
        return original;
    }

    public void setOriginal(Original original) {
        this.original = original;
    }

    public Images withOriginal(Original original) {
        this.original = original;
        return this;
    }

    public FixedHeight getFixedHeight() {
        return fixedHeight;
    }

    public void setFixedHeight(FixedHeight fixedHeight) {
        this.fixedHeight = fixedHeight;
    }

    public Images withFixedHeight(FixedHeight fixedHeight) {
        this.fixedHeight = fixedHeight;
        return this;
    }

    public Looping getLooping() {
        return looping;
    }

    public void setLooping(Looping looping) {
        this.looping = looping;
    }

    public Images withLooping(Looping looping) {
        this.looping = looping;
        return this;
    }

    public OriginalMp4 getOriginalMp4() {
        return originalMp4;
    }

    public void setOriginalMp4(OriginalMp4 originalMp4) {
        this.originalMp4 = originalMp4;
    }

    public Images withOriginalMp4(OriginalMp4 originalMp4) {
        this.originalMp4 = originalMp4;
        return this;
    }

    public PreviewGif getPreviewGif() {
        return previewGif;
    }

    public void setPreviewGif(PreviewGif previewGif) {
        this.previewGif = previewGif;
    }

    public Images withPreviewGif(PreviewGif previewGif) {
        this.previewGif = previewGif;
        return this;
    }

    public com.clara.test.pojo._480wStill get480wStill() {
        return _480wStill;
    }

    public void set480wStill(com.clara.test.pojo._480wStill _480wStill) {
        this._480wStill = _480wStill;
    }

    public Images with480wStill(com.clara.test.pojo._480wStill _480wStill) {
        this._480wStill = _480wStill;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fixedHeightStill", fixedHeightStill).append("originalStill", originalStill).append("fixedWidth", fixedWidth).append("fixedHeightSmallStill", fixedHeightSmallStill).append("fixedHeightDownsampled", fixedHeightDownsampled).append("preview", preview).append("fixedHeightSmall", fixedHeightSmall).append("downsizedStill", downsizedStill).append("downsized", downsized).append("downsizedLarge", downsizedLarge).append("fixedWidthSmallStill", fixedWidthSmallStill).append("previewWebp", previewWebp).append("fixedWidthStill", fixedWidthStill).append("fixedWidthSmall", fixedWidthSmall).append("downsizedSmall", downsizedSmall).append("fixedWidthDownsampled", fixedWidthDownsampled).append("downsizedMedium", downsizedMedium).append("original", original).append("fixedHeight", fixedHeight).append("looping", looping).append("originalMp4", originalMp4).append("previewGif", previewGif).append("_480wStill", _480wStill).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(previewGif).append(originalMp4).append(fixedHeightSmallStill).append(originalStill).append(downsizedMedium).append(previewWebp).append(fixedWidth).append(looping).append(downsizedLarge).append(downsizedStill).append(fixedWidthSmallStill).append(fixedWidthSmall).append(fixedHeight).append(fixedWidthStill).append(fixedWidthDownsampled).append(preview).append(fixedHeightSmall).append(downsizedSmall).append(_480wStill).append(original).append(fixedHeightDownsampled).append(downsized).append(fixedHeightStill).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Images) == false) {
            return false;
        }
        Images rhs = ((Images) other);
        return new EqualsBuilder().append(previewGif, rhs.previewGif).append(originalMp4, rhs.originalMp4).append(fixedHeightSmallStill, rhs.fixedHeightSmallStill).append(originalStill, rhs.originalStill).append(downsizedMedium, rhs.downsizedMedium).append(previewWebp, rhs.previewWebp).append(fixedWidth, rhs.fixedWidth).append(looping, rhs.looping).append(downsizedLarge, rhs.downsizedLarge).append(downsizedStill, rhs.downsizedStill).append(fixedWidthSmallStill, rhs.fixedWidthSmallStill).append(fixedWidthSmall, rhs.fixedWidthSmall).append(fixedHeight, rhs.fixedHeight).append(fixedWidthStill, rhs.fixedWidthStill).append(fixedWidthDownsampled, rhs.fixedWidthDownsampled).append(preview, rhs.preview).append(fixedHeightSmall, rhs.fixedHeightSmall).append(downsizedSmall, rhs.downsizedSmall).append(_480wStill, rhs._480wStill).append(original, rhs.original).append(fixedHeightDownsampled, rhs.fixedHeightDownsampled).append(downsized, rhs.downsized).append(fixedHeightStill, rhs.fixedHeightStill).isEquals();
    }

}
