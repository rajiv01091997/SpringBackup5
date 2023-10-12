package com.glo;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogOutputStream;
import com.glo.exceptions.IdNotFoundException;
import com.glo.model.Post;
import com.glo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Scanner;


@SpringBootApplication
public class GloInstaApplication implements CommandLineRunner {
	@Autowired
	private PostService service;

	public static void main(String[] args) {
		SpringApplication.run(GloInstaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		LocalDate d1 = LocalDate.of(1223,1,12);
		LocalDate d2 = LocalDate.of(1224,5,14);
        service.createPost(new Post(1,"Hello the it is","Rajiv",d1 ));
		service.createPost(new Post(2,"Hello the name is","Niraj",d2 ));

        Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Get All posts");
			System.out.println("2.Get posts by Id");
			System.out.println("3.Modify Post");
			System.out.println("4.Delete Post");
			System.out.println("5.Search post by any given word/string");
			System.out.println("6.Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					service.getAllPosts();
					break;
				case 2:
					System.out.println("Enter post Id to be searched for:");
					long id = sc.nextLong();
					try
					{
						service.getPostById(id);
					}
					catch(IdNotFoundException e)
					{
					System.out.println(e.getMsg());
					}
					break;
				case 3:
					System.out.println("Enter post id");
					long pId=sc.nextLong();
					sc.nextLine();
					try
					{
						service.getPostById(pId);
					}
					catch(IdNotFoundException e)
					{
						System.out.println(e.getMsg());
						break;
					}
					System.out.println("Enter content");
					String content=sc.nextLine();
					System.out.println("Enter post year in yyyy format");
					int year=sc.nextInt();
					System.out.println("Enter post month in mm format");
					int month=sc.nextInt();
					System.out.println("Enter post date in dd format");
					int date=sc.nextInt();
					LocalDate tempDate= LocalDate.of(year, month, date);
					service.updatePost(pId,content,tempDate);
					break;
				case 4:
					System.out.println("Enter post id to be deleted");
					long postId=sc.nextLong();
					sc.nextLine();
					try
					{
						service.getPostById(postId);
					}
					catch(IdNotFoundException e)
					{
						System.out.println(e.getMsg());
					}
					service.deletePost(postId);
					break;
				case 5:
					System.out.println("Enter word for searching");
					String text=sc.next();
					service.searchPostByText(text);
				    break;
				case 6:
					System.exit(0);
					break;
				default:
					System.out.println("Wrong choice");



			}
		}


	}
}
