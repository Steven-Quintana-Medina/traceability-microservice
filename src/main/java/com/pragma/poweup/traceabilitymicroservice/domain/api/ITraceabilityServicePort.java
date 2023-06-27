package com.pragma.poweup.traceabilitymicroservice.domain.api;

import com.pragma.poweup.traceabilitymicroservice.domain.model.Traceability;

import java.util.List;

public interface ITraceabilityServicePort {
    void saveTraceability(Traceability traceability);

    List<Traceability> getTraceabilityToOrder(Long idClient, Long idOrder);
}
