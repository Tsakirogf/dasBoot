package com.tsakirogf.controller;

import com.tsakirogf.services.HomeService;
import net.bytebuddy.dynamic.DynamicType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tsakirogf.model.Shipwreck;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/")
public class ShipwreckController
{
    @Autowired
    HomeService service;

    @GetMapping(value = "shipwrecks")
    Iterable<Shipwreck> list()
    {
        return service.findAll();
    }

    @RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
    Shipwreck create(@RequestBody Shipwreck shipwreck) {
        return service.save(shipwreck);
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.GET)
    Optional<Shipwreck> get(@PathVariable int id) {
        return service.findById(id);
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.PUT)
    Shipwreck update(@PathVariable int id, @RequestBody Shipwreck shipwreck) {
        return service.save(shipwreck);
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable int id, @RequestBody Shipwreck shipwreck) {
        service.delete(shipwreck);
    }
}
