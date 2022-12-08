package dev.levi.webclient.repositories;

import dev.levi.webclient.models.User;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
    @Query("SELECT * FROM user where name = :name and password = :password")
    List<User> validateUser(@Param("name") String name, @Param("password") String password);

    @Modifying
    @Query("UPDATE user SET name = :name ,admin=:admin WHERE id=:id")
    int update(@Param("name")String name, @Param("admin")Boolean admin,@Param("id")int id);
}
