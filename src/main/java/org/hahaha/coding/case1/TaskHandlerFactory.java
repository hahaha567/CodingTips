package org.hahaha.coding.case1;

import org.hahaha.coding.case1.handler.TaskHandler;

import java.util.HashMap;
import java.util.Map;

public class TaskHandlerFactory {
    private static Map<String, TaskHandler> taskHandlerMap = new HashMap<>();

    public static void register(String name, TaskHandler handler) {
        taskHandlerMap.put(name, handler);
    }

    public static TaskHandler getHandler(String name) {
        return taskHandlerMap.get(name);
    }
}
