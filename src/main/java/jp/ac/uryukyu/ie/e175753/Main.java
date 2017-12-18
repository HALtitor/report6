package jp.ac.uryukyu.ie.e175753;

public class Main {
    /*精神診断ツール
    特定の精神の病であるかどうか判別し
    病気であると判断した場合,症状の重さを測る。→分岐①
    健常者と判断した場合,その病についての理解度を調べる。→分岐②

　　答えによって加減するポイント制度になっており、それを元に分岐,判別を行う。
   分岐①②それぞれ4つの答えを用意し、最終的にポイントから判別し診断の答えを返す。
     */
    public static void main(String[] args){
        /*uesは質問内容が代入されている配列
        質問内容の原則(・分岐前,分岐①,分岐②の順で代入する。

        ・一問の問題数は４問とし問の前半と後半の内容は対象に別れるようにする。また「良い状態」から代入するようにする。
        　　　　　　　　　例　◎　朝ご飯をいつも食べる　　
        　　　　　　　　　　　○　朝ごはんをしばしば食べる
        　　　　　　　　　　　△　朝ごはんをあまり食べない
        　　　　　　　　　　　×　朝ごはんを全く食べない　　　　　　　　　　　　　　　　　　　).
　　　　　
　　　　　Replyは診断後の答えの文章を代入する。原則として分岐①の「良い状態」の答えから順に代入する。
        Qrmathは分岐までの問題数. Qtmathは分岐①,Qfmathは分岐②の問題数.
        */
        String[] Ques = {"x\ny\nz\na","y\ny\nz\na","y\ny\nz\na","re\ny\nz\na","x\ny\nz\na","x\ny\nz\na","x\ny\nz\na","x\ny\nz\na",
                "x\ny\nz\na","tt\ny\nz\na",
                "x\ny\nz\na","x\ny\nz\na","x\ny\nz\na","x\ny\nz\na"};
        String[] Reply = {"a","b","c","d","e","f","g","h"};
        int Qrmath = 2;
        int Qtmath = 6;
        int Qfmath = 6;
        Question Qtion = new Question(Ques,Reply,Qrmath,Qtmath,Qfmath);
        Qtion.Ask("branch");

    }
}