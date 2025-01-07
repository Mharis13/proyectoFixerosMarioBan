package com.Mario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class ThymeleafConfig {
    public static void generateHtml(DataModel dataModel) throws IOException {
        // Configuración del resolver de plantillas
        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        templateResolver.setPrefix("templates/");
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode("HTML");

        // Configuración del motor de plantillas
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);

        // Leer el archivo .dat
        Map<String, String> info = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/info.dat"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(": ");
                if (parts.length == 2) {
                    info.put(parts[0].toLowerCase(), parts[1]);
                }
            }
        }

        // Creación del contexto con los datos
        Context context = new Context();
        context.setVariable("data", dataModel.getData());
        context.setVariable("info", info);

        // Procesar la plantilla
        String contenidoHTML = templateEngine.process("template", context);

        // Guardar el archivo generado
        escribeHTML(contenidoHTML, "src/main/resources/templates/index.html");
    }

    public static void escribeHTML(String contenido, String rutaArchivo) throws IOException {
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            writer.write(contenido);
        }
    }
}