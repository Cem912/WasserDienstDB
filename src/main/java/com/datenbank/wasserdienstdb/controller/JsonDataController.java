package com.datenbank.wasserdienstdb.controller;

import com.datenbank.wasserdienstdb.model.Waldzwerge;
import com.datenbank.wasserdienstdb.model.Wiesenwichtel;
import com.datenbank.wasserdienstdb.repository.WaldzwergeRepository;
import com.datenbank.wasserdienstdb.repository.WiesenwichtelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jsondata")
public class JsonDataController {

    @Autowired
    private WaldzwergeRepository waldzwergeRepository;

    @Autowired
    private WiesenwichtelRepository wiesenwichtelRepository;

    // POST-Endpoint für Waldzwerge
    @PostMapping("/waldzwerge")
    public Waldzwerge saveWaldzwergeData(@RequestBody Waldzwerge waldzwerge) {
        return waldzwergeRepository.save(waldzwerge);
    }

    // POST-Endpoint für Wiesenwichtel
    @PostMapping("/wiesenwichtel")
    public Wiesenwichtel saveWiesenwichtelData(@RequestBody Wiesenwichtel wiesenwichtel) {
        return wiesenwichtelRepository.save(wiesenwichtel);
    }
}
