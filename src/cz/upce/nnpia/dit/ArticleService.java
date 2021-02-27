package cz.upce.nnpia.dit;

public class ArticleService {
    private final EmailService emailService;

    public ArticleService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void publishArticle(){
        emailService.sendEmail("st64297@upce.cz", "Article was published");
    }
}
