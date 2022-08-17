package com.carmesin.pos_sys.Auth.Repository;

import com.carmesin.pos_sys.Auth.Model.userModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface userRepository extends JpaRepository<userModel,Long> {

    @Query(value = "SELECT u.firstname FROM user u", nativeQuery = true)
    List<String> allFirstName();

    @Query(value ="SELECT * FROM user  WHERE email = ?1", nativeQuery = true)
    userModel findByEmail(String email);

}
