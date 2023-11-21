package com.prowings;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.error.YAMLException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class YamlValidator {
    public static void main(String[] args) {
        // Replace "your_yaml_file.yaml" with the path to your YAML file
        String yamlFilePath = "F:/STS/YamlFileValidator/src/main/resources/JohnDoe.yaml";

        try (InputStream inputStream = new FileInputStream(yamlFilePath)) {
            Yaml yaml = new Yaml();
//             Parsing the YAML file, which will also validate its structure
            Object data = yaml.load(inputStream);
            System.out.println("YAML file is valid!");
            System.out.println("Parsed data:\n" + data);
        } catch (IOException e) {
            System.err.println("Error reading the YAML file: " + e.getMessage());
        } catch (YAMLException e) {
            System.err.println("Invalid YAML file: " + e.getMessage());
        }
    }
}
