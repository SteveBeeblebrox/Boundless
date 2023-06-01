package io.github.sianabeeblebrox.boundless.meta;

import com.google.gson.reflect.TypeToken;
import groovy.lang.GroovyShell;
import org.codehaus.groovy.ast.ASTNode;
import org.codehaus.groovy.ast.AnnotationNode;
import org.codehaus.groovy.ast.expr.ConstantExpression;
import org.codehaus.groovy.ast.expr.PropertyExpression;
import org.codehaus.groovy.control.CompilePhase;
import org.codehaus.groovy.control.SourceUnit;
import org.codehaus.groovy.transform.ASTTransformation;
import org.codehaus.groovy.transform.GroovyASTTransformation;

import java.util.List;

@GroovyASTTransformation(phase=CompilePhase.SEMANTIC_ANALYSIS)
public class EntrypointASTTransform implements ASTTransformation {
    @SuppressWarnings("unchecked")
    @Override
    public void visit(ASTNode[] nodes, SourceUnit sourceUnit) {
        try {
            Entrypoint.Type type = (Entrypoint.Type)Entrypoint.class.getMethod("type").getDefaultValue();
            if(((AnnotationNode)nodes[0]).getMember("type") instanceof PropertyExpression expr) {
                type = Entrypoint.Type.valueOf((String)((ConstantExpression)expr.getProperty()).getValue());
            }
            System.out.println(type);

        } catch(Exception never) {

        }
          var shell = new GroovyShell(this.getClass().getClassLoader());
//        shell.setVariable("entrypoint", ((ClassNode) nodes[1]).getName());
//        //System.getProperties()
//        //        .forEach((key, value) -> System.out.println(key + ": " + value));
//        //System.out.println("XXX: " + node.getName() + " - " + System.getProperty("gradle.rootDir"));
//        var modJSON = (AbstractMap<String, Object>) new JsonSlurper().setType(JsonParserType.LAX).parse(new File(System.getProperty("gradle.rootDir") + "/src/main/resources/fabric.mod.json"));
//        //new File('C:\\Users\\exodu\\Desktop\\logs\\latest.log') << node.name;
        //System.out.println(modJSON.get("entrypoints"));
        //System.out.println(modJSON.getClass());
    }
}
