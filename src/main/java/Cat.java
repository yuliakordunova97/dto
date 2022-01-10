import lombok.Data;

@Data
public class Cat {
    private String name;

    public String catSay(){
        return"Mayyyy";
    }
}
