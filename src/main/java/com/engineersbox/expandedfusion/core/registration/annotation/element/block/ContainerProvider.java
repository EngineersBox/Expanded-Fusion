package com.engineersbox.expandedfusion.core.registration.annotation.element.block;

import com.engineersbox.expandedfusion.core.registration.annotation.element.ProvidesElement;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@ProvidesElement("container")
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface ContainerProvider {
    String name();
}
