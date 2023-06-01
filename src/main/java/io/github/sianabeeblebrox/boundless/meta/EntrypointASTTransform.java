package io.github.sianabeeblebrox.boundless.meta;

import groovy.json.JsonParserType;
import groovy.json.JsonSlurper;
import org.codehaus.groovy.ast.ASTNode;
import org.codehaus.groovy.ast.ClassNode;
import org.codehaus.groovy.control.CompilePhase;
import org.codehaus.groovy.control.SourceUnit;
import org.codehaus.groovy.transform.ASTTransformation;
import org.codehaus.groovy.transform.GroovyASTTransformation;

import java.io.File;

@GroovyASTTransformation(phase=CompilePhase.SEMANTIC_ANALYSIS)
public class EntrypointASTTransform implements ASTTransformation {
    @Override
    public void visit(ASTNode[] nodes, SourceUnit sourceUnit) {
        ClassNode node = (ClassNode) nodes[1];
        //System.getProperties()
        //        .forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("XXX: " + node.getName() + " - " + System.getProperty("compileGroovy.project_dir")
                + " - " + System.getProperty("compileGroovy.target_dir"));
        //var modJSON = new JsonSlurper().setType(JsonParserType.LAX).parse(new File(System.getProperty("compileGroovy.project_dir") + "/src/main/resources/fabric.mod.json"));
        //System.out.println(modJSON);
        //new File('C:\\Users\\exodu\\Desktop\\logs\\latest.log') << node.name;
    }
}
