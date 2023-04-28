public class Ghost {

    private String name;
    private Integer age;

    public Ghost() {
        this.name = "hehe";
        this.age = 10;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    private String getSecret() {
        return "This is a secret message.";
    }

    public static Integer getNumber() {
        return 42;
    }

    public static String getWord() {
        return "Hello";
    }

}