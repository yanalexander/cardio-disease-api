package br.com.bigdata.cardiodiseaseapi.repository;

import br.com.bigdata.cardiodiseaseapi.entity.Disease;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DiseaseRepository extends MongoRepository<Disease,String> {
}
