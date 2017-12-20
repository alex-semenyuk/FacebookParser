package parser.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import parser.model.Education;
import parser.model.Profile;
import parser.model.Work;

public class ParserService {

    public Profile parse(String url) throws Exception {
        Profile profile = new Profile();
        Document doc = Jsoup.connect(url).get();
        profile.setName(doc.select("#fb-timeline-cover-name a").text());
        for (Element edu : doc.select("div[data-pnref=edu] li")) {
            Education education = new Education();
            education.setName(edu.select("._2lzr").text());
            education.setInfo(edu.select(".fsm").text());
            profile.getEducationList().add(education);
        }
        for (Element wor : doc.select("div[data-pnref=work] li")) {
            Work work = new Work();
            work.setName(wor.select("._2lzr").text());
            work.setInfo(wor.select(".fsm").text());
            profile.getWorkList().add(work);
        }
        return profile;
    }

}
