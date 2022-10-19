package com.lalaina.api.repository;

import com.lalaina.api.model.Timeline;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class TimelineRepository implements PanacheRepository<Timeline> {

    public List<Timeline> findByDescricao(String descricao){
        return find("descricao", descricao).stream().collect(Collectors.toList());
    }

}
