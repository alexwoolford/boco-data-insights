package io.woolford.respositories;

import io.woolford.entities.Permit;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class JpaBocoRepository implements BocoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void mergePermit(Permit permit) {
        entityManager.merge(permit);
    }


}
