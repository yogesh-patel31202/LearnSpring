package com.SpringREST.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.SpringREST.Model.BootModel;

@Repository
public interface BootRepository extends JpaRepository<BootModel, Integer> {
}
