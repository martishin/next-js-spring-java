package com.ttymonkey.nextjsspringjava.repository;

import com.ttymonkey.nextjsspringjava.model.ERole;
import com.ttymonkey.nextjsspringjava.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
