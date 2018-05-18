package configuration;
/*
 * package hello;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@ComponentScan(value="hello")
@EnableGlobalMethodSecurity(prePostEnabled=true)
@EnableWebSecurity

public class SecurityConfig extends WebSecurityConfigurerAdapter{ 
	
    @Autowired
    @Qualifier("UserDetailsService")
    private UserDetailsService userDetailsService;
	
    @Autowired
    @Qualifier("PasswordEncoder")
    private PasswordEncoder passwordEncoder;
    
    @Autowired
    private AuthenticationManagerBuilder auth;

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("admin").password("admin").roles("ADMIN");
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
	}
	
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return auth.getOrBuild();
    }
    


}

 */