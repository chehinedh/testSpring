package com.example.fokwaldaya.implementations;

import com.example.fokwaldaya.Generic.IGenericServiceImpl;
import com.example.fokwaldaya.entities.DetailFacture;
import com.example.fokwaldaya.service.DetailFactureService;
import org.springframework.stereotype.Service;

@Service
public class DetailFactureImp extends IGenericServiceImpl<DetailFacture,Long> implements DetailFactureService {
}
