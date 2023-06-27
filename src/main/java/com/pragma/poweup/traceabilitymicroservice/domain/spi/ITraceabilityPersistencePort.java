package com.pragma.poweup.traceabilitymicroservice.domain.spi;

import com.pragma.poweup.traceabilitymicroservice.domain.model.Traceability;

import java.util.List;

public interface ITraceabilityPersistencePort {
    void saveTraceability(Traceability traceability);
    List<Traceability> getTraceabilityToOrder(Long idClient, Long idOrder);
}
