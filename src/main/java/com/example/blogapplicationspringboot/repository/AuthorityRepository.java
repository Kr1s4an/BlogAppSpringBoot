package com.example.blogapplicationspringboot.repository;

import com.example.blogapplicationspringboot.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
