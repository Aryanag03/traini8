package com.traini8.service;

import com.traini8.model.TrainingCenter;
import com.traini8.repository.TrainingCenterRepository;
import org.springframework.stereotype.Service;
import java.time.Instant;
import java.util.List;

@Service
public class TrainingCenterService {

    private final TrainingCenterRepository repository;

    public TrainingCenterService(TrainingCenterRepository repository) {
        this.repository = repository;
    }

    public TrainingCenter createTrainingCenter(TrainingCenter center) {
        center.setCreatedOn(Instant.now());
        return repository.save(center);
    }

    public List<TrainingCenter> getAllTrainingCenters() {
        return repository.findAll();
    }
}
