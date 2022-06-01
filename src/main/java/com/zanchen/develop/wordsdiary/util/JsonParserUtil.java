package com.zanchen.develop.wordsdiary.util;

import com.google.gson.*;
import com.zanchen.develop.wordsdiary.entity.bookentity.BasicEntity;

import java.io.*;
import java.sql.*;
import java.util.List;

public class JsonParserUtil {
    public JsonParserUtil() {
        try {
            readFileByLine();
        } catch (IOException | ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            e.printStackTrace();
        }
    }
    //连接数据库
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/wordsdiary?useUnicode=true&characterEncoding=utf8&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=GMT%2B8";
    private static final String user = "chenzan";
    private static final String password = "123456";

    private Connection connection;
    private PreparedStatement preparedStatement;
    int i = 1;

    private void readFileByLine() throws IOException, ClassNotFoundException,
            IllegalAccessException, InstantiationException, SQLException {
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader("D:\\JavaProject\\WordsDiaryServer\\wordbooks\\ChuZhong_3.json"));
        String line;
        JsonParser parser = new JsonParser();
        Class.forName(driver).newInstance();
        connection = DriverManager.getConnection(url,user,password);

        while ((line = bufferedReader.readLine()) != null){
            JsonObject jsonObject = (JsonObject) parser.parse(line);
            getAllWordInfo(jsonObject);
            i++;
        }
        bufferedReader.close();
        System.out.println("Finish!");
    }

    private void getAllWordInfo(JsonObject jsonObject) throws SQLException {

        //最外层，有四个属性,四个属性均不会为空
        //1、wordRank 单词序号
        //2、headWord 单词
        //3、content 单词详情
        //4、bookId 所属词书名
        BasicEntity basicEntity = new BasicEntity();
        basicEntity.setWordRank(jsonObject.get("wordRank").getAsInt());
        basicEntity.setHeadWord(jsonObject.get("headWord").getAsString());
        basicEntity.setContent(jsonObject.get("content").getAsJsonObject());
        basicEntity.setBookId(jsonObject.get("bookId").getAsString());

        //content层
        //包含word，不会为空
        BasicEntity.ContentBeanX contentBeanX = new BasicEntity.ContentBeanX();
        contentBeanX.setWord(basicEntity.getContent().get("word").getAsJsonObject());

        //
        //
        //
        //
        BasicEntity.ContentBeanX.WordBean wordBean = new BasicEntity.ContentBeanX.WordBean();
        wordBean.setWordHead(contentBeanX.getWord().get("wordHead").getAsString());
        wordBean.setWordId(contentBeanX.getWord().get("wordId").getAsString());
        wordBean.setContent(contentBeanX.getWord().get("content").getAsJsonObject());

        //
        //
        //
        //
        BasicEntity.ContentBeanX.WordBean.ContentBean contentBean =
                new BasicEntity.ContentBeanX.WordBean.ContentBean();
        if(wordBean.getContent().has("star")){
            contentBean.setStar(wordBean.getContent().get("star").getAsInt());
        }
        if(wordBean.getContent().has("phone")){
            contentBean.setPhone(wordBean.getContent().get("phone").getAsString());
            //插入数据库
            String sql = "UPDATE chuzhong3 SET phone = '" + contentBean.getPhone().replace("'","/") + "' WHERE wordRank = '" + i + " ';";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.execute();
        }
        if(wordBean.getContent().has("speech")){
            contentBean.setSpeech(wordBean.getContent().get("speech").getAsString());
            //插入数据库
            String sql = "UPDATE chuzhong3 SET speech = '" + contentBean.getSpeech().replace("'","/") + "' WHERE wordRank = '" + i + " ';";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.execute();
        }
        if(wordBean.getContent().has("usphone")){
            contentBean.setUsphone(wordBean.getContent().get("usphone").getAsString());
            //插入数据库
            String sql = "UPDATE chuzhong3 SET Usphone = '" + contentBean.getUsphone().replace("'","/") + "' WHERE wordRank = '" + i + " ';";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.execute();
        }
        if(wordBean.getContent().has("ukphone")){
            contentBean.setUkphone(wordBean.getContent().get("ukphone").getAsString());
            //插入数据库
            String sql = "UPDATE chuzhong3 SET Ukphone = '" + contentBean.getUkphone().replace("'","/") + "' WHERE wordRank = '" + i + " ';";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.execute();
        }
        if(wordBean.getContent().has("usspeech")){
            contentBean.setUsspeech(wordBean.getContent().get("usspeech").getAsString());
            //插入数据库g
            String sql = "UPDATE chuzhong3 SET USspeech = '" + contentBean.getUsspeech().replace("'","/") + "' WHERE wordRank = '" + i + " ';";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.execute();
        }
        if(wordBean.getContent().has("ukspeech")){
            contentBean.setUkspeech(wordBean.getContent().get("ukspeech").getAsString());
            //插入数据库
            String sql = "UPDATE chuzhong3 SET Ukspeech = '" + contentBean.getUkspeech().replace("'","/") + "' WHERE wordRank = '" + i + " ';";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.execute();
        }
        if(wordBean.getContent().has("sentence")){
            contentBean.setSentence(wordBean.getContent().get("sentence").getAsJsonObject());
        }
        if(wordBean.getContent().has("antos")){
            contentBean.setAntos(wordBean.getContent().get("antos").getAsJsonObject());
        }
        if(wordBean.getContent().has("syno")){
            contentBean.setSyno(wordBean.getContent().get("syno").getAsJsonObject());
        }
        if(wordBean.getContent().has("phrase")){
            contentBean.setPhrase(wordBean.getContent().get("phrase").getAsJsonObject());
        }
        if(wordBean.getContent().has("remMethod")){
            contentBean.setRemMethod(wordBean.getContent().get("remMethod").getAsJsonObject());
        }
        if(wordBean.getContent().has("relWord")){
            contentBean.setRelWord(wordBean.getContent().get("relWord").getAsJsonObject());
        }
        if(wordBean.getContent().has("trans")){
            JsonArray jsonArray = wordBean.getContent().get("trans").getAsJsonArray();
            contentBean.setTrans(new Gson().fromJson(jsonArray,List.class));
        }

        //trans
        //属性：LinkedTreeMap,先将其转换为JsonArray后再按顺序get其中的JsonObject
        //内容：释义JsonObject
        BasicEntity.ContentBeanX.WordBean.ContentBean.TransBean transBean =
                new BasicEntity.ContentBeanX.WordBean.ContentBean.TransBean();
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


        //sentence
        //属性：JsonObject
        //内容：sentences（例句列表），desc（注释用字符串）
        BasicEntity.ContentBeanX.WordBean.ContentBean.SentenceBean sentenceBean =
                new BasicEntity.ContentBeanX.WordBean.ContentBean.SentenceBean();
        if(contentBean.getSentence() != null){
            JsonArray jsonArray = contentBean.getSentence().get("sentences").getAsJsonArray();
            sentenceBean.setSentences(new Gson().fromJson(jsonArray, List.class));
            sentenceBean.setDesc(contentBean.getSentence().get("desc").getAsString());
            //插入数据库
            String sql = "UPDATE chuzhong3 SET sentences = '" + sentenceBean.getSentences().toString().replace("'","/") + "' WHERE wordRank = '" + i + " ';";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.execute();

        }

        //sentences
        //属性：LinkedTreeMap,先将其转换为JsonArray后再按顺序get其中的JsonObject
        //内容：例句JsonObject
        BasicEntity.ContentBeanX.WordBean.ContentBean.SentenceBean.SentencesBean sentencesBean =
                new BasicEntity.ContentBeanX.WordBean.ContentBean.SentenceBean.SentencesBean();
        if(sentenceBean.getSentences() != null) {
            for(int i = 0; i < sentenceBean.getSentences().size(); i++){
                Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
                String string = gson.toJson(sentenceBean.getSentences());
                JsonArray jsonArray = gson.fromJson(string,JsonArray.class);
                JsonObject sentences = jsonArray.get(i).getAsJsonObject();

                if(sentences.has("sContent")){
                    sentencesBean.setSentenceContent(sentences.get("sContent").getAsString());
                }
                if(sentences.has("sCn")){
                    sentencesBean.setSentenceCn(sentences.get("sCn").getAsString());
                }
            }
        }

        //antos
        //
        //
        //
        BasicEntity.ContentBeanX.WordBean.ContentBean.AntosBean antosBean =
                new BasicEntity.ContentBeanX.WordBean.ContentBean.AntosBean();
        if(contentBean.getAntos() != null){
            JsonArray jsonArray = contentBean.getAntos().get("anto").getAsJsonArray();
            antosBean.setAnto(new Gson().fromJson(jsonArray,List.class));
            antosBean.setDesc(contentBean.getAntos().get("desc").getAsString());
            //插入数据库
            String sql = "UPDATE chuzhong3 SET anto = '" + antosBean.getAnto().toString().replace("'","/") + "' WHERE wordRank = '" + i + " ';";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.execute();
        }

        //anto
        BasicEntity.ContentBeanX.WordBean.ContentBean.AntosBean.AntoBean antoBean =
                new BasicEntity.ContentBeanX.WordBean.ContentBean.AntosBean.AntoBean();
        if(antosBean.getAnto() != null){
            for(int i = 0; i < antosBean.getAnto().size(); i++){
                Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
                String string = gson.toJson(antosBean.getAnto());
                JsonArray jsonArray = gson.fromJson(string,JsonArray.class);
                JsonObject anto = jsonArray.get(i).getAsJsonObject();
                if(anto.has("hwd")){
                    antoBean.setHwd(anto.get("hwd").getAsString());
                }

            }
        }

        //syno
        //属性：JsonObject
        //内容：synos（同近词列表），desc（注释用字符串）
        BasicEntity.ContentBeanX.WordBean.ContentBean.SynoBean synoBean =
                new BasicEntity.ContentBeanX.WordBean.ContentBean.SynoBean();
        if(contentBean.getSyno() != null){
            JsonArray jsonArray = contentBean.getSyno().get("synos").getAsJsonArray();
            synoBean.setSynos(new Gson().fromJson(jsonArray,List.class));
            synoBean.setDesc(contentBean.getSyno().get("desc").getAsString());
            //插入数据库
            String sql = "UPDATE chuzhong3 SET synos = '" + synoBean.getSynos().toString().replace("'","/") + "' WHERE wordRank = '" + i + " ';";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.execute();
        }

        //synos
        //属性：LinkedTreeMap,先将其转换为JsonArray后再按顺序get其中的JsonObject
        //内容：
        BasicEntity.ContentBeanX.WordBean.ContentBean.SynoBean.SynosBean synosBean =
                new BasicEntity.ContentBeanX.WordBean.ContentBean.SynoBean.SynosBean();
        if(synoBean.getSynos() != null){
            for(int i = 0; i < synoBean.getSynos().size(); i++){
                Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
                String string = gson.toJson(synoBean.getSynos());
                JsonArray jsonArray = gson.fromJson(string,JsonArray.class);
                JsonObject synos = jsonArray.get(i).getAsJsonObject();

                if(synos.has("pos")){
                    synosBean.setPos(synos.get("pos").getAsString());
                }
                if(synos.has("tran")){
                    synosBean.setTran(synos.get("tran").getAsString());
                }
                if(synos.has("hwds")){
                    JsonArray hwds = synos.get("hwds").getAsJsonArray();
                    synosBean.setHwds(new Gson().fromJson(hwds,List.class));
                }
            }
        }

        //hwds
        //
        //
        BasicEntity.ContentBeanX.WordBean.ContentBean.SynoBean.SynosBean.HwdsBean hwdsBean =
                new BasicEntity.ContentBeanX.WordBean.ContentBean.SynoBean.SynosBean.HwdsBean();
        if(synosBean.getHwds() != null){
            for(int i = 0; i < synosBean.getHwds().size(); i++){
                Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
                String string = gson.toJson(synosBean.getHwds());
                JsonArray jsonArray = gson.fromJson(string,JsonArray.class);
                JsonObject hwds = jsonArray.get(i).getAsJsonObject();
                hwdsBean.setW(hwds.get("w").getAsString());
            }
        }


        //phrase
        //属性：JsonObject
        //内容：phrases（短语列表），desc（注释用字符串）
        BasicEntity.ContentBeanX.WordBean.ContentBean.PhraseBean phraseBean =
                new BasicEntity.ContentBeanX.WordBean.ContentBean.PhraseBean();
        if(contentBean.getPhrase() != null){
            JsonArray jsonArray = contentBean.getPhrase().get("phrases").getAsJsonArray();
            phraseBean.setPhrases(new Gson().fromJson(jsonArray,List.class));
            phraseBean.setDesc(contentBean.getPhrase().get("desc").getAsString());
            //插入数据库
            String sql = "UPDATE chuzhong3 SET phrases = '" + phraseBean.getPhrases().toString().replace("'","/") + "' WHERE wordRank = '" + i + " ';";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.execute();
        }

        //phrases
        //
        //
        BasicEntity.ContentBeanX.WordBean.ContentBean.PhraseBean.PhrasesBean phrasesBean =
                new BasicEntity.ContentBeanX.WordBean.ContentBean.PhraseBean.PhrasesBean();
        if(phraseBean.getPhrases() != null){
            for(int i = 0; i < phraseBean.getPhrases().size(); i++){
                Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
                String string = gson.toJson(phraseBean.getPhrases());
                JsonArray jsonArray = gson.fromJson(string,JsonArray.class);
                JsonObject phrases = jsonArray.get(i).getAsJsonObject();
                phrasesBean.setPhraseContent(phrases.get("pContent").getAsString());
                phrasesBean.setPhraseCn(phrases.get("pCn").getAsString());
            }
        }

        //remMethod
        //
        //
        BasicEntity.ContentBeanX.WordBean.ContentBean.RemMethodBean remMethodBean =
                new BasicEntity.ContentBeanX.WordBean.ContentBean.RemMethodBean();
        if(contentBean.getRemMethod() != null){
            if(contentBean.getRemMethod().has("val")){
                remMethodBean.setVal(contentBean.getRemMethod().get("val").getAsString());
                //插入数据库
                String sql = "UPDATE chuzhong3 SET remMethod = '" + remMethodBean.getVal().replace("'","/") + "' WHERE wordRank = '" + i + " ';";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.execute();
            }
            if(contentBean.getRemMethod().has("desc")){
                remMethodBean.setDesc(contentBean.getRemMethod().get("desc").getAsString());
            }
        }

        //relWord
        //属性：JsonObject
        //内容：rels（同根词列表），desc（注释用字符串）
        BasicEntity.ContentBeanX.WordBean.ContentBean.RelWordBean relWordBean =
                new BasicEntity.ContentBeanX.WordBean.ContentBean.RelWordBean();
        if(contentBean.getRelWord() != null){
            JsonArray jsonArray = contentBean.getRelWord().get("rels").getAsJsonArray();
            relWordBean.setRels(new Gson().fromJson(jsonArray,List.class));
            relWordBean.setDesc(contentBean.getRelWord().get("desc").getAsString());
            //插入数据库
            String sql = "UPDATE chuzhong3 SET rels = '" + relWordBean.getRels().toString().replace("'","/") + "' WHERE wordRank = '" + i + " ';";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.execute();
        }

        //rels
        //
        //
        //
        BasicEntity.ContentBeanX.WordBean.ContentBean.RelWordBean.RelsBean relsBean =
                new BasicEntity.ContentBeanX.WordBean.ContentBean.RelWordBean.RelsBean();
//        if(relWordBean.getRels() != null){
//            for(int i = 0; i < relWordBean.getRels().size(); i++){
//                Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
//                String string = gson.toJson(relWordBean.getRels());
//                JsonArray jsonArray = gson.fromJson(string,JsonArray.class);
//                JsonObject rels = jsonArray.get(i).getAsJsonObject();
//                relsBean.setPos(rels.get("pos").getAsString());
//                JsonArray words = rels.get("words").getAsJsonArray();
//                relsBean.setWords(new Gson().fromJson(words,List.class));
//            }
//        }

        //words
        //
        //
        BasicEntity.ContentBeanX.WordBean.ContentBean.RelWordBean.RelsBean.WordsBean wordsBean =
                new BasicEntity.ContentBeanX.WordBean.ContentBean.RelWordBean.RelsBean.WordsBean();
        if(relsBean.getWords() != null){
//            for(int i = 0; i < relsBean.getWords().size(); i++){
//                Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
//                String string = gson.toJson(relsBean.getWords());
//                JsonArray jsonArray = gson.fromJson(string,JsonArray.class);
//                JsonObject words = jsonArray.get(i).getAsJsonObject();
//                wordsBean.setHwd(words.get("hwd").getAsString());
//                wordsBean.setTran(words.get("tran").getAsString());
//            }

        }

        //插入所有基础字符串
//        String sql = "INSERT INTO beishigaozhong9 SET "
//                +"wordRank = '" + beanKaoYanLuan1.getWordRank()
//                +"',wordId = '" + wordBean.getWordId().replace("'","/")
//                +"',bookId = '" + beanKaoYanLuan1.getBookId().replace("'","/")
//                +"',headWord = '" + beanKaoYanLuan1.getHeadWord().replace("'","/")
//                +"',wordHead = '" + wordBean.getWordHead().replace("'","/")
//                +"',star = '" + contentBean.getStar()
//                +"',trans = '" + contentBean.getTrans().toString().replace("'","/")
//                + "';";
//        preparedStatement = connection.prepareStatement(sql);
//        preparedStatement.execute();

    }

}
