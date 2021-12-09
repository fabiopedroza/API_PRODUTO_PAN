package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
