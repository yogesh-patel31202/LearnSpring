package com.SpringREST.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.SpringREST.Model.BootModel;
import com.SpringREST.Repository.BootRepository;

@Service
public class BootService {

    private final BootRepository bootRepository;

    public BootService(BootRepository bootRepository) {
        this.bootRepository = bootRepository;
    }

    public BootModel saveBoot(BootModel boot) {
        return bootRepository.save(boot);
    }

    public List<BootModel> getAllBoots() {
        return bootRepository.findAll();
    }
}
