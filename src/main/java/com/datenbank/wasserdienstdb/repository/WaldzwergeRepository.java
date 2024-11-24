package com.datenbank.wasserdienstdb.repository;

import com.datenbank.wasserdienstdb.model.Waldzwerge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WaldzwergeRepository extends JpaRepository<Waldzwerge, Long> {
    // Zusätzliche Abfrage-Methoden (falls benötigt...)
}
