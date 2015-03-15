package com.example.GuessBeerCountry.Model;

import java.util.Date;

/**
 * Created by elyvitvit on 14/03/2015.
 */
public class Type {

    private int mId;
    private String mName;
    private Date mDtCreated;
    private Date mDtUpdated;

    public Type(int mId, String mName, Date mDtCreated, Date mDtUpdated) {
        this.mId = mId;
        this.mName = mName;
        this.mDtCreated = mDtCreated;
        this.mDtUpdated = mDtUpdated;
    }

    public int GetId() {
        return this.mId;
    }

    public void SetId(int mId) {
        this.mId = mId;
    }

    public String GetName() {
        return this.mName;
    }

    public void SetName(String mName) {
        this.mName = mName;
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
