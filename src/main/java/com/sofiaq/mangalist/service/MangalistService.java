package com.sofiaq.mangalist.service;

import com.sofiaq.mangalist.domain.Manga;
import java.util.List;
import org.springframework.stereotype.Service;
import com.sofiaq.mangalist.repository.MangalistRepository;


@Service
public class MangalistService {
    
   
    public final MangalistRepository mangaRepository; 

   public MangalistService(MangalistRepository mangaRepository) {
        this.mangaRepository = mangaRepository;
    }
    
    
    
    public List<Manga> buscarDestacados(){
        List<Manga> destacados = mangaRepository.findAll();
        System.out.print(destacados);
        return  destacados;
    }
}
