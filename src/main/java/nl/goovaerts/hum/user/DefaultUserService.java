package nl.goovaerts.hum.user;

import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class DefaultUserService implements UserService {

    @Override
    public Set<User> getAll() {
        return null;
    }
}
