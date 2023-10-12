package com.glo.model;


import java.time.LocalDate;

public class Post {

    private long postId;
    private String postContent;
    private String postAuthor;
    private LocalDate postDate;


    public Post() {
        super();
    }

    public Post(long postId, String postContent, String postAuthor, LocalDate postDate) {
        this.postId = postId;
        this.postContent = postContent;
        this.postAuthor = postAuthor;
        this.postDate = postDate;
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public String getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(String postAuthor) {
        this.postAuthor = postAuthor;
    }

    public LocalDate getPostDate() {
        return postDate;
    }

    public void setPostDate(LocalDate postDate) {
        this.postDate = postDate;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", postContent='" + postContent + '\'' +
                ", postAuthor='" + postAuthor + '\'' +
                ", postDate=" + postDate +
                '}';
    }
}
