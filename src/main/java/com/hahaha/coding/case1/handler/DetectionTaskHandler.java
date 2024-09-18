package com.hahaha.coding.case1.handler;

import com.hahaha.coding.case1.Handler;
import org.springframework.stereotype.Component;

@Handler(name = "DETECTION", data = {"PIN_DETECTION", "XCU_DETECTION"})
@Component
public class DetectionTaskHandler implements TaskHandler {
}
