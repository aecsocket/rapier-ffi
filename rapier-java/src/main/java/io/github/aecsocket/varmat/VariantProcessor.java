package io.github.aecsocket.varmat;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.TypeElement;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

@SupportedAnnotationTypes("io.github.aecsocket.varmat.*")
public final class VariantProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for (var annotation : annotations) {
            var elements = roundEnv.getElementsAnnotatedWith(annotation);
            for (var element : elements) {
                element
            }
            roundEnv.getRootElements()
        }

        try {
            var file = processingEnv.getFiler().createSourceFile("Hello.java");
            try (var out = new PrintWriter(file.openWriter())) {

            }
        } catch (IOException ex) {

        }

        return true;
    }
}
