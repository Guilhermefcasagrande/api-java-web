package br.edu.unidavi.trabalhofinalapi.service;

import br.edu.unidavi.trabalhofinalapi.domain.model.Pedido;
import br.edu.unidavi.trabalhofinalapi.domain.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    public List<Pedido> findAll() {
        return repository.findAll();
    }

    public Page<Pedido> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Optional<Pedido> findOne(Long id) {
        return Optional.ofNullable(repository.findOne(id));
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Pedido save(Pedido pedido) {
        return repository.save(pedido);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void delete(Pedido pedido) {
        repository.delete(pedido);
    }

//    public Optional<Cliente> findByCnpj(String cnpj) {
//        return Optional.ofNullable(repository.findByCnpj(cnpj));
//    }

}
