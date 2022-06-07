package com.api.pdv.controllers;

import com.api.pdv.services.ComandasServices;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/comanda")
public class ComandasControllers {

    final ComandasServices comandasServices;

    public ComandasControllers(ComandasServices comandasServices) {
        this.comandasServices = comandasServices;
    }
}
