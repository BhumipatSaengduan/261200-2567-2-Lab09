public class MainDIP {
    public static void main(String[] args) {
        EmailNotifier emailNotifier = new EmailNotifier();
        SMSNotifier smsNotifier = new SMSNotifier();
        OrderProcessor orderProcessor = new OrderProcessor(emailNotifier);
        OrderProcessor orderProcessor2 = new OrderProcessor(smsNotifier);
        
        emailNotifier.notify("Hello, this is an email message");
        smsNotifier.notify("Hello, this is an SMS message");
    }
}
