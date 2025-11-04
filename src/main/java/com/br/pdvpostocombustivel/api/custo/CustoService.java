package com.br.pdvpostocombustivel.api.custo;


import com.br.pdvpostocombustivel.api.custo.dto.CustoRequest;
import com.br.pdvpostocombustivel.api.custo.dto.CustoResponse;
import com.br.pdvpostocombustivel.domain.entity.Custo;
import com.br.pdvpostocombustivel.domain.repository.CustoRepository;
import org.springframework.data.domain.*;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@Transactional
public class CustoService {

    // implementa a interface
    private final CustoRepository repository;


    public CustoService(CustoRepository repository){
        this.repository = repository;
    }

    //CREATE
    public CustoResponse create(CustoRequest req){
        Custo novoCusto = toEntity(req);
        return toResponse(repository.save(novoCusto));
    }

    //READ by ID
    @Transactional(readOnly = true)
    public CustoResponse getById(Long id){
        Custo c = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Custo não encontrado. id=" + id));
        return toResponse(c);
    }

    //Read By DataProcessamento
    @Transactional(readOnly = true)
    public CustoResponse getByDataProcessamento(LocalDate dataProcessamento){
        Custo c = repository.findByDataProcessamento(dataProcessamento)
                .orElseThrow(() -> new IllegalArgumentException("Custo não encontrado. DataProcessamento=" + dataProcessamento));
        return toResponse(c);
    }

    // LIST paginando
    @Transactional(readOnly = true)
    public Page<CustoResponse> list(int page, int size, String sorgBy,Sort.Direction direction){
        Pageable pageable = PageRequest.of(page, size, Sort.by(direction, sorgBy));
        return repository.findAll(pageable).map((this::toResponse));
    }

    //UPDATE
    public CustoResponse update(Long id, CustoRequest req){
        Custo c = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Custo não encontrado. id=" + id));

        c.setImposto(req.imposto());
        c.setCustoVariavel(req.custoVariavel());
        c.setCustoFixo(req.custoFixo());
        c.setMargemLucro(req.margemLucro());
        c.setDataProcessamento(req.dataProcessamento());

        return toResponse(repository.save(c));
    }

    //PATCH
    public CustoResponse patch(Long id, CustoRequest req){
        Custo c = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Custo não encontrado. id=" +id));
        if (req.imposto() != null) c.setImposto(req.imposto());
        if (req.custoVariavel() != null) c.setCustoVariavel(req.custoVariavel());
        if (req.custoFixo() != null) c.setCustoFixo(req.custoFixo());
        if (req.margemLucro() != null) c.setMargemLucro(req.margemLucro());
        if (req.dataProcessamento() != null) c.setDataProcessamento(req.dataProcessamento());

        return toResponse(repository.save(c));
    }

    //DELETE
    public void delete(Long id){
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Custo não encontrado. id=" + id);
        }
        repository.deleteById(id);
    }

    // ---------- Helpers ----------
    private Custo toEntity(CustoRequest req){
        return new Custo(
                req.imposto(),
                req.custoVariavel(),
                req.custoFixo(),
                req.margemLucro(),
                req.dataProcessamento()
        );
    }

    private CustoResponse toResponse(Custo c){
        return new CustoResponse(
                c.getId(),
                c.getImposto(),
                c.getCustoVariavel(),
                c.getCustoFixo(),
                c.getMargemLucro(),
                c.getDataProcessamento()
        );
    }
}
