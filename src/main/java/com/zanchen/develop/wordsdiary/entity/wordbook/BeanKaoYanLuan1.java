package com.zanchen.develop.wordsdiary.entity.wordbook;

import com.google.gson.JsonObject;

import java.util.List;

public class BeanKaoYanLuan1 {
    /**
     * wordRank : 69
     * headWord : perfect
     * content : {"word":{"wordHead":"perfect","wordId":"KaoYanluan_1_69","content":{"sentence":{"sentences":[{"sContent":"His English was perfect.","sCn":"他的英语很地道。"},{"sContent":"The car was in perfect condition.","sCn":"这辆车的车况极佳。"},{"sContent":"You\u2019re very lucky to have perfect teeth.","sCn":"你能拥有一口完美的牙齿太幸运了。"},{"sContent":"a perfect performance","sCn":"完美的演出"},{"sContent":"In a perfect world, we wouldn\u2019t need an army.","sCn":"在理想世界中，我们不需要军队。"},{"sContent":"I don't know him\u2014he's a perfect stranger.","sCn":"我不认识他,他是百分之百的陌生人。"},{"sContent":"Mock trials help students perfect their legal skills.","sCn":"模拟庭审有助于学生们完善自己的法律技能。"}],"desc":"例句"},"usphone":"ˈpɝfɪkt; (for v.) pɝˈfɛkt","syno":{"synos":[{"pos":"adj","tran":"完美的；最好的；精通的","hwds":[{"w":"greatest"},{"w":"ideal"},{"w":"prime"},{"w":"best"},{"w":"full"}]},{"pos":"vt","tran":"使完美；使熟练","hwds":[{"w":"round off"},{"w":"polish up"}]}],"desc":"同近"},"ukphone":"ˈpəːfɪkt; (for v.) pəˈfekt","ukspeech":"perfect&type=1","star":0,"phrase":{"phrases":[{"pContent":"perfect oneself in","pCn":"精通；熟练；完全掌握"},{"pContent":"perfect for","pCn":"应用范围；对\u2026是完美的"},{"pContent":"perfect harmony","pCn":"水乳交融；完美无谐波；十分和谐"},{"pContent":"perfect market","pCn":"完全市场"},{"pContent":"perfect man","pCn":"完美无缺的人"},{"pContent":"perfect day","pCn":"天气极好"},{"pContent":"perfect balance","pCn":"理想均衡"},{"pContent":"perfect condition","pCn":"理想状态"},{"pContent":"present perfect","pCn":"[语]现在完成时"},{"pContent":"perfect competition","pCn":"完全（自由）竞争"},{"pContent":"perfect circle","pCn":"完整的圆圈；正圆"},{"pContent":"perfect state","pCn":"理想状态"},{"pContent":"perfect form","pCn":"完成式；完全型；正确几何形状"},{"pContent":"perfect gas","pCn":"理想气体；完美气体"},{"pContent":"present perfect tense","pCn":"现在完成式"},{"pContent":"perfect stranger","pCn":"完全不认识的人"},{"pContent":"perfect weather","pCn":"极好的天气"},{"pContent":"past perfect","pCn":"（动词的）过去完成时"},{"pContent":"perfect number","pCn":"完全数"},{"pContent":"past perfect tense","pCn":"过去完成时"}],"desc":"短语"},"phone":"'pə:fikt, pə'fekt","speech":"perfect","relWord":{"desc":"同根","rels":[{"pos":"adj","words":[{"hwd":"perfectible","tran":"可完成的；可使完美的"},{"hwd":"perfective","tran":"完成的；完成式的"}]},{"pos":"adv","words":[{"hwd":"perfectly","tran":"完美地；完全地；无瑕疵地"}]},{"pos":"n","words":[{"hwd":"perfection","tran":"完善；完美"},{"hwd":"perfectionist","tran":"完美主义者，追求完美的人；至善论者"},{"hwd":"perfectionism","tran":"至善论；十全十美主义"},{"hwd":"perfectibility","tran":"完全性；可改善性；可完美性"},{"hwd":"perfective","tran":"完成式；完成式的动词"}]}]},"usspeech":"perfect&type=2","trans":[{"tranCn":"完美的；完全的","descOther":"英释","pos":"adj","descCn":"中释","tranOther":"not having any mistakes, faults, or damage"},{"tranCn":"使完美","descOther":"英释","pos":"v","descCn":"中释","tranOther":"to make something as good as you are able to"}]}}}
     * bookId : KaoYanluan_1
     */

