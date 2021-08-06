package di.uoa.jobfinder.services;

import di.uoa.jobfinder.repositories.UserRepository;
import di.uoa.jobfinder.security.CustomSecurityUser;
import di.uoa.jobfinder.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository UserRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = UserRepo.findByUsername(username);
        if (user == null)
            throw new UsernameNotFoundException("Invalid Username and password");
        return new CustomSecurityUser(user);
    }
}
