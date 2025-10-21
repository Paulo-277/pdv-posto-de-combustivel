package com.br.pdvpostocombustivel.api.estoque;


import com.br.pdvpostocombustivel.api.estoque.dto.EstoqueRequest;
import com.br.pdvpostocombustivel.api.estoque.dto.EstoqueResponse;
import com.br.pdvpostocombustivel.domain.entity.Estoque;
import com.br.pdvpostocombustivel.domain.repository.EstoqueRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EstoqueService {

    private final EstoqueRepository repository;


    public EstoqueService(EstoqueRepository repository){
        this.repository = repository;
    }

    // CREATE
    public EstoqueResponse create(EstoqueRequest req){
        Estoque novoEstoque = toEntity(req);
        return toResponse(repository.save(novoEstoque));
    }

    //READ by ID
    @Transactional(readOnly = true)
    public EstoqueResponse getById(Long id){
        Estoque e = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Estoque não encontrado. id=" + id));
        return toResponse(e);
    }

    //READ by LocalTanque
    @Transactional(readOnly = true)
    public EstoqueResponse getByLocalTanque(String localTanque){
        Estoque e = repository.findByLocalTanque(localTanque)
                .orElseThrow(() -> new IllegalArgumentException("Estoque não encontrado. localTanque=" + localTanque));
        return toResponse(e);
    }

    //LIST paginado
    @Transactional(readOnly = true)
    public Page<EstoqueResponse> list(int page, int size, String sortBy, Sort.Direction direction){
        Pageable pageable = PageRequest.of(page, size, Sort.by(direction, sortBy));
        return repository.findAll(pageable).map(this::toResponse);
    }

    //UPDATE
    public EstoqueResponse update(Long id, EstoqueRequest req){
        Estoque e = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Estoque não encontrado. id=" + id));

        if (req.localTanque() != null && !req.localTanque().equals(e.getLocalTanque())){
            validarLocalTanque(req.localTanque(), id);
        }
        e.setQuantidade(req.quantidade());
        e.setLocalTanque(req.localTanque());
        e.setLocalEndereco(req.localEndereco());
        e.setLoteFabricacao(req.loteFabricacao());
        e.setDataValidade(req.dataValidade());

        return toResponse(repository.save(e));
    }

    //PATCH
    public EstoqueResponse patch(Long id, EstoqueRequest req){
        Estoque e = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Estoque não encontrado. id=" + id));

        if (req.quantidade() != null) e.setQuantidade(req.quantidade());
        if (req.localTanque() != null){
            validarLocalTanque(req.localTanque(), id);
        }
        if (req.localEndereco() != null) e.setLocalEndereco(req.localEndereco());
        if (req.loteFabricacao() != null) e.setLoteFabricacao(req.loteFabricacao());
        if (req.dataValidade() != null) e.setDataValidade(req.dataValidade());

        return toResponse(repository.save(e));
    }

    //DELETE
    public void delete(Long id){
        if (!repository.existsById(id)){
            throw new IllegalArgumentException("Estoque não encontrado. id=" + id);
        }
        repository.deleteById(id);
    }

    //---------- Helpers ----------
    private void validarLocalTanque(String localTanque, Long idAtual){
        repository.findByLocalTanque(localTanque).ifPresent(existente -> {
            if (idAtual == null || !existente.getId().equals(idAtual)){
                throw new DataIntegrityViolationException("Tanque Local já em uso: " + localTanque);
            }
        });
    }

    private Estoque toEntity(EstoqueRequest req){
        return new Estoque(
                req.quantidade(),
                req.localTanque(),
                req.localEndereco(),
                req.loteFabricacao(),
                req.dataValidade()
        );
    }

    private EstoqueResponse toResponse(Estoque e){
        return new EstoqueResponse(
                e.getQuantidade(),
                e.getLocalTanque(),
                e.getLocalEndereco(),
                e.getLoteFabricacao(),
                e.getDataValidade()
        );
    }
}
