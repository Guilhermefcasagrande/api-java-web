package br.edu.unidavi.trabalhofinalapi.domain.repository;

import br.edu.unidavi.trabalhofinalapi.domain.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EnderecoRepository extends JpaSpecificationExecutor<Endereco>, JpaRepository<Endereco, Long> {
}
