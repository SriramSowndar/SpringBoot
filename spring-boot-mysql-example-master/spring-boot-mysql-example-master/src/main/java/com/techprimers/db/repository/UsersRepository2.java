package com.techprimers.db.repository;
import com.techprimers.db.model.Users2;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository2 extends JpaRepository<Users2, Integer> {
    Optional<Users2> findByUserName(String userName);
}
