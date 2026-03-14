package jssoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class PlayingWithIt {

    public static void main(String[] args) throws IOException {
        String url = "https://en.wikipedia.org/wiki/List_of_oil_refineries";

        Document doc = Jsoup.connect(url)
                .userAgent("Mozilla/5.0")
                .get();
        Elements links = doc.select("a[href]");

        System.out.println(doc.html().equals("href"));
        for (Element link : links) {
            String href = link.attr("abs:href");   // absolute URL
            String text = link.text();             // link text

            System.out.println(text + " -> " + href);
        }
    }
}
