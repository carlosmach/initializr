package ${packageName};

import org.springframework.boot.SpringApplication;<% if (useSpringBootApplication) { %>
import org.springframework.boot.autoconfigure.SpringBootApplication;<% } else { %>
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;<% } %>
<% if (useSpringBootApplication) { %>
@SpringBootApplication<% } else { %>
@Configuration
@ComponentScan
@EnableAutoConfiguration <% } %>
public class ${applicationName} {

	public static void main(String[] args) {
		SpringApplication.run(${applicationName}.class, args);
	}
}
