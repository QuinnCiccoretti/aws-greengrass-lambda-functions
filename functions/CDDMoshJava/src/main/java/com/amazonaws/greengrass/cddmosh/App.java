package com.amazonaws.greengrass.cddmosh;

import com.amazonaws.greengrass.cddmosh.modules.AppModule;
import com.timmattison.greengrass.cdd.BaselineAppInterface;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

// Greengrass requires a no-args constructor
@NoArgsConstructor(force = true)
@Slf4j
public class App implements BaselineAppInterface {
    static {
        // Specify any modules you need here
        BaselineAppInterface.initialize(Arrays.asList(new AppModule()));
    }
}
