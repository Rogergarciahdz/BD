package ch21.tagtalent.TagtalentApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ch21.tagtalent.TagtalentApplication.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}//interface CategoriaRepository
