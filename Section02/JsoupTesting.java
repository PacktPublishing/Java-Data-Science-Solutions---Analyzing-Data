import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTesting {
	public static void main(String[] args){
		JsoupTesting test = new JsoupTesting();
		System.out.println(test.extractDataWithJsoup("http://www.sustainalytics.com"));
	}

	public Document extractDataWithJsoup(String href){
		Document doc = null;
		try {
			doc = Jsoup.connect(href).timeout(10*1000).userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36").ignoreHttpErrors(true).get();
		} catch (IOException e) {
			//Your exception handling here
		}
		if(doc != null){
			String title = doc.title();
			String text = doc.body().text();
			Elements links = doc.select("a[href]");
			for (Element link : links) {
				String linkHref = link.attr("href");
				String linkText = link.text();
				String linkOuterHtml = link.outerHtml(); 
				String linkInnerHtml = link.html();
			}
		}
		return doc;
	}
}
