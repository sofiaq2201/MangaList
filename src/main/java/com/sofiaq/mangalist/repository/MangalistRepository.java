package com.sofiaq.mangalist.repository;

import com.sofiaq.mangalist.domain.Manga;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MangalistRepository extends JpaRepository<Manga, Integer>{
    
    @Query("select m from Manga m order by m.nombre")
    List<Manga> buscarTodos();
    
    @Query("from Manga m where m.autor.id = ?1 order by m.nombre")
    List<Manga> buscarPorAutor(int autorId);
    
    List<Manga> findByNombreContaining(String nombre) ;
}
