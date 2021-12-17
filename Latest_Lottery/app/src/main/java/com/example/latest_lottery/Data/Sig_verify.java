package com.example.latest_lottery.Data;

import com.google.gson.annotations.SerializedName;

/**
 * Signature Verification page and it is generated by GSON api extract
 *
 * @author  Pinjia Zhang
 * @version 1.0
 * @release   12/16/2021
 */

public class Sig_verify {
    @SerializedName("state_code")
    private Integer stateCode;
    @SerializedName("authenticate")
    private Integer authenticate;
    @SerializedName("user")
    private String user;
    @SerializedName("tag")
    private String tag;

    public Integer getStateCode() {
        return stateCode;
    }

    public void setStateCode(Integer stateCode) {
        this.stateCode = stateCode;
    }

    public Integer getAuthenticate() {
        return authenticate;
    }

    public void setAuthenticate(Integer authenticate) {
        this.authenticate = authenticate;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}