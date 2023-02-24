package com.example.mock;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UserRepository {
    private final List<User> users = new ArrayList<>();

    public void addUser(User user) {
        this.users.add(user);
    }
    public Collection<User> getAllCollectionUser() {
        return Collections.unmodifiableCollection(users);
    }
}
