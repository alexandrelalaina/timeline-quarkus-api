package com.lalaina.api.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Timeline extends PanacheEntity {

    @Column(nullable = false)
    public String descricao;

    @Column(name = "data_inicial", nullable = false)
    public LocalDateTime dataInicial;

    @Column(name = "data_final")
    public LocalDateTime dataFinal;

    @JoinColumn(name = "fk_compromisso", referencedColumnName = "id", insertable = true, updatable = true)
    @ManyToOne
    public Compromisso compromisso;

}
