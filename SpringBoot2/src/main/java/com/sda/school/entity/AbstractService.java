package com.sda.school.entity;

import com.sda.school.exception.NullIdException;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;

public class AbstractService<ID_TYPE, MODEL extends AbstractModel<ID_TYPE>, REPOSITORY extends JpaRepository<MODEL, ID_TYPE>> {

    protected REPOSITORY repository;

    private Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    public AbstractService(REPOSITORY repository) {
        this.repository = repository;
    }

    public List<MODEL> get() {
        log.info("Mothod get has been called");
        return repository.findAll();
    }



    public Optional<MODEL> get(ID_TYPE id) {
        return repository.findById(id);
    }

    public MODEL add(MODEL model) {
        return repository.saveAndFlush(model);
    }

    public Optional<MODEL> update(MODEL model) throws NullIdException {
        if(model.getId() == null) {
            throw new NullIdException("The provided class ID is null!");
        }
        Optional<MODEL> existingModel = repository.findById(model.getId());
        if(existingModel.isPresent()) {
            return Optional.of(repository.saveAndFlush(model));
        } else {
            return Optional.empty();
        }
    }

    public void delete(ID_TYPE id) {
        repository.deleteById(id);
    }

}
