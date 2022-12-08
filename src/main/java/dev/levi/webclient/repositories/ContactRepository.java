package dev.levi.webclient.repositories;

import dev.levi.webclient.models.Contact;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Integer> {
    String sql = "UPDATE contact SET first_name =:first_name , phone = :phone,mobile = :mobile, email = :email, last_name = :last_name,website=:website WHERE id=:id";

    @Modifying
    @Query("UPDATE contact SET first_name =:first_name , phone = :phone,mobile = :mobile,facebook =:facebook, linked_in =:linked_in = :email, last_name = :last_name, website=:website WHERE id=:id")
    int update(@Param("first_name") String firstName,
               @Param("phone") String phone,
               @Param("mobile") String mobile,
               @Param("email") String email,
               @Param("last_name") String lastName,
               @Param("website") String website,
               @Param("linked_in") String linkedIn,
               @Param("facebook") String facebook,
    @Param("id")int id);
}
