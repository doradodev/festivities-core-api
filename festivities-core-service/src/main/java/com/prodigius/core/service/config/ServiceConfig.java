/**
 * 
 */
package com.prodigius.core.service.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author cristiandorado
 *
 */
@Configuration
@ComponentScan("com.prodigius.core.service")
@PropertySource("classpath:service.properties")
public class ServiceConfig {

}
