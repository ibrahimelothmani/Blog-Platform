package com.ibrahim.services;

import com.ibrahim.domain.CreatePostRequest;
import com.ibrahim.domain.UpdatePostRequest;
import com.ibrahim.domain.entities.Post;
import com.ibrahim.domain.entities.User;

import java.util.List;
import java.util.UUID;

public interface PostService {
    Post getPost(UUID id);
    List<Post> getAllPosts(UUID categoryId, UUID tagId);
    List<Post> getDraftPosts(User user);
    Post createPost(User user, CreatePostRequest createPostRequest);
    Post updatePost(UUID id, UpdatePostRequest updatePostRequest);
    void deletePost(UUID id);
}
