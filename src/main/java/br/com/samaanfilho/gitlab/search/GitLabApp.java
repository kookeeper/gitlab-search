package br.com.samaanfilho.gitlab.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "br.com.samaanfilho" })
public class GitLabApp {

	public static void main(String[] args) {
		SpringApplication.run(GitLabApp.class, args);
	}

}
