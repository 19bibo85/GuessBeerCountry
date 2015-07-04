package com.GuessBeerCountry.Network;

/**
 * Created by elyvitvit on 07/03/2015.
 */
public enum ServerError {
    NO_ERROR(),
    GENERAL(),
    CONNECTION(),
    PROTOCOL(),
    STREAM(),
    OBJECT_NOT_FOUND(),
    NEW_BUILD(),
    OLD_BUILD();
}
