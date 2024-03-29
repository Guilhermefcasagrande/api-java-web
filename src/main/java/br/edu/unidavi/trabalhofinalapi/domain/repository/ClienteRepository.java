package br.edu.unidavi.trabalhofinalapi.domain.repository;

import br.edu.unidavi.trabalhofinalapi.domain.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClienteRepository extends JpaSpecificationExecutor<Cliente>, JpaRepository<Cliente, Long> {
    
    Cliente findByCpf(String cnpj);
    
}