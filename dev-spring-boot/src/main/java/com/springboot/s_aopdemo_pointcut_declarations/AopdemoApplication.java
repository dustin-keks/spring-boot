package com.springboot.s_aopdemo_pointcut_declarations;

import java.util.List;

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
            // demoTheBeforeAdvice(theAccountDAO, theMembershipDAO);
            demoTheAfterReturnAdvice(theAccountDAO);
        };
    }

    private void demoTheAfterReturnAdvice(AccountDAO theAccountDAO) {
        // call method to find the accounts
        List<Account> theAccounts = theAccountDAO.findAccounts();

        // display the accounts
        System.out.println("\n\nMain Program: demoTheAfterReturnAdvice");
        System.out.println("-----");

        System.out.println(theAccounts);

        System.out.println("\n");
    }

    private void demoTheBeforeAdvice(AccountDAO theAccountDAO, MembershipDAO theMembershipDAO) {
        // call the business method
        Account myAccount = new Account();
        myAccount.setName("John Doe");
        myAccount.setLevel("Platinum");
        theAccountDAO.addAccount(myAccount, true);
        theAccountDAO.doWork();

        // call the accountdao getter/setter methods
        theAccountDAO.setName("foobar");
        theAccountDAO.setServiceCode("silver");

        String name = theAccountDAO.getName();
        String code = theAccountDAO.getServiceCode();

        // call the membership business method
        theMembershipDAO.addSillyMember();
        theMembershipDAO.goToSleep();
    }
}
