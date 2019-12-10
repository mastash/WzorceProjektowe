package builder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Burger {

    private String bread;
    private String meat;
    private String sauce;
    private String vegetables;

    @Override
    public String toString() {
        return "Burger{" +
                "bread='" + bread + '\'' +
                ", meat='" + meat + '\'' +
                ", sauce='" + sauce + '\'' +
                ", vegetables='" + vegetables + '\'' +
                '}';
    }
}
