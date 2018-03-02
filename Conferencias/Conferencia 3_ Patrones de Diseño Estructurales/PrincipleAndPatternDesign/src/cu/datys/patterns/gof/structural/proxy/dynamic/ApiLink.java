package cu.datys.patterns.gof.structural.proxy.dynamic;

import java.net.URI;

/**
 * Created by Alex on 06/02/2018.
 */
public class ApiLink {
    private String url;
    private String rel;
    private String title;

    public ApiLink(String url, String rel, String title) {
        this.url = url;
        this.rel = rel;
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public String getRel() {
        return rel;
    }

    public String getTitle() {
        return title;
    }
}
