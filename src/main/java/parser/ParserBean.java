package parser;

import parser.model.Profile;
import parser.service.ParserService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean(name = "parserBean")
@SessionScoped
public class ParserBean implements Serializable{

    private String url;
    private Profile profile;

    private ParserService parserService = new ParserService();

    public void parseProfileByUrl() throws Exception {
        profile = parserService.parse(url);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
