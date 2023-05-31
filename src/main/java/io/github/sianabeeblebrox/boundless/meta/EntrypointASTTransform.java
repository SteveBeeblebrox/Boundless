package io.github.sianabeeblebrox.boundless.meta;

import org.codehaus.groovy.ast.ASTNode;
import org.codehaus.groovy.ast.ClassNode;
import org.codehaus.groovy.control.CompilePhase;
import org.codehaus.groovy.control.SourceUnit;
import org.codehaus.groovy.transform.ASTTransformation;
import org.codehaus.groovy.transform.GroovyASTTransformation;

@GroovyASTTransformation(phase=CompilePhase.SEMANTIC_ANALYSIS)
public class EntrypointASTTransform implements ASTTransformation {
    @Override
    public void visit(ASTNode[] nodes, SourceUnit sourceUnit) {
        ClassNode node = (ClassNode) nodes[1];
        //System.getProperties()
        //        .forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("XXX: " + node.getName() + " - " + System.getProperty("root_dir"));
        //new File('C:\\Users\\exodu\\Desktop\\logs\\latest.log') << node.name;
    }
}
