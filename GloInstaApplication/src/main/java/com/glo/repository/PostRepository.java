package com.glo.repository;

import com.glo.model.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class PostRepository {


    private List<Post> postList;

    public PostRepository() {
        postList=new ArrayList<>();
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }
}
