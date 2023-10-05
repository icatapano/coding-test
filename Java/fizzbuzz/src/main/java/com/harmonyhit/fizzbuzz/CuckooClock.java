package com.harmonyhit.fizzbuzz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalTime;

public class CuckooClock {
    private static final Logger LOGGER = LoggerFactory.getLogger(CuckooClock.class);

    public String cuckooClock(LocalTime clock) {
        String chain = "";
        chain = checkForFizz(clock.getMinute(), chain);
        chain += checkForBuzz(clock.getMinute(), chain);
        return chain;
    }

    private String addSpace(String str) {
        if (str != "") {
            str += " ";
        }
        return str;
    }

    private String checkForFizz(Integer minute, String str) {
        if(minute % 3 == 0) {
            String fizz = "Fizz";
            LOGGER.info(fizz);
            str += fizz;
        }
        return str;
    }

    private String checkForBuzz(Integer minute, String str) {
        if(minute % 5 == 0) {
            String buzz = "Buzz";
            LOGGER.info(buzz);
            str = addSpace(str);
            str += buzz;
        }
        return str;
    }

}
