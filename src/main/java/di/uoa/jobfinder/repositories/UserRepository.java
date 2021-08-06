package di.uoa.jobfinder.repositories;

import di.uoa.jobfinder.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
