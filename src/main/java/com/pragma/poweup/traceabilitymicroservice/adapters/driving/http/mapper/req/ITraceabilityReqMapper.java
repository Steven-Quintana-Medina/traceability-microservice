package com.pragma.poweup.traceabilitymicroservice.adapters.driving.http.mapper.req;

import com.pragma.poweup.traceabilitymicroservice.adapters.driving.http.dto.req.TraceabilityReqDto;
import com.pragma.poweup.traceabilitymicroservice.domain.model.Traceability;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
unmappedTargetPolicy = ReportingPolicy.IGNORE,
unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ITraceabilityReqMapper {
    Traceability toTraceability(TraceabilityReqDto traceabilityReqDto);
}
