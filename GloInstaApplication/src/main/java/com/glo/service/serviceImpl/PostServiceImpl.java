package com.glo.service.serviceImpl;

import com.glo.exceptions.IdNotFoundException;
import com.glo.model.Post;
import com.glo.repository.PostRepository;
import com.glo.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class PostServiceImpl implements PostService
{
    Logger logger= LoggerFactory.getLogger("PostServiceImpl");
    @Autowired
    PostRepository repository;
    @Override
    public List<Post> getAllPosts() {
        return repository.getPostList();
    }

    @Override
    public Post getPostById(long id) {
        Post post=repository.getPostList().stream().filter(p->p.getPostId()==id).findFirst().
                orElseThrow(()->new IdNotFoundException("Id is not present"));

        return post;
    }

    @Override
    public void createPost(Post post) {
        repository.getPostList().add(post);
        logger.info("Post added successfully");
    }

    @Override
    public void updatePost(long id, String content, LocalDate postDate) {
        Post post=repository.getPostList().stream().filter(p->p.getPostId()==id).findFirst().
                orElseThrow(()->new IdNotFoundException("Id is not present"));
      post.setPostContent(content);
      post.setPostDate(postDate);


    }

    @Override
    public void deletePost(long id) {
        Post post=repository.getPostList().stream().filter(p->p.getPostId()==id).findFirst().
                orElseThrow(()->new IdNotFoundException("Id is not present"));
          repository.getPostList().remove(post);

    }

    @Override
    public List<Post> searchPostByText(String text) {
        List<Post> postList=new ArrayList<>();
        for(Post post: repository.getPostList())
        {
            if(searcLogic(text,post.getPostContent()))
                postList.add(post);
        }
        return postList;
    }

    public Boolean searcLogic(String text,String content)
    {
        content=content.trim();
        content=content.replace("\\s+"," ");

        for(int i=0;i<content.length();i++)
        {
            String temp="";
            while(content.charAt(i)!=' ' && i<content.length())
            {
                temp=temp+content.charAt(i);
                if(i<content.length()-1)
                    i++;
                else
                    break;
            }

            if(text.equalsIgnoreCase(temp))
                return true;
        }

        return false;
    }
}
