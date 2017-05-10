package br.org.indt.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.org.indt.Models.Entitys.Editoras;
import br.org.indt.Models.Repositorys.EditorasRepository;

@RestController
@RequestMapping("/editoras")
public class EditorasService {
	
	@Autowired
	private EditorasRepository repo;

	@RequestMapping(method = RequestMethod.GET)
	public List<Editoras> findItems() {
		return repo.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public Editoras addItem(@RequestBody Editoras editora) {
		return repo.saveAndFlush(editora);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Editoras updateItem(@RequestBody Editoras updatedEditora, @PathVariable long id) {
		updatedEditora.setId(id);
		return repo.saveAndFlush(updatedEditora);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteItem(@PathVariable long id) {
		repo.delete(id);
	}
}