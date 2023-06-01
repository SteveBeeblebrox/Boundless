import static org.codehaus.groovy.control.customizers.builder.CompilerCustomizationBuilder.*
import groovy.transform.SourceURI;
import java.nio.file.Paths;

withConfig(configuration) {
    source(extension: 'sgroovy') {
        ast(groovy.transform.CompileStatic)
    }

    source(classValidator: { classNode -> !classNode.isInterface() } ) {
        ast(groovy.util.logging.Log4j2, visibilityId: 'Log4j2')
    }

    @SourceURI
    URI scriptSourceUri

    System.setProperty("gradle.rootDir", Paths.get(scriptSourceUri).parent.toString())
}