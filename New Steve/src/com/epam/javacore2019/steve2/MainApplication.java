package com.epam.javacore2019.steve2;

import com.epam.javacore2019.steve2.dbservice.misc.XMLDocumentHandler;
import com.epam.javacore2019.steve2.webservice.Utils;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MainApplication {

    public static Map<String, Enum> applications = new HashMap<>();

    public static void main(String[] args) {

        try {
            startApplications();//запускаем приложения из config.xml . туда же можно кучу настроек вынести
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void startApplications() {
        try {
            Utils.readXMLDocument("main/config.xml", new XMLDocumentHandler() {
                @Override
                public void handleDocument(Document document) {
                    try {
                        NodeList apps = document.getElementsByTagName("application");
                        for (int i = 0, len = apps.getLength(); i < len; i++) {
                            Element el = (Element) (apps.item(i));//достаем аппликейшн
                            Class cls = Class.forName(el.getAttribute("class"));//достаем класс - длинное имя com. ... . .. ..
                            //у него есть методы
                            Enum appInstance = Enum.valueOf(cls, "INSTANCE");//достаем инстанс класса (енума)
                            applications.put(el.getAttribute("name"), appInstance);
                            int port = Integer.valueOf(el.getAttribute("port"));//достаем порт из конфиг файла
                            cls.getDeclaredMethod("start", int.class).invoke(appInstance, port);//достаем из методов объект типа метод с именем старт и запускаем его через инвоук
                            //int.class - говорим, что метод старт должен принимать параметр int
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
