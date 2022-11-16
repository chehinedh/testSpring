package com.example.fokwaldaya.controllers;

import com.example.fokwaldaya.Generic.GenericController;
import com.example.fokwaldaya.entities.DetailFacture;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/detailfact")
public class DetailFactureController extends GenericController<DetailFacture,Long> {
}
