package Bookstore.BookStore.services;

import Bookstore.BookStore.entity.User;
import Bookstore.BookStore.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;

    public void save(User user) {
        userRepository.save(user);
    }
}
