package factory;

import POJO.User;

import java.util.List;

public interface Factory {
    User selectUserById(int id);
    List selectAllUsers();
}
