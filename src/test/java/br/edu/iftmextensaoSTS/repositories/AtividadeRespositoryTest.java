package br.edu.iftmextensaoSTS.repositories;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import br.edu.iftmextensaoSTS.domain.Atividade;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AtividadeRespositoryTest {
	
	@Autowired
	private AtividadeRepository repo;
	
	@Test
	public void verificaQuantidadeAtividadesCadastradas() {
		Page<Atividade> atividades = this.repo.findAll(PageRequest.of(0, 10));
		assertThat(atividades.getTotalElements()).isGreaterThan(1L);
	}

	@Test
	public void findByNome() {
		List<Atividade> atividades = this.repo.findByNomeContaining("GDG");
		assertThat(atividades.size()).isEqualTo(1);
	}
	
	@Test
	public void find() {
		List<Atividade> atividades = this.repo.findByNomeContaining("calos");
		assertThat(atividades.size()).isEqualTo(0);
	}
}
