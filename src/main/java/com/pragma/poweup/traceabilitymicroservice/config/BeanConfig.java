package com.pragma.poweup.traceabilitymicroservice.config;

import com.pragma.poweup.traceabilitymicroservice.adapters.driven.mongodb.adapter.TraceabilityMongodbAdapter;
import com.pragma.poweup.traceabilitymicroservice.adapters.driven.mongodb.mappers.ITraceabilityCollectionMapper;
import com.pragma.poweup.traceabilitymicroservice.adapters.driven.mongodb.repositories.ITraceabilityRepository;
import com.pragma.poweup.traceabilitymicroservice.domain.api.ITraceabilityServicePort;
import com.pragma.poweup.traceabilitymicroservice.domain.spi.ITraceabilityPersistencePort;
import com.pragma.poweup.traceabilitymicroservice.domain.usecase.TraceabilityUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfig {
    private final ITraceabilityRepository traceabilityRepository;
    private final ITraceabilityCollectionMapper traceabilityCollectionMapper;

    @Bean
    public ITraceabilityPersistencePort traceabilityPersistencePort(){
        return new TraceabilityMongodbAdapter(traceabilityRepository,traceabilityCollectionMapper);
    }

    @Bean
    public ITraceabilityServicePort traceabilityServicePort(){
        return new TraceabilityUseCase(traceabilityPersistencePort());
    }
}
