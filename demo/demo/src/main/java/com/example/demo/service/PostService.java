package com.example.demo.service; // <--- MUITO IMPORTANTE

import com.example.demo.dto.PostDTO;
import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post criar(PostDTO dados) {
        Post post = new Post(dados);
        return repository.save(post);
    }

    public List<Post> listar() {
        return repository.findAll();
    }
    
    public Post buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Post não encontrado"));
    }
}