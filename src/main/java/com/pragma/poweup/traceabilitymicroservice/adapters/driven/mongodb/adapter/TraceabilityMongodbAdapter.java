package com.pragma.poweup.traceabilitymicroservice.adapters.driven.mongodb.adapter;

import com.pragma.poweup.traceabilitymicroservice.adapters.driven.mongodb.mappers.ITraceabilityCollectionMapper;
import com.pragma.poweup.traceabilitymicroservice.adapters.driven.mongodb.repositories.ITraceabilityRepository;
import com.pragma.poweup.traceabilitymicroservice.domain.model.Traceability;
import com.pragma.poweup.traceabilitymicroservice.domain.spi.ITraceabilityPersistencePort;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class TraceabilityMongodbAdapter implements ITraceabilityPersistencePort {
    private final ITraceabilityRepository traceabilityRepository;
    private final ITraceabilityCollectionMapper traceabilityCollectionsMapper;

    @Override
    public void saveTraceability(Traceability traceability) {
        traceabilityRepository.save(traceabilityCollectionsMapper.toCollection(traceability));
    }

    @Override
    public List<Traceability> getTraceabilityToOrder(Long idClient, Long idOrder) {
        return traceabilityCollectionsMapper.toModel(traceabilityRepository.findByIdClientAndIdOrder(idClient, idOrder));
    }
}
