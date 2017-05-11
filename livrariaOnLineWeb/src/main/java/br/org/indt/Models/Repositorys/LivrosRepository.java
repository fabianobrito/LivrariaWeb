package br.org.indt.Models.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import br.org.indt.Models.Entitys.Livros;

public interface LivrosRepository extends JpaRepository<Livros, Long> {

}
