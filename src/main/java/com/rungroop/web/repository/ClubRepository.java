package com.rungroop.web.repository;

import com.rungroop.web.models.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ClubRepository extends JpaRepository<Club, Long> {
    Optional<Club> findByTitle(String title);
    @Query("SELECT c from Club c WHERE c.title LIKE concat('%', :query, '%') ")
    List<Club> searchClubs(String query);
}
