package com.mitre.attack.repository;

import com.mitre.attack.model.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItemRepository extends JpaRepository<Item, String> {
    Page<Item> findAllByNameLike(String name, Pageable pageable);

    Optional<Item> findByObjectId(String objectId);
}
