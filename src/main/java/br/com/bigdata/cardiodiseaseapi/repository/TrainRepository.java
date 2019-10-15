package br.com.bigdata.cardiodiseaseapi.repository;

import br.com.bigdata.cardiodiseaseapi.entity.Train;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrainRepository extends MongoRepository<Train,String> {
}
