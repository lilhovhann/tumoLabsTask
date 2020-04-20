package io.project.app.patientcare.controllers;

import io.project.app.patientcare.services.VisitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lilith
 */

@RestController
@RequestMapping("/api/v2/visits")
@Slf4j
public class VisitController {
    @Autowired
    private VisitService visitService;
}