package com.example.GuessBeerCountry.Library;

/**
 * Created by elyvitvit on 09/10/2014.
 */
public enum PreferenceName {
    Language("pref_language"),
    Theme("pref_theme"),
    Range("pref_range"),
    Update("pref_update"),
    Sound("pref_sound"),
    Clear("pref_clear");

    String key;
    private PreferenceName(String key)
    {
        this.key = key;
    }

    public String toString()
    {
        return key;
    }
}
