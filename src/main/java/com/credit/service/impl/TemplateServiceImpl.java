package com.credit.service.impl;

import com.credit.dao.TemplateRepository;
import com.credit.entity.Template;
import com.credit.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TemplateServiceImpl implements TemplateService {

    @Autowired
    private TemplateRepository templateRepository;

    @Override
    public Optional<Template> findById(Long id){
        return templateRepository.findById(id);
    }

}
