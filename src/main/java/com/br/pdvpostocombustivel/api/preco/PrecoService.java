package com.br.pdvpostocombustivel.api.preco;

import com.br.pdvpostocombustivel.api.preco.dto.PrecoRequest;
import com.br.pdvpostocombustivel.api.preco.dto.PrecoResponse;
import com.br.pdvpostocombustivel.domain.entity.Preco;
import com.br.pdvpostocombustivel.domain.repository.PrecoRepository;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Service
@Transactional
public class PrecoService {

    private final PrecoRepository repository;

    public PrecoService(PrecoRepository repository){
        this.repository = repository;
    }

    //CREATE
    public PrecoResponse create(PrecoRequest req){
        Preco novoPreco = toEntity(req);
        return toResponse(repository.save(novoPreco));
    }

    //READ by ID
    @Transactional(readOnly = true)
    public PrecoResponse getById(Long id){
        Preco p = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Preço não encontrado. id=" + id));
        return toResponse(p);
    }

    //READ by valor
    @Transactional(readOnly = true)
    public PrecoResponse getByValor(BigDecimal valor){
        Preco p = repository.findByValor(valor)
                .orElseThrow(() -> new IllegalArgumentException("Preço não encontrado. valor=" + valor));
        return toResponse(p);
    }

    //LIST
    @Transactional(readOnly = true)
    public Page<PrecoResponse> list(int page, int size, String sortBy, Sort.Direction direction){
        Pageable pageable = PageRequest.of(page, size, Sort.by(direction, sortBy));
        return repository.findAll(pageable).map(this::toResponse);
    }

    //UPDATE
    public PrecoResponse update(Long id, PrecoRequest req){
        Preco p = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Preço não encontrado. id=" +id));

        p.setValor(req.valor());
        p.setDataAlteracao(LocalDate.now());
        p.setHoraAlteracao(LocalTime.now());

        return toResponse(repository.save(p));
    }

    //PATCH
    public PrecoResponse patch(Long id, PrecoRequest req){
        Preco p = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Preço não encontrado. id=" +id));

        if(req.valor() != null) {
            p.setValor(req.valor());
            p.setDataAlteracao(LocalDate.now());
            p.setHoraAlteracao(LocalTime.now());
        }

        return toResponse(repository.save(p));
    }

    //DELETE
    public void delete(Long id){
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Preço não encontrado. id=" + id);
        }
        repository.deleteById(id);
    }

    // ---------- Helpers ----------

    private Preco toEntity(PrecoRequest req){
        return new Preco(
                req.valor(),
                LocalDate.now(),
                LocalTime.now()
        );
    }

    private PrecoResponse toResponse(Preco p){
        return new PrecoResponse(
                p.getId(),
                p.getValor(),
                p.getDataAlteracao(),
                p.getHoraAlteracao()
        );
    }
}
