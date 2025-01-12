package com.example.tagletagle.src.board.repository;

import javax.sql.DataSource;

import com.example.tagletagle.src.board.entity.PostEntity;
import com.example.tagletagle.src.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BoardRepository extends JpaRepository<PostEntity, Long> {


}
