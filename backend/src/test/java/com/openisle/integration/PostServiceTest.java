package com.openisle.integration;

import com.openisle.service.PostService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        properties = "app.register.mode=DIRECT")
public class PostServiceTest {

    @Autowired
    PostService postService;

    @Test
    void countPostsByTag()  {
        var r = postService.countPostsByTagIds(List.of(1L, 2L, 3L));
        System.out.println("r = " + r);
    }
}
