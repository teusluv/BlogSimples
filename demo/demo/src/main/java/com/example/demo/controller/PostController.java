package com.example.demo.controller;

import com.example.demo.dto.PostDTO;
import com.example.demo.model.Post;
import com.example.demo.service.PostService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/posts")
@CrossOrigin(origins = "*") 
public class PostController {

    @Autowired
    private PostService service;

    @PostMapping
    public ResponseEntity<Post> criar(@RequestBody @Valid PostDTO dados) {
        Post novoPost = service.criar(dados);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoPost);
    }

    @GetMapping
    public ResponseEntity<List<Post>> listar() {
        return ResponseEntity.ok(service.listar());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Post> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }
}