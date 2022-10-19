package com.lalaina.api.service;

import com.lalaina.api.model.Compromisso;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class CompromissoService {

    public List<Compromisso> listAll(){
        return Compromisso.listAll();
    }

    public Compromisso persist(Compromisso compromisso) {
        compromisso.persist();
        return compromisso;
    }

    public Compromisso update(Long id, Compromisso compromisso) {
        Compromisso compromissoBD = Compromisso.findById(id);
        compromissoBD.setDescricao(compromisso.descricao);
        compromissoBD.setPeriodo(compromisso.periodo);
        compromissoBD.setDuracao(compromisso.duracao);
        return compromissoBD;
    }

    public void deleteById(Long id){
        Compromisso.deleteById(id);
    }

}
