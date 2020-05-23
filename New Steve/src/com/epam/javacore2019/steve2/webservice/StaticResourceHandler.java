package com.epam.javacore2019.steve2.webservice;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StaticResourceHandler implements HttpHandler {

    private static Map<String, String> resourceTypeMap = new HashMap<>();

    static {
        resourceTypeMap.put("css", "text/css");
        resourceTypeMap.put("js", "application/javascript");
        resourceTypeMap.put("img", "image/jpeg");
    }

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        String path = httpExchange.getRequestURI().getPath();
        File file = new File("webclient/static" + path);
        byte[] fileBytes = null;
        if (file.exists()) {
            fileBytes = Utils.readBytes("webclient/static" + path);
        }

        String resourceType = path.split("/")[1];
        String contentType = resourceTypeMap.get(resourceType);

        httpExchange.getResponseHeaders().put("Content-Type", Arrays.asList(new String[]{contentType}));
        httpExchange.sendResponseHeaders(200, 0);
        OutputStream os = httpExchange.getResponseBody();
        if (fileBytes != null) {
            os.write(fileBytes);
        }
        os.close();
    }
}
