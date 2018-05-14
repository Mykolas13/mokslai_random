package com.mokykla.traukiniai.controllers;

import com.mokykla.traukiniai.models.Traukinys;
import com.mokykla.traukiniai.models.Vagonas;
import com.mokykla.traukiniai.service.TraukinysService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@Controller
public class TraukinysController {

    TraukinysService traukinysService;

    public TraukinysController(TraukinysService traukinysService) {

        this.traukinysService = traukinysService;
    }

    @GetMapping("/traukinys")
    public @ResponseBody Iterable<Traukinys> getTraukinys() {

        return traukinysService.getAll();
    }

    @GetMapping("/{id}/vagonas")
    public @ResponseBody Iterable<Vagonas> getVagonai(@PathVariable Long id) {

        return traukinysService.getVagonas(id);
    }

    @PostMapping("/traukinys")
    public @ResponseBody void addTraukinys (@RequestBody Traukinys traukinys){

        traukinysService.addTraukinys(traukinys);
    }

    @DeleteMapping("/delTraukinys/{id}")
    public @ResponseBody void delTraukinys (@PathVariable Long id){

        traukinysService.delTraukinys(id);
    }

}
