package com.pragma.poweup.traceabilitymicroservice.adapters.driving.http.handler.impl;

import com.pragma.poweup.traceabilitymicroservice.adapters.driving.http.dto.req.TraceabilityReqDto;
import com.pragma.poweup.traceabilitymicroservice.adapters.driving.http.dto.res.TraceabilityResDto;
import com.pragma.poweup.traceabilitymicroservice.adapters.driving.http.handler.ITraceabilityHandler;
import com.pragma.poweup.traceabilitymicroservice.adapters.driving.http.mapper.req.ITraceabilityReqMapper;
import com.pragma.poweup.traceabilitymicroservice.adapters.driving.http.mapper.res.ITraceabilityResMapper;
import com.pragma.poweup.traceabilitymicroservice.config.converters.IJsonConverter;
import com.pragma.poweup.traceabilitymicroservice.domain.api.ITraceabilityServicePort;
import com.pragma.poweup.traceabilitymicroservice.domain.model.Traceability;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TraceabilityHandlerImpl implements ITraceabilityHandler {
    private final ITraceabilityServicePort traceabilityServicePort;
    private final ITraceabilityReqMapper traceabilityReqMapper;
    private final ITraceabilityResMapper traceabilityResMapper;
    private final IJsonConverter jsonConverters;

    @Override
    public void saveTraceability(TraceabilityReqDto traceabilityReqDto) {
        traceabilityServicePort.saveTraceability(traceabilityReqMapper.toTraceability(traceabilityReqDto));
    }

    @Override
    public void saveTraceability(String traceabilityJson) {
        Traceability json = jsonConverters.toTraceabilityReqDto(traceabilityJson);
        traceabilityServicePort.saveTraceability(json);
    }

    @Override
    public List<TraceabilityResDto> getTraceabilityToOrder(Long idClient, Long idOrder) {
        return traceabilityResMapper.toTraceabilityResDto(traceabilityServicePort.getTraceabilityToOrder(idClient,idOrder));
    }
}
