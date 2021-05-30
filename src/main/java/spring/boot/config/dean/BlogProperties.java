package spring.boot.config.dean;

import org.springframework.beans.factory.annotation.Value;

public class BlogProperties {
    @Value("${mrbird.blg.name}")
    private String name;

    @Value("${mrbird.blog.title}")
    private String title;

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
}
