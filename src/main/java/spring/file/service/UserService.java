package spring.file.service;

import org.springframework.stereotype.Service;
import spring.file.exception.UserNotFoundException;
import spring.file.model.User;

@Service
public class UserService {

    public User fetchUserDetails(int id) throws UserNotFoundException {
        if (id == 1) {
            return new User(1, "blackList", "Raymond", "Redington");
        } else if (id == 2) {
            return new User(2, "arrow", "Oliver", "Queen");
        }
        throw new UserNotFoundException("User not found");

    }
}
