package com.datenbank.wasserdienstdb.repository;

import com.datenbank.wasserdienstdb.model.Wiesenwichtel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WiesenwichtelRepository extends JpaRepository<Wiesenwichtel, Long> {
    // Zusätzliche Abfrage-Methoden (falls benötigt...)
}
