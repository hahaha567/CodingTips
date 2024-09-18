package com.hahaha.coding.case1;

import com.hahaha.coding.case1.handler.TaskHandler;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public enum TaskHandlerFactory {
    PIN_DETECTION("PIN_DETECTION"),
    XCU_DETECTION("XCU_DETECTION"),
    TEMPLATE("TEMPLATE");

    private final String label;

    @Setter
    private TaskHandler taskHandler;

    private TaskHandlerFactory(String label) {
        this.label = label;
    }

    public static void register(String label, TaskHandler handler) {
        log.info("handler label is {}", label);
        TaskHandlerFactory.valueOf(label).setTaskHandler(handler);
    }
}
