package com.example.GuessBeerCountry.Model;

import java.util.Date;

/**
 * Created by elyvitvit on 14/03/2015.
 */
public class Name {

    private int mId;
    private String mImgId;
    private String mName;
    private int mCountryCode;
    private int mTypeId;
    private int mDifficulty;
    private Date mDtCreated;
    private Date mDtUpdated;

    public Name(int mId, String mImgId, String mName, int mCountryCode, int mTypeId, int mDifficulty, Date mDtCreated, Date mDtUpdated) {
        this.mId = mId;
        this.mImgId = mImgId;
        this.mName = mName;
        this.mCountryCode = mCountryCode;
        this.mTypeId = mTypeId;
        this.mDifficulty = mDifficulty;
        this.mDtCreated = mDtCreated;
        this.mDtUpdated = mDtUpdated;
    }

    public int GetId() {
        return this.mId;
    }

    public void SetId(int mId) {
        this.mId = mId;
    }

    public String GetImgId() {
        return this.mImgId;
    }

    public void SetImgId(String mImgId) {
        this.mImgId = mImgId;
    }

    public String GetName() {
        return this.mName;
    }

    public void SetName(String mName) {
        this.mName = mName;
    }

    public int GetCountryCode() {
        return this.mCountryCode;
    }

    public void SetCountryCode(int mCountryCode) {
        this.mCountryCode = mCountryCode;
    }

    public int GetTypeId() {
        return this.mTypeId;
    }

    public void SetTypeId(int mTypeId) {
        this.mTypeId = mTypeId;
    }

    public int GetDifficutlty() {
        return this.mDifficulty;
    }

    public void SetDifficulty(int mDifficulty) {
        this.mDifficulty = mDifficulty;
    }

    public Date GetDtCreated() {
        return this.mDtCreated;
    }

    public void SetDtCreated(Date mDtCreated) {
        this.mDtCreated = mDtCreated;
    }

    public Date GetDtUpdated() {
        return this.mDtUpdated;
    }

    public void SetDtUpdated(Date mDtUpdated) {
        this.mDtUpdated = mDtUpdated;
    }
}
