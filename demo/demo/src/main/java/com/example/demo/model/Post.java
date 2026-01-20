package com.example.demo.model;
import com.example.demo.dto.PostDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Data @NoArgsConstructor
public class Post {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    
    @Column(columnDefinition = "TEXT")
    private String conteudo;
    
    private LocalDateTime dataCriacao = LocalDateTime.now();

    public Post(PostDTO dados) {
        this.titulo = dados.titulo();
        this.conteudo = dados.conteudo();
    }
}