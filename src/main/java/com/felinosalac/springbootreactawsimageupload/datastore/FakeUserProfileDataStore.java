package com.felinosalac.springbootreactawsimageupload.datastore;

import com.felinosalac.springbootreactawsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES =  new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "callieysabelle", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "marcusfelino", null));
    }

    public static List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
