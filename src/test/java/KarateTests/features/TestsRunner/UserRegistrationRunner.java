package KarateTests.features.TestsRunner;

import com.intuit.karate.junit5.Karate;

public class UserRegistrationRunner {

    @Karate.Test
    Karate testUserRegistrationAPI() {
        return Karate.run("features/user_registration").relativeTo(getClass());
    }
}
