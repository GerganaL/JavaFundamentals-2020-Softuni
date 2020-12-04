package RegexEx;

public class compare {
    public static void main(String[] args) {
        String reg = "([*:]{2})[A-Z][a-z]{2,}\\1";
        String reg2 = "(?<name>([*]{2})[A-Z][a-z]{2,}([*]{2})|([:]{2})[A-Z][a-z]{2,}([:]{2}))";
        System.out.println(reg == reg2);
    }
}
