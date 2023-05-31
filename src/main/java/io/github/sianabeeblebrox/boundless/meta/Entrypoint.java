package io.github.sianabeeblebrox.boundless.meta;

import org.codehaus.groovy.transform.GroovyASTTransformationClass;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE})
@GroovyASTTransformationClass(classes = {EntrypointASTTransform.class})
public @interface Entrypoint {
    enum Type {
        MAIN, CLIENT, SERVER;
    }
    Type type() default Type.MAIN;
}