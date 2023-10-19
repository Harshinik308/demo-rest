package com.example.demorest.repository;
import org.springframework.stereotype.Repository;
import com.example.demorest.model.demoModel;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface demoRepository extends JpaRepository<demoModel,Long>{

}
