package spring.boot.config.dean;
import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "mrbird.blog")

public class ConfigBean {
    private String name;
    private String title;
    private String wholeTitle;
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setWholeTitle(String whonleTitle){
        this.wholeTitle = whonleTitle;
    }

}
