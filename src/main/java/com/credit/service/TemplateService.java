package com.credit.service;

import com.credit.entity.Template;

import java.util.Optional;

public interface TemplateService {

  Optional<Template> findById(Long id);
}
