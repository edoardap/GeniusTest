package com.lug.calculator;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.ast.expr.AnnotationExpr;
import com.github.javaparser.utils.SourceRoot;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class JavaCodeAnalyzer {

    public static void main(String[] args) throws IOException {
        String projectPath = "src/main/java";  // caminho relativo do projeto Java
        SourceRoot sourceRoot = new SourceRoot(Paths.get(projectPath));

        List<CompilationUnit> units = sourceRoot.tryToParse()
                .stream()
                .filter(r -> r.getResult().isPresent())
                .map(r -> r.getResult().get())
                .toList();

        List<Map<String, Object>> analysisResults = new ArrayList<>();

        for (CompilationUnit cu : units) {
            cu.findAll(ClassOrInterfaceDeclaration.class).forEach(cls -> {
                String className = cls.getNameAsString();

                cls.getMethods().forEach(method -> {
                    Map<String, Object> methodInfo = new HashMap<>();
                    methodInfo.put("className", className);
                    methodInfo.put("methodName", method.getNameAsString());
                    methodInfo.put("brief", method.toString());
                    methodInfo.put("methodSignature", method.getDeclarationAsString(false, false, false));
                    methodInfo.put("sourceCode", method.toString());

                    methodInfo.put("useField", false); // não implementado ainda
                    methodInfo.put("isConstructor", method.isConstructorDeclaration());
                    methodInfo.put("isGetSet", method.getNameAsString().startsWith("get") || method.getNameAsString().startsWith("set"));
                    methodInfo.put("isPublic", method.isPublic());
                    methodInfo.put("isBoolean", method.getType().asString().equals("boolean"));
                    methodInfo.put("isAbstract", method.isAbstract());

                    // Parâmetros
                    List<String> params = new ArrayList<>();
                    method.getParameters().forEach(p -> params.add(p.toString()));
                    methodInfo.put("parameters", params);

                    methodInfo.put("dependentMethods", new HashMap<>());
                    methodInfo.put("full_method_info", method.toString());

                    // Comentário
                    Optional<Comment> comment = method.getComment();
                    methodInfo.put("method_comment", comment.map(Comment::getContent).orElse(""));

                    // Anotação
                    List<String> annotations = new ArrayList<>();
                    for (AnnotationExpr annotation : method.getAnnotations()) {
                        annotations.add(annotation.toString());
                    }
                    methodInfo.put("method_annotation", String.join("\n", annotations));

                    analysisResults.add(methodInfo);
                });
            });
        }

        // Salvar como JSON
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter("analysis.json")) {
            gson.toJson(analysisResults, writer);
        }

        System.out.println("Análise concluída! Arquivo salvo como analysis.json");
    }
}
