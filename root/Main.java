package com.Mario;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        DataModel data = mapper.readValue(new File(
                "C:\\Users\\mario\\Desktop\\MBPROJECTEFIXERS\\src\\main\\resources\\json\\technologicalBusinessData.json"),
                DataModel.class);

        ThymeleafConfig.generateHtml(data);
    }
}