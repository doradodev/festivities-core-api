/**
 * 
 */
package com.prodigius.core.repository.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import lombok.extern.slf4j.Slf4j;

/**
 * @author cristiandorado
 *
 */
@Slf4j
@Configuration
@EnableJpaAuditing
@EnableTransactionManagement
@EnableJpaRepositories("com.prodigius.core.repository.model")
@ComponentScan("com.prodigius.core.repository")
@PropertySource("classpath:repository.properties")
public class RepositoryConfig {

}
