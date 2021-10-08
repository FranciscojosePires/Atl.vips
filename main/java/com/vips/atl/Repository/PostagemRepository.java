package com.vips.atl.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vips.atl.Model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
      public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo);
}
