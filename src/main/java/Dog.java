import lombok.Data;


@Data
public class Dog {
    private String name;

    public String say(){
        return "Gavvv";
    }
}
