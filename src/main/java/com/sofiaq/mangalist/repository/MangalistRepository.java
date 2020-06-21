package com.sofiaq.mangalist.repository;

import com.sofiaq.mangalist.domain.Manga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MangalistRepository extends JpaRepository<Manga, Integer>{
    
}
