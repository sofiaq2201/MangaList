package com.sofiaq.mangalist.service;

import com.sofiaq.mangalist.domain.Manga;
import java.util.List;
import org.springframework.stereotype.Service;
import com.sofiaq.mangalist.repository.MangalistRepository;
import java.util.Optional;


@Service
public class MangalistService {
    
   
    public final MangalistRepository mangaRepository; 

   public MangalistService(MangalistRepository mangaRepository) {
        this.mangaRepository = mangaRepository;
    }
    
    public List<Manga> buscarDestacados(){
        List<Manga> destacados = mangaRepository.buscarTodos();
        return  destacados;
    }
    
    public List<Manga> buscarPorAutor(int autorId){
        return mangaRepository.buscarPorAutor(autorId);
    }
    
    public List<Manga> buscador (String consulta){
        return mangaRepository.findByNombreContaining(consulta);
    }

    public Manga guardar(Manga manga){
        return mangaRepository.save(manga);
    }
    
    public Manga mangaInfo(int mangaId){
        return mangaRepository.findById(mangaId);
    }
    
    public void mangaDelete(Manga manga){
        mangaRepository.delete(manga);
    }
   
}
