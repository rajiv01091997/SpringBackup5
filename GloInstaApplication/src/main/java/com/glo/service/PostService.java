package com.glo.service;

import com.glo.model.Post;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface PostService {

    public List<Post> getAllPosts();
    public Post getPostById(long id);
    public void createPost(Post post);
    public  void updatePost(long id, String content, LocalDate postDate);

    public void deletePost(long id);
    public List<Post> searchPostByText(String text);

}
