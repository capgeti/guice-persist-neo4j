package com.google.inject.extensions.neo4j;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author tbaum
 * @since 20.02.12
 */
@Target({METHOD, TYPE}) @Retention(RUNTIME) @Inherited
public @interface Transactional {
}
