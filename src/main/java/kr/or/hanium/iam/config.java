//package kr.or.hanium.iam;
//
//import org.keycloak.adapters.KeycloakConfigResolver;
//import org.keycloak.adapters.KeycloakDeployment;
//import org.keycloak.adapters.KeycloakDeploymentBuilder;
//import org.keycloak.adapters.spi.HttpFacade;
//import org.keycloak.adapters.springsecurity.authentication.KeycloakAuthenticationProvider;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.keycloak.adapters.springsecurity.config.KeycloakWebSecurityConfigurerAdapter;
//import org.springframework.security.core.authority.mapping.SimpleAuthorityMapper;
//import org.springframework.security.core.session.SessionRegistryImpl;
//import org.springframework.security.web.authentication.session.RegisterSessionAuthenticationStrategy;
//import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;
//
//import java.io.InputStream;
//
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(jsr250Enabled = true)
//public class config extends KeycloakWebSecurityConfigurerAdapter{
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        KeycloakAuthenticationProvider keycloakAuthenticationProvider = keycloakAuthenticationProvider();
//        keycloakAuthenticationProvider.setGrantedAuthoritiesMapper(new SimpleAuthorityMapper());
//        auth.authenticationProvider(keycloakAuthenticationProvider);
//    }
//
//    @Bean
//    @Override
//    protected SessionAuthenticationStrategy sessionAuthenticationStrategy() {
//        return new RegisterSessionAuthenticationStrategy(
//                new SessionRegistryImpl());
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        System.out.println("this is Auth Request");
//        System.out.println(http.authorizeRequests());
//        super.configure(http);
//
//        http.authorizeRequests()
//                .antMatchers("/app*").permitAll()
//                .antMatchers("/tester/**").hasAnyRole("TESTER")
//                .antMatchers("/user/**").hasAnyRole("USER")
//                //.mvcMatchers("/tester*").hasAnyRole("TESTER")
//                .antMatchers("/manager/**").hasAnyRole("MANAGER")
//                .anyRequest().authenticated();
//
//        http.csrf().disable();
//    }
//
//    @Bean
//    public KeycloakConfigResolver keycloakConfigResolver() {
//        //return new KeycloakSpringConfigResolverWrapper();
//        return new KeycloakConfigResolver() {
//            private KeycloakDeployment keycloakDeployment;
//            @Override
//            public KeycloakDeployment resolve(HttpFacade.Request facade) {
//                if (keycloakDeployment != null) {
//                    return keycloakDeployment;
//                }
//                InputStream configInputStream = getClass().getResourceAsStream("/keycloak.json");
//                return KeycloakDeploymentBuilder.build(configInputStream);
//            }
//        };
//    }
//
//
//}
