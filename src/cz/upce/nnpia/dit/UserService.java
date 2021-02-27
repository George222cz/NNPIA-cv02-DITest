package cz.upce.nnpia.dit;

public class UserService {
    private final EmailService emailService;

    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void createAccount(){
        // create account
        emailService.sendEmail("st64297@upce.cz", "Hello World");
    }
}
