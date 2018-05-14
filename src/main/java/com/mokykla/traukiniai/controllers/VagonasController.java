package com.mokykla.traukiniai.controllers;

import com.mokykla.traukiniai.models.Vagonas;
import com.mokykla.traukiniai.service.VagonasService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@Controller
public class VagonasController {

    VagonasService vagonasService;

    public VagonasController(VagonasService vagonasService) {

        this.vagonasService = vagonasService;
    }

    @GetMapping("/vagonas")
    public @ResponseBody Iterable<Vagonas> getVagonas() {
        return vagonasService.getAll();
    }

    @PostMapping("/vagonas")
    public @ResponseBody void addVagonas (@RequestBody Vagonas vagonas) {
        vagonasService.addVagonas(vagonas);
    }

    @DeleteMapping("/delVagonas/{id}")
    public @ResponseBody void delVagonas(@PathVariable Long id) {
        vagonasService.delVagonas(id);
    }

}