withConfig(configuration) {
    source(extension: 'sgroovy') {
        ast(groovy.transform.CompileStatic)
    }

    source(classValidator: { classNode -> !classNode.isInterface() } ) {
        ast(groovy.util.logging.Log4j2, visibilityId: 'Log4j2')
    }
}