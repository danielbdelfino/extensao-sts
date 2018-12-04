package br.edu.iftmextensaoSTS.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.iftmextensaoSTS.domain.Atividade;
import br.edu.iftmextensaoSTS.repositories.AtividadeRepository;

@Service
public class AtividadeService {
	
	@Autowired
	private AtividadeRepository repo;
	
	public Atividade buscar(Integer id) {
		Atividade atividade = repo.getOne(id);
		
		return atividade;
	}
	
	public Atividade salvar(Atividade atividade) {
		return repo.save(atividade);
	}
	
	public void excluir(Atividade atividade) {
		repo.delete(atividade);
	}
}
