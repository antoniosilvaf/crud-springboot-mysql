package com.springcrud.springcrud.config;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.springcrud.springcrud.model.Comment;
import com.springcrud.springcrud.model.Post;
import com.springcrud.springcrud.model.User;
import com.springcrud.springcrud.repository.PostRepository;
import com.springcrud.springcrud.repository.UserRepository;

@Component
@Profile("dev")
public class TestConfig implements CommandLineRunner {
    
    @Autowired
    private UserRepository userRepository;

    @Autowired 
    PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        userRepository.deleteAll();

        User user1 = new User(null, "Antonio Silva", "82999999999", LocalDate.parse("19/09/2003", fmt1), "antonio@gmail.com", "123654");
        User user2 = new User(null, "Sergio Filho", "82999999999", LocalDate.parse("15/05/1999", fmt1), "sergio@gmail.com", "456321");
        
        Post post1 = new Post(null, "Good Morning", "What a beautiful day", LocalDateTime.parse("10/10/2022 14:15:12", fmt2), user1);  
        Post post2 = new Post(null, "Happy Birthday!", "Hapy Birthday Antonio!", LocalDateTime.parse("19/09/2022 00:00:30", fmt2), user2); 

        Comment comm1 = new Comment(null, post1, "I agree :)", LocalDateTime.parse("10/10/2022 14:31:01", fmt2), user2);
        Comment comm2 = new Comment(null, post2, "Thank you", LocalDateTime.parse("19/09/2022 08:13:46", fmt2), user1);

        post1.getComments().add(comm1);
        post2.getComments().add(comm2);

        userRepository.saveAll(Arrays.asList(user1, user2));
        postRepository.saveAll(Arrays.asList(post1, post2));
    }
}
