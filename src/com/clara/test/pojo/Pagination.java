
package com.clara.test.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Pagination {

    @SerializedName("total_count")
    @Expose
    private long totalCount;
    @SerializedName("count")
    @Expose
    private long count;
    @SerializedName("offset")
    @Expose
    private long offset;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Pagination() {
    }

    /**
     * 
     * @param count
     * @param totalCount
     * @param offset
     */
    public Pagination(long totalCount, long count, long offset) {
        super();
        this.totalCount = totalCount;
        this.count = count;
        this.offset = offset;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public Pagination withTotalCount(long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public Pagination withCount(long count) {
        this.count = count;
        return this;
    }

    public long getOffset() {
        return offset;
    }

    public void setOffset(long offset) {
        this.offset = offset;
    }

    public Pagination withOffset(long offset) {
        this.offset = offset;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("totalCount", totalCount).append("count", count).append("offset", offset).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(count).append(totalCount).append(offset).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pagination) == false) {
            return false;
        }
        Pagination rhs = ((Pagination) other);
        return new EqualsBuilder().append(count, rhs.count).append(totalCount, rhs.totalCount).append(offset, rhs.offset).isEquals();
    }

}
