import static org.codehaus.groovy.control.customizers.builder.CompilerCustomizationBuilder.*
withConfig(configuration) {
    source(extension: 'sgroovy') {
        ast(groovy.transform.CompileStatic)
    }

    source(classValidator: { classNode -> !classNode.isInterface() } ) {
        ast(groovy.util.logging.Log4j2, visibilityId: 'Log4j2')
    }

    System.setProperty("compileGroovy.project_dir", new File(new URI(getClass().protectionDomain.codeSource.location.path)).parent)
    System.setProperty("compileGroovy.target_dir", configuration.getTargetDirectory().toString())
}