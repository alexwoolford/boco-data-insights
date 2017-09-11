package io.woolford.services;

import io.woolford.entities.Permit;
import io.woolford.respositories.BocoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BocoService {

    @Autowired
    private BocoRepository repository;

    public void mergePermit(Permit permit){
        repository.mergePermit(permit);
    }


}
