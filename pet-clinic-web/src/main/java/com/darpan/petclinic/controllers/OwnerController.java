package com.darpan.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {
    @RequestMapping({ "/owners", "/owners/index", "/owners/index.html" })
    public String listOwners() {

        return "owners/index";

    }

}
