package com.example.securitydemo.util;

import com.example.securitydemo.dto.PostDto;
import com.example.securitydemo.entity.Post;
import com.example.securitydemo.entity.User;
import com.example.securitydemo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostSecurityUtil {

    private PostService postService;

    boolean isOwnerofPost(Long postId){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        PostDto postDto = postService.getPostById(postId);
        return postDto.getAuthor().getId().equals(user.getId());
    }
}
