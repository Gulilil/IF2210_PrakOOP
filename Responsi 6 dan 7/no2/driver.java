public class driver {
    public static void main(String[] args) {
        String[] emails = {"123johb@com.com", "@email.com", "", "34@error@email.com", "atgmail.com","hehe@com.",};
        for (String email : emails) {
            Email e = new Email(email);
            try {
                e.validateEmail();
                System.out.println(email + " => Valid email");
            } catch (InvalidEmailException ex) {
                System.out.println(email + " => " + ex.getMessage());
            } catch (InvalidDomainException ex) {
                System.out.println(email + " => " + ex.getMessage());
            }
        }
    }
}
