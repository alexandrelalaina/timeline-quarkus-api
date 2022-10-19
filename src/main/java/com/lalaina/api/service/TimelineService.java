package com.lalaina.api.service;

import com.lalaina.api.model.Timeline;
import com.lalaina.api.repository.TimelineRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class TimelineService {

    @Inject
    TimelineRepository timelineRepository;

    public List<Timeline> listAll() {
        return Timeline.listAll();
    }

    public Timeline persist(Timeline timeline) throws Exception {
//        if (timeline.getTimeline().dataInicial == null){
//            timeline.getTimeline().dataInicial = LocalDateTime.now();
//        }

        timeline.persist();

        return timeline;
    }

    public Timeline findById(Long id) {
        return Timeline.findById(id);
    }

    public void deleteById(Long id) {
        Timeline.deleteById(id);
    }

    public Timeline update(Long id, Timeline timeline) {
        Timeline timelineBD = Timeline.findById(id);
        timelineBD.descricao = timeline.descricao;
        timelineBD.compromisso = timeline.compromisso;
        return timelineBD;
    }

    public List<Timeline> findByDescricao(String descricao) {
        return timelineRepository.findByDescricao(descricao);
    }
}
