package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.Produto;
import repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired 
	private ProdutoRepository repository;
	
	public Produto findById(Integer id) {
		Optional<Produto> obj = repository.findById(id);
		return obj.orElse(null);
	}

	public List<Produto> findAll() {
		return repository.findAll();
	}
	
	public Produto update(Integer id, Produto obj) {
		Produto newProd = findById(id);
		newProd.setNomeProd(obj.getNomeProd());
		newProd.setPreco(obj.getPreco());
		return repository.save(newProd);
	}
	
	public Produto create(Produto prod) {
		prod.setId(null);                 
		return repository.save(prod);
	}

	public void delete(Integer id) {
		findById(id);
		repository.deleteById(id);
	}

}
