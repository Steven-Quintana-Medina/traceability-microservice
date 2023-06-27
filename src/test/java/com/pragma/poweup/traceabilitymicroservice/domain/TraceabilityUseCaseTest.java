package com.pragma.poweup.traceabilitymicroservice.domain;

import com.pragma.poweup.traceabilitymicroservice.domain.model.Traceability;
import com.pragma.poweup.traceabilitymicroservice.domain.spi.ITraceabilityPersistencePort;
import com.pragma.poweup.traceabilitymicroservice.domain.usecase.TraceabilityUseCase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;

@ExtendWith(MockitoExtension.class)
public class TraceabilityUseCaseTest {
    @Mock
    private ITraceabilityPersistencePort traceabilityPersistencePort;
    @InjectMocks
    private TraceabilityUseCase traceabilityUseCase;

    @Test
    void saveTraceability(){
        Traceability traceability = new Traceability(
                "1234567890",
                1L,
                100L,
                "client@example.com",
                LocalDateTime.now(),
                "PENDIENTE",
                "PENDIENTE",
                500L,
                "employee@example.com"
        );

        traceabilityUseCase.saveTraceability(traceability);

        Mockito.verify(traceabilityPersistencePort).saveTraceability(traceability);
    }

}