    private int wordRank;
    private String headWord;
    private JsonObject content;
    private String bookId;

    public int getWordRank() {
        return wordRank;
    }

    public void setWordRank(int wordRank) {
        this.wordRank = wordRank;
    }

    public String getHeadWord() {
        return headWord;
    }

    public void setHeadWord(String headWord) {
        this.headWord = headWord;
    }

    public JsonObject getContent() {
        return content;
    }

    public void setContent(JsonObject content) {
        this.content = content;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public static class ContentBeanX {
        /**
         * word : {"wordHead":"perfect","wordId":"KaoYanluan_1_69","content":{"sentence":{"sentences":[{"sContent":"His English was perfect.","sCn":"他的英语很地道。"},{"sContent":"The car was in perfect condition.","sCn":"这辆车的车况极佳。"},{"sContent":"You\u2019re very lucky to have perfect teeth.","sCn":"你能拥有一口完美的牙齿太幸运了。"},{"sContent":"a perfect performance","sCn":"完美的演出"},{"sContent":"In a perfect world, we wouldn\u2019t need an army.","sCn":"在理想世界中，我们不需要军队。"},{"sContent":"I don't know him\u2014he's a perfect stranger.","sCn":"我不认识他,他是百分之百的陌生人。"},{"sContent":"Mock trials help students perfect their legal skills.","sCn":"模拟庭审有助于学生们完善自己的法律技能。"}],"desc":"例句"},"usphone":"ˈpɝfɪkt; (for v.) pɝˈfɛkt","syno":{"synos":[{"pos":"adj","tran":"完美的；最好的；精通的","hwds":[{"w":"greatest"},{"w":"ideal"},{"w":"prime"},{"w":"best"},{"w":"full"}]},{"pos":"vt","tran":"使完美；使熟练","hwds":[{"w":"round off"},{"w":"polish up"}]}],"desc":"同近"},"ukphone":"ˈpəːfɪkt; (for v.) pəˈfekt","ukspeech":"perfect&type=1","star":0,"phrase":{"phrases":[{"pContent":"perfect oneself in","pCn":"精通；熟练；完全掌握"},{"pContent":"perfect for","pCn":"应用范围；对\u2026是完美的"},{"pContent":"perfect harmony","pCn":"水乳交融；完美无谐波；十分和谐"},{"pContent":"perfect market","pCn":"完全市场"},{"pContent":"perfect man","pCn":"完美无缺的人"},{"pContent":"perfect day","pCn":"天气极好"},{"pContent":"perfect balance","pCn":"理想均衡"},{"pContent":"perfect condition","pCn":"理想状态"},{"pContent":"present perfect","pCn":"[语]现在完成时"},{"pContent":"perfect competition","pCn":"完全（自由）竞争"},{"pContent":"perfect circle","pCn":"完整的圆圈；正圆"},{"pContent":"perfect state","pCn":"理想状态"},{"pContent":"perfect form","pCn":"完成式；完全型；正确几何形状"},{"pContent":"perfect gas","pCn":"理想气体；完美气体"},{"pContent":"present perfect tense","pCn":"现在完成式"},{"pContent":"perfect stranger","pCn":"完全不认识的人"},{"pContent":"perfect weather","pCn":"极好的天气"},{"pContent":"past perfect","pCn":"（动词的）过去完成时"},{"pContent":"perfect number","pCn":"完全数"},{"pContent":"past perfect tense","pCn":"过去完成时"}],"desc":"短语"},"phone":"'pə:fikt, pə'fekt","speech":"perfect","relWord":{"desc":"同根","rels":[{"pos":"adj","words":[{"hwd":"perfectible","tran":"可完成的；可使完美的"},{"hwd":"perfective","tran":"完成的；完成式的"}]},{"pos":"adv","words":[{"hwd":"perfectly","tran":"完美地；完全地；无瑕疵地"}]},{"pos":"n","words":[{"hwd":"perfection","tran":"完善；完美"},{"hwd":"perfectionist","tran":"完美主义者，追求完美的人；至善论者"},{"hwd":"perfectionism","tran":"至善论；十全十美主义"},{"hwd":"perfectibility","tran":"完全性；可改善性；可完美性"},{"hwd":"perfective","tran":"完成式；完成式的动词"}]}]},"usspeech":"perfect&type=2","trans":[{"tranCn":"完美的；完全的","descOther":"英释","pos":"adj","descCn":"中释","tranOther":"not having any mistakes, faults, or damage"},{"tranCn":"使完美","descOther":"英释","pos":"v","descCn":"中释","tranOther":"to make something as good as you are able to"}]}}
         */

        private JsonObject word;

        public JsonObject getWord() {
            return word;
        }

        public void setWord(JsonObject word) {
            this.word = word;
        }

        public static class WordBean {
            /**
             * wordHead : perfect
             * wordId : KaoYanluan_1_69
             * content : {"sentence":{"sentences":[{"sContent":"His English was perfect.","sCn":"他的英语很地道。"},{"sContent":"The car was in perfect condition.","sCn":"这辆车的车况极佳。"},{"sContent":"You\u2019re very lucky to have perfect teeth.","sCn":"你能拥有一口完美的牙齿太幸运了。"},{"sContent":"a perfect performance","sCn":"完美的演出"},{"sContent":"In a perfect world, we wouldn\u2019t need an army.","sCn":"在理想世界中，我们不需要军队。"},{"sContent":"I don't know him\u2014he's a perfect stranger.","sCn":"我不认识他,他是百分之百的陌生人。"},{"sContent":"Mock trials help students perfect their legal skills.","sCn":"模拟庭审有助于学生们完善自己的法律技能。"}],"desc":"例句"},"usphone":"ˈpɝfɪkt; (for v.) pɝˈfɛkt","syno":{"synos":[{"pos":"adj","tran":"完美的；最好的；精通的","hwds":[{"w":"greatest"},{"w":"ideal"},{"w":"prime"},{"w":"best"},{"w":"full"}]},{"pos":"vt","tran":"使完美；使熟练","hwds":[{"w":"round off"},{"w":"polish up"}]}],"desc":"同近"},"ukphone":"ˈpəːfɪkt; (for v.) pəˈfekt","ukspeech":"perfect&type=1","star":0,"phrase":{"phrases":[{"pContent":"perfect oneself in","pCn":"精通；熟练；完全掌握"},{"pContent":"perfect for","pCn":"应用范围；对\u2026是完美的"},{"pContent":"perfect harmony","pCn":"水乳交融；完美无谐波；十分和谐"},{"pContent":"perfect market","pCn":"完全市场"},{"pContent":"perfect man","pCn":"完美无缺的人"},{"pContent":"perfect day","pCn":"天气极好"},{"pContent":"perfect balance","pCn":"理想均衡"},{"pContent":"perfect condition","pCn":"理想状态"},{"pContent":"present perfect","pCn":"[语]现在完成时"},{"pContent":"perfect competition","pCn":"完全（自由）竞争"},{"pContent":"perfect circle","pCn":"完整的圆圈；正圆"},{"pContent":"perfect state","pCn":"理想状态"},{"pContent":"perfect form","pCn":"完成式；完全型；正确几何形状"},{"pContent":"perfect gas","pCn":"理想气体；完美气体"},{"pContent":"present perfect tense","pCn":"现在完成式"},{"pContent":"perfect stranger","pCn":"完全不认识的人"},{"pContent":"perfect weather","pCn":"极好的天气"},{"pContent":"past perfect","pCn":"（动词的）过去完成时"},{"pContent":"perfect number","pCn":"完全数"},{"pContent":"past perfect tense","pCn":"过去完成时"}],"desc":"短语"},"phone":"'pə:fikt, pə'fekt","speech":"perfect","relWord":{"desc":"同根","rels":[{"pos":"adj","words":[{"hwd":"perfectible","tran":"可完成的；可使完美的"},{"hwd":"perfective","tran":"完成的；完成式的"}]},{"pos":"adv","words":[{"hwd":"perfectly","tran":"完美地；完全地；无瑕疵地"}]},{"pos":"n","words":[{"hwd":"perfection","tran":"完善；完美"},{"hwd":"perfectionist","tran":"完美主义者，追求完美的人；至善论者"},{"hwd":"perfectionism","tran":"至善论；十全十美主义"},{"hwd":"perfectibility","tran":"完全性；可改善性；可完美性"},{"hwd":"perfective","tran":"完成式；完成式的动词"}]}]},"usspeech":"perfect&type=2","trans":[{"tranCn":"完美的；完全的","descOther":"英释","pos":"adj","descCn":"中释","tranOther":"not having any mistakes, faults, or damage"},{"tranCn":"使完美","descOther":"英释","pos":"v","descCn":"中释","tranOther":"to make something as good as you are able to"}]}
             */

            private String wordHead;
            private String wordId;
            private ContentBean content;

            public String getWordHead() {
                return wordHead;
            }

            public void setWordHead(String wordHead) {
                this.wordHead = wordHead;
            }

            public String getWordId() {
                return wordId;
            }

            public void setWordId(String wordId) {
                this.wordId = wordId;
            }

            public ContentBean getContent() {
                return content;
            }

            public void setContent(ContentBean content) {
                this.content = content;
            }

            public static class ContentBean {
                /**
                 * sentence : {"sentences":[{"sContent":"His English was perfect.","sCn":"他的英语很地道。"},{"sContent":"The car was in perfect condition.","sCn":"这辆车的车况极佳。"},{"sContent":"You\u2019re very lucky to have perfect teeth.","sCn":"你能拥有一口完美的牙齿太幸运了。"},{"sContent":"a perfect performance","sCn":"完美的演出"},{"sContent":"In a perfect world, we wouldn\u2019t need an army.","sCn":"在理想世界中，我们不需要军队。"},{"sContent":"I don't know him\u2014he's a perfect stranger.","sCn":"我不认识他,他是百分之百的陌生人。"},{"sContent":"Mock trials help students perfect their legal skills.","sCn":"模拟庭审有助于学生们完善自己的法律技能。"}],"desc":"例句"}
                 * usphone : ˈpɝfɪkt; (for v.) pɝˈfɛkt
                 * syno : {"synos":[{"pos":"adj","tran":"完美的；最好的；精通的","hwds":[{"w":"greatest"},{"w":"ideal"},{"w":"prime"},{"w":"best"},{"w":"full"}]},{"pos":"vt","tran":"使完美；使熟练","hwds":[{"w":"round off"},{"w":"polish up"}]}],"desc":"同近"}
                 * ukphone : ˈpəːfɪkt; (for v.) pəˈfekt
                 * ukspeech : perfect&type=1
                 * star : 0
                 * phrase : {"phrases":[{"pContent":"perfect oneself in","pCn":"精通；熟练；完全掌握"},{"pContent":"perfect for","pCn":"应用范围；对\u2026是完美的"},{"pContent":"perfect harmony","pCn":"水乳交融；完美无谐波；十分和谐"},{"pContent":"perfect market","pCn":"完全市场"},{"pContent":"perfect man","pCn":"完美无缺的人"},{"pContent":"perfect day","pCn":"天气极好"},{"pContent":"perfect balance","pCn":"理想均衡"},{"pContent":"perfect condition","pCn":"理想状态"},{"pContent":"present perfect","pCn":"[语]现在完成时"},{"pContent":"perfect competition","pCn":"完全（自由）竞争"},{"pContent":"perfect circle","pCn":"完整的圆圈；正圆"},{"pContent":"perfect state","pCn":"理想状态"},{"pContent":"perfect form","pCn":"完成式；完全型；正确几何形状"},{"pContent":"perfect gas","pCn":"理想气体；完美气体"},{"pContent":"present perfect tense","pCn":"现在完成式"},{"pContent":"perfect stranger","pCn":"完全不认识的人"},{"pContent":"perfect weather","pCn":"极好的天气"},{"pContent":"past perfect","pCn":"（动词的）过去完成时"},{"pContent":"perfect number","pCn":"完全数"},{"pContent":"past perfect tense","pCn":"过去完成时"}],"desc":"短语"}
                 * phone : 'pə:fikt, pə'fekt
                 * speech : perfect
                 * relWord : {"desc":"同根","rels":[{"pos":"adj","words":[{"hwd":"perfectible","tran":"可完成的；可使完美的"},{"hwd":"perfective","tran":"完成的；完成式的"}]},{"pos":"adv","words":[{"hwd":"perfectly","tran":"完美地；完全地；无瑕疵地"}]},{"pos":"n","words":[{"hwd":"perfection","tran":"完善；完美"},{"hwd":"perfectionist","tran":"完美主义者，追求完美的人；至善论者"},{"hwd":"perfectionism","tran":"至善论；十全十美主义"},{"hwd":"perfectibility","tran":"完全性；可改善性；可完美性"},{"hwd":"perfective","tran":"完成式；完成式的动词"}]}]}
                 * usspeech : perfect&type=2
                 * trans : [{"tranCn":"完美的；完全的","descOther":"英释","pos":"adj","descCn":"中释","tranOther":"not having any mistakes, faults, or damage"},{"tranCn":"使完美","descOther":"英释","pos":"v","descCn":"中释","tranOther":"to make something as good as you are able to"}]
                 */

                private SentenceBean sentence;
                private String usphone;
                private SynoBean syno;
                private String ukphone;
                private String ukspeech;
                private int star;
                private PhraseBean phrase;
                private String phone;
                private String speech;
                private RelWordBean relWord;
                private String usspeech;
                private List<TransBean> trans;

                public SentenceBean getSentence() {
                    return sentence;
                }

                public void setSentence(SentenceBean sentence) {
                    this.sentence = sentence;
                }

                public String getUsphone() {
                    return usphone;
                }

                public void setUsphone(String usphone) {
                    this.usphone = usphone;
                }

                public SynoBean getSyno() {
                    return syno;
                }

                public void setSyno(SynoBean syno) {
                    this.syno = syno;
                }

                public String getUkphone() {
                    return ukphone;
                }

                public void setUkphone(String ukphone) {
                    this.ukphone = ukphone;
                }

                public String getUkspeech() {
                    return ukspeech;
                }

                public void setUkspeech(String ukspeech) {
                    this.ukspeech = ukspeech;
                }

                public int getStar() {
                    return star;
                }

                public void setStar(int star) {
                    this.star = star;
                }

                public PhraseBean getPhrase() {
                    return phrase;
                }

                public void setPhrase(PhraseBean phrase) {
                    this.phrase = phrase;
                }

                public String getPhone() {
                    return phone;
                }

                public void setPhone(String phone) {
                    this.phone = phone;
                }

                public String getSpeech() {
                    return speech;
                }

                public void setSpeech(String speech) {
                    this.speech = speech;
                }

                public RelWordBean getRelWord() {
                    return relWord;
                }

                public void setRelWord(RelWordBean relWord) {
                    this.relWord = relWord;
                }

                public String getUsspeech() {
                    return usspeech;
                }

                public void setUsspeech(String usspeech) {
                    this.usspeech = usspeech;
                }

                public List<TransBean> getTrans() {
                    return trans;
                }

                public void setTrans(List<TransBean> trans) {
                    this.trans = trans;
                }

                public static class SentenceBean {
                    /**
                     * sentences : [{"sContent":"His English was perfect.","sCn":"他的英语很地道。"},{"sContent":"The car was in perfect condition.","sCn":"这辆车的车况极佳。"},{"sContent":"You\u2019re very lucky to have perfect teeth.","sCn":"你能拥有一口完美的牙齿太幸运了。"},{"sContent":"a perfect performance","sCn":"完美的演出"},{"sContent":"In a perfect world, we wouldn\u2019t need an army.","sCn":"在理想世界中，我们不需要军队。"},{"sContent":"I don't know him\u2014he's a perfect stranger.","sCn":"我不认识他,他是百分之百的陌生人。"},{"sContent":"Mock trials help students perfect their legal skills.","sCn":"模拟庭审有助于学生们完善自己的法律技能。"}]
                     * desc : 例句
                     */

                    private String desc;
                    private List<SentencesBean> sentences;

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }

                    public List<SentencesBean> getSentences() {
                        return sentences;
                    }

                    public void setSentences(List<SentencesBean> sentences) {
                        this.sentences = sentences;
                    }

                    public static class SentencesBean {
                        /**
                         * sContent : His English was perfect.
                         * sCn : 他的英语很地道。
                         */

                        private String sContent;
                        private String sCn;

                        public String getSContent() {
                            return sContent;
                        }

                        public void setSContent(String sContent) {
                            this.sContent = sContent;
                        }

                        public String getSCn() {
                            return sCn;
                        }

                        public void setSCn(String sCn) {
                            this.sCn = sCn;
                        }
                    }
                }

                public static class SynoBean {
                    /**
                     * synos : [{"pos":"adj","tran":"完美的；最好的；精通的","hwds":[{"w":"greatest"},{"w":"ideal"},{"w":"prime"},{"w":"best"},{"w":"full"}]},{"pos":"vt","tran":"使完美；使熟练","hwds":[{"w":"round off"},{"w":"polish up"}]}]
                     * desc : 同近
                     */

                    private String desc;
                    private List<SynosBean> synos;

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }

                    public List<SynosBean> getSynos() {
                        return synos;
                    }

                    public void setSynos(List<SynosBean> synos) {
                        this.synos = synos;
                    }

                    public static class SynosBean {
                        /**
                         * pos : adj
                         * tran : 完美的；最好的；精通的
                         * hwds : [{"w":"greatest"},{"w":"ideal"},{"w":"prime"},{"w":"best"},{"w":"full"}]
                         */

                        private String pos;
                        private String tran;
                        private List<HwdsBean> hwds;

                        public String getPos() {
                            return pos;
                        }

                        public void setPos(String pos) {
                            this.pos = pos;
                        }

                        public String getTran() {
                            return tran;
                        }

                        public void setTran(String tran) {
                            this.tran = tran;
                        }

                        public List<HwdsBean> getHwds() {
                            return hwds;
                        }

                        public void setHwds(List<HwdsBean> hwds) {
                            this.hwds = hwds;
                        }

                        public static class HwdsBean {
                            /**
                             * w : greatest
                             */

                            private String w;

                            public String getW() {
                                return w;
                            }

                            public void setW(String w) {
                                this.w = w;
                            }
                        }
                    }
                }

                public static class PhraseBean {
                    /**
                     * phrases : [{"pContent":"perfect oneself in","pCn":"精通；熟练；完全掌握"},{"pContent":"perfect for","pCn":"应用范围；对\u2026是完美的"},{"pContent":"perfect harmony","pCn":"水乳交融；完美无谐波；十分和谐"},{"pContent":"perfect market","pCn":"完全市场"},{"pContent":"perfect man","pCn":"完美无缺的人"},{"pContent":"perfect day","pCn":"天气极好"},{"pContent":"perfect balance","pCn":"理想均衡"},{"pContent":"perfect condition","pCn":"理想状态"},{"pContent":"present perfect","pCn":"[语]现在完成时"},{"pContent":"perfect competition","pCn":"完全（自由）竞争"},{"pContent":"perfect circle","pCn":"完整的圆圈；正圆"},{"pContent":"perfect state","pCn":"理想状态"},{"pContent":"perfect form","pCn":"完成式；完全型；正确几何形状"},{"pContent":"perfect gas","pCn":"理想气体；完美气体"},{"pContent":"present perfect tense","pCn":"现在完成式"},{"pContent":"perfect stranger","pCn":"完全不认识的人"},{"pContent":"perfect weather","pCn":"极好的天气"},{"pContent":"past perfect","pCn":"（动词的）过去完成时"},{"pContent":"perfect number","pCn":"完全数"},{"pContent":"past perfect tense","pCn":"过去完成时"}]
                     * desc : 短语
                     */

                    private String desc;
                    private List<PhrasesBean> phrases;

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }

                    public List<PhrasesBean> getPhrases() {
                        return phrases;
                    }

                    public void setPhrases(List<PhrasesBean> phrases) {
                        this.phrases = phrases;
                    }

                    public static class PhrasesBean {
                        /**
                         * pContent : perfect oneself in
                         * pCn : 精通；熟练；完全掌握
                         */

                        private String pContent;
                        private String pCn;

                        public String getPContent() {
                            return pContent;
                        }

                        public void setPContent(String pContent) {
                            this.pContent = pContent;
                        }

                        public String getPCn() {
                            return pCn;
                        }

                        public void setPCn(String pCn) {
                            this.pCn = pCn;
                        }
                    }
                }

                public static class RelWordBean {
                    /**
                     * desc : 同根
                     * rels : [{"pos":"adj","words":[{"hwd":"perfectible","tran":"可完成的；可使完美的"},{"hwd":"perfective","tran":"完成的；完成式的"}]},{"pos":"adv","words":[{"hwd":"perfectly","tran":"完美地；完全地；无瑕疵地"}]},{"pos":"n","words":[{"hwd":"perfection","tran":"完善；完美"},{"hwd":"perfectionist","tran":"完美主义者，追求完美的人；至善论者"},{"hwd":"perfectionism","tran":"至善论；十全十美主义"},{"hwd":"perfectibility","tran":"完全性；可改善性；可完美性"},{"hwd":"perfective","tran":"完成式；完成式的动词"}]}]
                     */

                    private String desc;
                    private List<RelsBean> rels;

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }

                    public List<RelsBean> getRels() {
                        return rels;
                    }

                    public void setRels(List<RelsBean> rels) {
                        this.rels = rels;
                    }

                    public static class RelsBean {
                        /**
                         * pos : adj
                         * words : [{"hwd":"perfectible","tran":"可完成的；可使完美的"},{"hwd":"perfective","tran":"完成的；完成式的"}]
                         */

                        private String pos;
                        private List<WordsBean> words;

                        public String getPos() {
                            return pos;
                        }

                        public void setPos(String pos) {
                            this.pos = pos;
                        }

                        public List<WordsBean> getWords() {
                            return words;
                        }

                        public void setWords(List<WordsBean> words) {
                            this.words = words;
                        }

                        public static class WordsBean {
                            /**
                             * hwd : perfectible
                             * tran : 可完成的；可使完美的
                             */

                            private String hwd;
                            private String tran;

                            public String getHwd() {
                                return hwd;
                            }

                            public void setHwd(String hwd) {
                                this.hwd = hwd;
                            }

                            public String getTran() {
                                return tran;
                            }

                            public void setTran(String tran) {
                                this.tran = tran;
                            }
                        }
                    }
                }

                public static class TransBean {
                    /**
                     * tranCn : 完美的；完全的
                     * descOther : 英释
                     * pos : adj
                     * descCn : 中释
                     * tranOther : not having any mistakes, faults, or damage
                     */

                    private String tranCn;
                    private String descOther;
                    private String pos;
                    private String descCn;
                    private String tranOther;

                    public String getTranCn() {
                        return tranCn;
                    }

                    public void setTranCn(String tranCn) {
                        this.tranCn = tranCn;
                    }

                    public String getDescOther() {
                        return descOther;
                    }

                    public void setDescOther(String descOther) {
                        this.descOther = descOther;
                    }

                    public String getPos() {
                        return pos;
                    }

                    public void setPos(String pos) {
                        this.pos = pos;
                    }

                    public String getDescCn() {
                        return descCn;
                    }

                    public void setDescCn(String descCn) {
                        this.descCn = descCn;
                    }

                    public String getTranOther() {
                        return tranOther;
                    }

                    public void setTranOther(String tranOther) {
                        this.tranOther = tranOther;
                    }
                }
            }
        }
    }
}
