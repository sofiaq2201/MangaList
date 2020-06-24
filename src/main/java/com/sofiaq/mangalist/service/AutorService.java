package com.sofiaq.mangalist.service;

import com.sofiaq.mangalist.domain.Autor;
import com.sofiaq.mangalist.repository.AutorRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AutorService {
    
    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public List<Autor> buscarTodos(){
        return autorRepository.buscarTodosAutores();
    }
    
    
    
    
    
}
