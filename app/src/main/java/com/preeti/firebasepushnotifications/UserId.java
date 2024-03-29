package com.preeti.firebasepushnotifications;

import androidx.annotation.NonNull;

/**
 * Created by AkshayeJH on 04/01/18.
 */

public class UserId {

    public String userId;

    public <T extends UserId> T withId(@NonNull final String id) {
        this.userId = id;
        return (T) this;
    }

}
