package org.example.apachecon.lal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    private static final Logger LOGGER = LogManager.getLogger(LogController.class);

    @RequestMapping(value = "/logs/trigger")
    public void trigger() {
        LOGGER.info("this is a test log by log4j 2, timestamp: " + System.currentTimeMillis());
    }
}
