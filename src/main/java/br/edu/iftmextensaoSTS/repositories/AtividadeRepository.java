package br.edu.iftmextensaoSTS.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.edu.iftmextensaoSTS.domain.Atividade;

@Repository
public interface AtividadeRepository extends JpaRepository<Atividade, Integer> {
	public List<Atividade> findByNomeContaining(@Param("nome") String nome);
}
