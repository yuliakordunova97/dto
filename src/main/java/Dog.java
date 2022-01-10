import lombok.Data;


@Data
public class Dog {
    private String name;

    public String dogSay(){
        return "Gavvv";
    }
}
