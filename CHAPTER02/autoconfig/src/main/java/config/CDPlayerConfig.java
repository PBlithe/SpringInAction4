package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import soundsystem.Empty;

@Configuration
@ComponentScan(basePackageClasses = Empty.class)
public class CDPlayerConfig {
}
