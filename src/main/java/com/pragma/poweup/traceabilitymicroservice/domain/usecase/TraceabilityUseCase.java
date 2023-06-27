package com.pragma.poweup.traceabilitymicroservice.domain.usecase;

import com.pragma.poweup.traceabilitymicroservice.domain.api.ITraceabilityServicePort;
import com.pragma.poweup.traceabilitymicroservice.domain.model.Traceability;
import com.pragma.poweup.traceabilitymicroservice.domain.spi.ITraceabilityPersistencePort;

import java.time.LocalDateTime;
import java.util.List;

public class TraceabilityUseCase implements ITraceabilityServicePort {
    private final ITraceabilityPersistencePort traceabilityPersistencePort;

    public TraceabilityUseCase(ITraceabilityPersistencePort traceabilityPersistencePort) {
        this.traceabilityPersistencePort = traceabilityPersistencePort;
    }

    @Override
    public void saveTraceability(Traceability traceability) {
        traceability.setDate(LocalDateTime.now());
        traceabilityPersistencePort.saveTraceability(traceability);
    }

    @Override
    public List<Traceability> getTraceabilityToOrder(Long idClient, Long idOrder) {
        return traceabilityPersistencePort.getTraceabilityToOrder(idClient, idOrder);
    }
}
