package com.springboot.s_aopdemo_pointcut_declarations;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.springboot.s_aopdemo_pointcut_declarations.dao.AccountDAO;
import com.springboot.s_aopdemo_pointcut_declarations.dao.MembershipDAO;

@SpringBootApplication
public class AopdemoApplication {
    public static void main(String[] args) {
		SpringApplication.run(AopdemoApplication.class, args);
	}

    @Bean
    public CommandLineRunner commandLineRunner(AccountDAO theAccountDAO, MembershipDAO theMembershipDAO) {
        return runner -> {
            demoTheBeforeAdvice(theAccountDAO, theMembershipDAO);
        };
    }

    private void demoTheBeforeAdvice(AccountDAO theAccountDAO, MembershipDAO theMembershipDAO) {
        // call the business method
        Account myAccount = new Account();
        theAccountDAO.addAccount(myAccount, true);
        theAccountDAO.doWork();

        // call the membership business method
        theMembershipDAO.addSillyMember();
        theMembershipDAO.goToSleep();
    }
}
