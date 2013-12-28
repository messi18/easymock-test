package com.lance;

import java.util.List;

/**
 * Created by malance on 13-12-26.
 */
public interface SimpleDao {
    List<User> getUserList();

    boolean saveUser(User user);
}
