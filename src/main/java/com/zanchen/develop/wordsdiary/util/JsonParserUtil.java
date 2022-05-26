package com.zanchen.develop.wordsdiary.util;


import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.zanchen.develop.wordsdiary.entity.wordbook.BeanKaoYanLuan1;

import java.beans.JavaBean;
import java.io.*;
import java.lang.reflect.Type;
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

        //最外层，有四个属性,四个属性均不会为空
        //1、wordRank 单词序号
        //2、headWord 单词
        //3、content 单词详情
        //4、bookId 所属词书名
        BeanKaoYanLuan1 beanKaoYanLuan1 = new BeanKaoYanLuan1();
        beanKaoYanLuan1.setWordRank(jsonObject.get("wordRank").getAsInt());
        beanKaoYanLuan1.setHeadWord(jsonObject.get("headWord").getAsString());
        beanKaoYanLuan1.setContent(jsonObject.get("content").getAsJsonObject());
        beanKaoYanLuan1.setBookId(jsonObject.get("bookId").getAsString());

        //content层
        //包含word，不会为空
        BeanKaoYanLuan1.ContentBeanX contentBeanX = new BeanKaoYanLuan1.ContentBeanX();
        contentBeanX.setWord(beanKaoYanLuan1.getContent().get("word").getAsJsonObject());

        //
        //
        //
        //
        BeanKaoYanLuan1.ContentBeanX.WordBean wordBean = new BeanKaoYanLuan1.ContentBeanX.WordBean();
        wordBean.setWordHead(contentBeanX.getWord().get("wordHead").getAsString());
        wordBean.setWordId(contentBeanX.getWord().get("wordId").getAsString());
        wordBean.setContent(contentBeanX.getWord().get("content").getAsJsonObject());

        //
        //
        //
        //
        BeanKaoYanLuan1.ContentBeanX.WordBean.ContentBean contentBean =
                new BeanKaoYanLuan1.ContentBeanX.WordBean.ContentBean();
        if(wordBean.getContent().has("star")){
            contentBean.setStar(wordBean.getContent().get("star").getAsInt());
        }
        if(wordBean.getContent().has("phone")){
            contentBean.setPhone(wordBean.getContent().get("phone").getAsString());
        }
        if(wordBean.getContent().has("speech")){
            contentBean.setSpeech(wordBean.getContent().get("speech").getAsString());
        }
        if(wordBean.getContent().has("usphone")){
            contentBean.setUsphone(wordBean.getContent().get("usphone").getAsString());
        }
        if(wordBean.getContent().has("ukphone")){
            contentBean.setUkphone(wordBean.getContent().get("ukphone").getAsString());
        }
        if(wordBean.getContent().has("usspeech")){
            contentBean.setUsspeech(wordBean.getContent().get("usspeech").getAsString());
        }
        if(wordBean.getContent().has("ukspeech")){
            contentBean.setUkspeech(wordBean.getContent().get("ukspeech").getAsString());
        }
        if(wordBean.getContent().has("sentence")){
            contentBean.setSentence(wordBean.getContent().get("sentence").getAsJsonObject());
        }
        if(wordBean.getContent().has("syno")){
            contentBean.setSyno(wordBean.getContent().get("syno").getAsJsonObject());
        }
        if(wordBean.getContent().has("phrase")){
            contentBean.setPhrase(wordBean.getContent().get("phrase").getAsJsonObject());
        }
        if(wordBean.getContent().has("relWord")){
            contentBean.setRelWord(wordBean.getContent().get("relWord").getAsJsonObject());
        }
        if(wordBean.getContent().has("trans")){
            JsonArray jsonArray = wordBean.getContent().get("trans").getAsJsonArray();
            contentBean.setTrans(new Gson().fromJson(jsonArray,List.class));
        }


        //sentence
        //属性：JsonObject
        //内容：sentences（例句列表），desc（注释用字符串）
        BeanKaoYanLuan1.ContentBeanX.WordBean.ContentBean.SentenceBean sentenceBean =
                new BeanKaoYanLuan1.ContentBeanX.WordBean.ContentBean.SentenceBean();
        if(contentBean.getSentence() != null){
            JsonArray jsonArray = contentBean.getSentence().get("sentences").getAsJsonArray();
            sentenceBean.setSentences(new Gson().fromJson(jsonArray, List.class));
            sentenceBean.setDesc(contentBean.getSentence().get("desc").getAsString());
        }

        //syno
        //属性：JsonObject
        //内容：synos（同近词列表），desc（注释用字符串）
        BeanKaoYanLuan1.ContentBeanX.WordBean.ContentBean.SynoBean synoBean =
                new BeanKaoYanLuan1.ContentBeanX.WordBean.ContentBean.SynoBean();
        if(contentBean.getSyno() != null){
            JsonArray jsonArray = contentBean.getSyno().get("synos").getAsJsonArray();
            synoBean.setSynos(new Gson().fromJson(jsonArray,List.class));
            synoBean.setDesc(contentBean.getSyno().get("desc").getAsString());
        }

        //phrase
        //属性：JsonObject
        //内容：phrases（短语列表），desc（注释用字符串）
        BeanKaoYanLuan1.ContentBeanX.WordBean.ContentBean.PhraseBean phraseBean =
                new BeanKaoYanLuan1.ContentBeanX.WordBean.ContentBean.PhraseBean();
        if(contentBean.getPhrase() != null){
            JsonArray jsonArray = contentBean.getPhrase().get("phrases").getAsJsonArray();
            phraseBean.setPhrases(new Gson().fromJson(jsonArray,List.class));
            phraseBean.setDesc(contentBean.getPhrase().get("desc").getAsString());
        }

        //relWord
        //属性：JsonObject
        //内容：rels（同根词列表），desc（注释用字符串）
        BeanKaoYanLuan1.ContentBeanX.WordBean.ContentBean.RelWordBean relWordBean =
                new BeanKaoYanLuan1.ContentBeanX.WordBean.ContentBean.RelWordBean();
        if(contentBean.getRelWord() != null){
            JsonArray jsonArray = contentBean.getRelWord().get("rels").getAsJsonArray();
            relWordBean.setRels(new Gson().fromJson(jsonArray,List.class));
            relWordBean.setDesc(contentBean.getRelWord().get("desc").getAsString());
        }

        //trans
        //属性：LinkedTreeMap,先将其转换为JsonArray后再按顺序get其中的JsonObject
        //内容：释义JsonObject
        BeanKaoYanLuan1.ContentBeanX.WordBean.ContentBean.TransBean transBean =
                new BeanKaoYanLuan1.ContentBeanX.WordBean.ContentBean.TransBean();
        if(contentBean.getTrans() != null){
            for (int i = 0; i<contentBean.getTrans().size(); i++){
                Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
                String string = gson.toJson(contentBean.getTrans());
                JsonArray jsonArray = gson.fromJson(string,JsonArray.class);
                JsonObject trans = jsonArray.get(i).getAsJsonObject();

                if(trans.has("pos")){
                    transBean.setPos(trans.get("pos").getAsString());
                }
                if(trans.has("tranCn")){
                    transBean.setTranCn(trans.get("tranCn").getAsString());
                }
                if(trans.has("descCn")){
                    transBean.setDescCn(trans.get("descCn").getAsString());
                }
                if(trans.has("tranOther")){
                    transBean.setTranOther(trans.get("tranOther").getAsString());
                }
                if(trans.has("descOther")){
                    transBean.setDescOther(trans.get("descOther").getAsString());
                }
            }
        }



    }

}
