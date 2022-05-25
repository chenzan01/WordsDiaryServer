package com.zanchen.develop.wordsdiary.util;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.zanchen.develop.wordsdiary.entity.wordbook.BeanKaoYanLuan1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JsonParserUtil {
    public JsonParserUtil() {
        try {
            readFileByLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readFileByLine() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\JavaProject\\WordsDiaryServer\\wordbooks\\KaoYanluan_1.json"));
        String line;
        JsonParser parser = new JsonParser();
        while ((line = bufferedReader.readLine()) != null){
            JsonObject jsonObject = (JsonObject) parser.parse(line);
            getAllWordInfo(jsonObject);
        }
        bufferedReader.close();
    }

    private void getAllWordInfo(JsonObject jsonObject){

        //最外层，有四个属性
        //1、wordRank
        //2、headWord
        //3、content
        //4、bookId
        BeanKaoYanLuan1 beanKaoYanLuan1 = new BeanKaoYanLuan1();
        beanKaoYanLuan1.setWordRank(jsonObject.get("wordRank").getAsInt());
        beanKaoYanLuan1.setHeadWord(jsonObject.get("headWord").getAsString());
        beanKaoYanLuan1.setContent(jsonObject.get("content").getAsJsonObject());
        beanKaoYanLuan1.setBookId(jsonObject.get("bookId").getAsString());

        //
        //
        //
        //
        BeanKaoYanLuan1.ContentBeanX contentBeanX = new BeanKaoYanLuan1.ContentBeanX();
        contentBeanX.setWord(beanKaoYanLuan1.getContent().get("word").getAsJsonObject());

        //
        //
        //
        //
        BeanKaoYanLuan1.ContentBeanX.WordBean wordBean = new BeanKaoYanLuan1.ContentBeanX.WordBean();
        wordBean.setWordHead(contentBeanX.getWord().get("wordHead").getAsString());
        wordBean.setWordId(contentBeanX.getWord().get("wordId").getAsString());

        System.out.println(wordBean.getWordId());


//        BeanKaoYanLuan1.ContentBeanX.WordBean.ContentBean contentBean =
//                new BeanKaoYanLuan1.ContentBeanX.WordBean.ContentBean();
//        contentBean.setPhone(jsonObject.get("phone").getAsString());
//        contentBean.setSpeech(jsonObject.get("speech").getAsString());
//        contentBean.setUsphone(jsonObject.get("usphone").getAsString());
//        contentBean.setUkphone(jsonObject.get("ukphone").getAsString());
//        contentBean.setUsspeech(jsonObject.get("usspeech").getAsString());
//        contentBean.setUkspeech(jsonObject.get("ukspeech").getAsString());
//        contentBean.setStar(jsonObject.get("star").getAsInt());
//
//        BeanKaoYanLuan1.ContentBeanX.WordBean.ContentBean.SentenceBean sentenceBean =
//                new BeanKaoYanLuan1.ContentBeanX.WordBean.ContentBean.SentenceBean();
//        Gson gson = new Gson();
//        JsonArray jsonArray = jsonObject.get("sentences").getAsJsonArray();
//        sentenceBean.setSentences(gson.fromJson(jsonArray, List.class));
//        System.out.println(sentenceBean.getSentences());
//
//        BeanKaoYanLuan1.ContentBeanX.WordBean.ContentBean.SentenceBean.SentencesBean sentencesBean =
//                new BeanKaoYanLuan1.ContentBeanX.WordBean.ContentBean.SentenceBean.SentencesBean();



    }

}
