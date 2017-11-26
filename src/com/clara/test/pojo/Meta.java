
package com.clara.test.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Meta {

    @SerializedName("status")
    @Expose
    private long status;
    @SerializedName("msg")
    @Expose
    private String msg;
    @SerializedName("response_id")
    @Expose
    private String responseId;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Meta() {
    }

    /**
     * 
     * @param responseId
     * @param status
     * @param msg
     */
    public Meta(long status, String msg, String responseId) {
        super();
        this.status = status;
        this.msg = msg;
        this.responseId = responseId;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    public Meta withStatus(long status) {
        this.status = status;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Meta withMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    public Meta withResponseId(String responseId) {
        this.responseId = responseId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("status", status).append("msg", msg).append("responseId", responseId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(responseId).append(status).append(msg).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Meta) == false) {
            return false;
        }
        Meta rhs = ((Meta) other);
        return new EqualsBuilder().append(responseId, rhs.responseId).append(status, rhs.status).append(msg, rhs.msg).isEquals();
    }

}
