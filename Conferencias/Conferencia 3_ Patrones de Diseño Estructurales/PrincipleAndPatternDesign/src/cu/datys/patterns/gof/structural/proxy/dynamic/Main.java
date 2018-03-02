package cu.datys.patterns.gof.structural.proxy.dynamic;

/**
 * Created by Alex on 06/02/2018.
 */
public class Main {
    public static void main(String[] args) {
        ApiLink link = new ApiLink("https://www.google.com", "google", null);

        ILink proxy = DynamicProxyFactory.createProxy(ILink.class, link);

        System.out.println(proxy.getRel());
        System.out.println(proxy.getUrl());
    }
}
