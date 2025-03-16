package runners;

import com.intuit.karate.junit5.Karate;

public class LoginRunner {

    @Karate.Test
    Karate testLoginAPI() {
        return Karate.run("features/login").relativeTo(getClass());
    }
}
