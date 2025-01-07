package com.Mario;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class DataModel {
    @JsonProperty("data")
    private List<BusinessModel> data;

    public DataModel() {
    }

    public DataModel(List<BusinessModel> data) {
        this.data = data;
    }

    public List<BusinessModel> getData() {
        return data;
    }

    public void setData(List<BusinessModel> data) {
        this.data = data;
    }
}

class BusinessModel {
    @JsonProperty("Business")
    private String name;
    @JsonProperty("Sells")
    private List<Sells> sellsList;

    public BusinessModel() {
    }

    public BusinessModel(String name, List<Sells> sellsList) {
        this.name = name;
        this.sellsList = sellsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Sells> getSellsList() {
        return sellsList;
    }

    public void setSellsList(List<Sells> sellsList) {
        this.sellsList = sellsList;
    }
}

class Sells {
    @JsonProperty("slot")
    private int position;
    @JsonProperty("Keyboards")
    private List<KeyboardModel> keyboardsList;
    @JsonProperty("Mouses")
    private List<MouseModel> mousesList;
    @JsonProperty("Monitors")
    private List<MonitorModel> monitorsList;
    @JsonProperty("Headsets")
    private List<HeadsetModel> headsetList;

    public Sells() {
    }

    public Sells(int position, List<KeyboardModel> keyboardsList, List<MouseModel> mousesList,
            List<MonitorModel> monitorsList, List<HeadsetModel> headsetList) {
        this.position = position;
        this.keyboardsList = keyboardsList;
        this.mousesList = mousesList;
        this.monitorsList = monitorsList;
        this.headsetList = headsetList;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public List<KeyboardModel> getKeyboardsList() {
        return keyboardsList;
    }

    public void setKeyboardsList(List<KeyboardModel> keyboardsList) {
        this.keyboardsList = keyboardsList;
    }

    public List<MouseModel> getMousesList() {
        return mousesList;
    }

    public void setMousesList(List<MouseModel> mousesList) {
        this.mousesList = mousesList;
    }

    public List<MonitorModel> getMonitorsList() {
        return monitorsList;
    }

    public void setMonitorsList(List<MonitorModel> monitorsList) {
        this.monitorsList = monitorsList;
    }

    public List<HeadsetModel> getHeadsetList() {
        return headsetList;
    }

    public void setHeadsetList(List<HeadsetModel> headsetList) {
        this.headsetList = headsetList;
    }
}

class KeyboardModel {
    @JsonProperty("slot")
    private int position;
    private String name;
    private double price;
    private String url;

    public KeyboardModel() {
    }

    public KeyboardModel(int position, String name, double price, String url) {
        this.position = position;
        this.name = name;
        this.price = price;
        this.url = url;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

class MouseModel {
    @JsonProperty("slot")
    private int position;
    private String name;
    private double price;
    private String url;

    public MouseModel() {
    }

    public MouseModel(int position, String name, double price, String url) {
        this.position = position;
        this.name = name;
        this.price = price;
        this.url = url;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

class MonitorModel {
    @JsonProperty("slot")
    private int position;
    private String name;
    private double price;
    private String url;

    public MonitorModel() {
    }

    public MonitorModel(int position, String name, double price, String url) {
        this.position = position;
        this.name = name;
        this.price = price;
        this.url = url;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

class HeadsetModel {
    @JsonProperty("slot")
    private int position;
    private String name;
    private double price;
    private String url;

    public HeadsetModel() {
    }

    public HeadsetModel(int position, String name, double price, String url) {
        this.position = position;
        this.name = name;
        this.price = price;
        this.url = url;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}