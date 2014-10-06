package io.github.mecorp.developercapes.cape;

import com.google.gson.Gson;
import io.github.mecorp.developercapes.user.Group;
import io.github.mecorp.developercapes.user.User;

import java.util.HashMap;

/**
 * @author jadar
 */
public class CapeConfig {
    private Gson parser;
    public HashMap<String, Group> groups;
    public HashMap<String, User> users;

    public CapeConfig() {
        parser = new Gson();
        groups = new HashMap<String, Group>();
        users = new HashMap<String, User>();
    }


}
