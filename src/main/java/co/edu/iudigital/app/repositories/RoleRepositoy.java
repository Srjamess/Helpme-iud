package co.edu.iudigital.app.repositories;

import co.edu.iudigital.app.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepositoy extends JpaRepository<Role, Long> {
}
