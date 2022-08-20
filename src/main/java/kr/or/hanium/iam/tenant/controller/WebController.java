//package kr.or.hanium.iam.tenant.controller;
//
//import org.keycloak.KeycloakPrincipal;
//import org.keycloak.KeycloakSecurityContext;
//import org.keycloak.representations.AccessToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.security.Principal;
//
//@Controller
//public class WebController {
//    @GetMapping("/hello")
//    public String hello() {
//        return "Hello KeyCloak!";
//    }
//    @GetMapping("/app1")
//    public String tracingTest() {
//        return "This is permitAll!";
//    }
//
//    @GetMapping("/tester/test")
//    public String tester() {
//        return "This is tester permit";
//    }
//
//    @GetMapping("/user/test")
//    public String user() {
//        return "This is user permit";
//    }
//
//    @GetMapping("/manager/test")
//    public String manager() {
//        System.out.println("manager router connect");
//        return "This is manager permit";
//    }
//
//    @GetMapping("/userinfo")
//    public String userInfoController(Model model) {
//
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//
//        KeycloakPrincipal principal = (KeycloakPrincipal)auth.getPrincipal();
//
//
//        KeycloakSecurityContext session = principal.getKeycloakSecurityContext();
//        AccessToken accessToken = session.getToken();
//        String username = accessToken.getPreferredUsername();
//        String emailID = accessToken.getEmail();
//        String lastname = accessToken.getFamilyName();
//        String firstname = accessToken.getGivenName();
//        String realmName = accessToken.getIssuer();
//        AccessToken.Access realmAccess = accessToken.getRealmAccess();
//        System.out.println("username = " + username);
//
//        //KeycloakAuthenticationToken keycloakAuthenticationToken = (KeycloakAuthenticationToken) principal;
//        //AccessToken accessToken = keycloakAuthenticationToken.getAccount().getKeycloakSecurityContext().getToken();
//        //
//        //model.addAttribute("username", accessToken.getGivenName());
//        //System.out.println("accessToken.getGivenName() = " + accessToken.getGivenName());
//        return "page";
//    }
//
//}
