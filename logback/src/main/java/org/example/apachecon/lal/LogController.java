package org.example.apachecon.lal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogController.class);

    @RequestMapping(value = "/logs/trigger")
    public void trigger() {
        LOGGER.info("this is a test log by logback, timestamp: " + System.currentTimeMillis());
    }
}
