package com.krivoshein.springbootdemo.Repository;

import com.krivoshein.springbootdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
