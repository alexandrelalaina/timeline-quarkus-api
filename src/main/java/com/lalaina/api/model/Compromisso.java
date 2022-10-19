package com.lalaina.api.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "compromisso")
public class Compromisso extends PanacheEntity {

    public Long id;

    @Column(nullable = false)
    public String descricao;

    @Column(nullable = false)
    public String periodo;

    @Column(nullable = false)
    public String duracao;

}
