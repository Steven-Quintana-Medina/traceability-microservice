package com.pragma.poweup.traceabilitymicroservice.adapters.driven.mongodb.mappers;

import com.pragma.poweup.traceabilitymicroservice.adapters.driven.mongodb.collection.TraceabilityCollection;
import com.pragma.poweup.traceabilitymicroservice.domain.model.Traceability;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ITraceabilityCollectionMapper {
    TraceabilityCollection toCollection(Traceability traceability);

    List<Traceability> toModel(List<TraceabilityCollection> traceabilityCollection);
}
