package az.test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.Arrays;
import java.util.List;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",
        monochrome = true,
        tags = "",
        glue = {"az.test"},
        plugin = {"pretty", "json:target/Cucumber.json"}
)
public class TestRunner {
    @AfterClass
    public static void afterClass(){
        File outputFile=new File("target");
        List<String> jsonFile= Arrays.asList("target/Cucumber.json");
        Configuration configuration=new Configuration(outputFile,"Calculator");
        configuration.addClassifications("Platform name","Andorid");
        ReportBuilder reportBuilder=new ReportBuilder(jsonFile,configuration);
        reportBuilder.generateReports();
    }

}

