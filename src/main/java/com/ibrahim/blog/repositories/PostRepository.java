package com.ibrahim.blog.repositories;

import com.ibrahim.blog.domain.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface PostRepository extends JpaRepository<Post, UUID> {

}