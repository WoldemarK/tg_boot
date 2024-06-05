package org.example.tg_boot.repository;

import jakarta.transaction.Transactional;
import org.example.tg_boot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Transactional
    @Modifying
    @Query("update tg_data t set t.msg_numb = t.msg_numb + 1 where t.id is not null and t.id = :id")
    void updateMsgNumberByUserId(@Param("id") long id);
}
