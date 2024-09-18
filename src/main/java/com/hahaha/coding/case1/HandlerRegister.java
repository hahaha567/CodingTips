package com.hahaha.coding.case1;

import com.hahaha.coding.case1.handler.TaskHandler;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class HandlerRegister implements BeanPostProcessor {
    public void register(TaskHandler handler) {
        if (handler.getClass().isAnnotationPresent(Handler.class)) {
            Handler tag = handler.getClass().getAnnotation(Handler.class);
            for (String name : tag.data()) {
                TaskHandlerFactory.register(name, handler);
            }
        }
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof TaskHandler) {
            register((TaskHandler) bean);
        }
        return bean;
    }
}
