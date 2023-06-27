package com.pragma.poweup.traceabilitymicroservice.adapters.driven.mongodb.repositories;

import com.pragma.poweup.traceabilitymicroservice.adapters.driven.mongodb.collection.TraceabilityCollection;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface ITraceabilityRepository extends MongoRepository<TraceabilityCollection, String> {
    List<TraceabilityCollection> findByIdClientAndIdOrder(Long idClient,Long orderId);
}
