package app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserManager {

    private List<String> userStorage;

    public UserManager() {
        userStorage = new ArrayList<>();
    }

    public boolean addUser(String userEmail) {
        return userStorage.add(userEmail);
    }

    public String getUser(String userEmail) {
        for (String s : userStorage) {
            if (s.equals(userEmail)) {
                return s;
            }
        }
        return null;
    }

    public boolean deleteUser(final String userEmail) {
        return userStorage.removeIf(e -> e.equals(userEmail));
    }

    public List<String> getAllUsers() {
        return userStorage;
    }

}
