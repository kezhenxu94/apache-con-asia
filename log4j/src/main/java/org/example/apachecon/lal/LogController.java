package org.example.apachecon.lal;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    private static final Logger LOGGER = Logger.getLogger(LogController.class);

    @RequestMapping(value = "/logs/trigger")
    public void trigger() {
        LOGGER.info("this is a test log by log4j 1, timestamp: " + System.currentTimeMillis());
    }
}
