package jp.ac.uryukyu.ie.e175753;
import java.util.Scanner;
public class Question {
    Scanner in = new Scanner(System.in);
    private double point;
    private int ques;
    private int qtmath;
    private int qfmath;
    private int qrmath;
    private String[] qcontent;
    private String[] reply;
    /*コンストラクタ　引数quesは質問内容が代入されている配列。replyは診断結果の答えの配列。
    qrmathは分岐までの問題数.qtmathは分岐①,qfmathは分岐②の問題数.
    それらを全てをフィールド変数に代入する.*/
    public Question(String[] ques,String[] reply,int qrmath,int qtmath,int qfmath){
        this.ques = ques.length;
        this.qrmath = qrmath;
        this.qtmath=qtmath;
        this.qfmath=qfmath;
        qcontent = new String[this.ques];
        this.reply = new String[8];
        for (int i = 0;i<this.ques;i++){
            this.qcontent[i] = ques[i];
        }
        for (int i = 0;i<8;i++){
            this.reply[i] = reply[i];
        }

    }
    /*問題文を出力し答えの入力を促す文を出力する.引数は問題の特定のルートの名前が入る.
    branchは分岐前,trueは分岐①,falseは分岐②の問題を出力する。また診断結果の答えをポイントに基づき出力する。
     */
    public void Ask(String number) {
        if (number == "branch") {
            for (int i = 0; i < qrmath; i++) {
                System.out.println("\n" + qcontent[i]);
                System.out.println("\n1から4までの数字で答えてね😃");
                counter();
            }
            if(point<0){
                Ask("true");
            }else if(point>=0){
                Ask("false");
            }
        } else if (number == "true") {
            point = 0;
            for (int i = qrmath; i < qtmath + qrmath; i++) {
                System.out.println("\n" + qcontent[i]);
                System.out.println("\n1から4までの数字で答えてね😌");
                counter();
            }
            if(point>qtmath/2){
                System.out.println(reply[0]);
            }else if (point<=qtmath/2&&point>0){
                System.out.println(reply[1]);
            } else if (point <= 0 && point > qtmath / -2) {
                System.out.println(reply[2]);
            }else {
                System.out.println(reply[3]);
            }

        }
            else if (number == "false") {
                point = 0;
                for (int i = qtmath + qrmath; i < ques; i++) {
                    System.out.println("\n" + qcontent[i]);
                    System.out.println("\n1から4までの数字で答えてね😒");
                    counter();
                }
            if(point>qfmath/2){
                System.out.println(reply[4]);
            }else if (point<=qfmath/2&&point>0){
                System.out.println(reply[5]);
            } else if (point <= 0 && point > qfmath / -2) {
                System.out.println(reply[6]);
            }else {
                System.out.println(reply[7]);
            }
            }
        }
        //入力された値を確認しポイントの加減を行う。不適当な回答の場合ちゃんと打つことを促しもう一度回答させる。
        public void counter() {
            while (true) {
                int input = in.nextInt();
                if (input == 1) {
                    point += 1;
                    break;
                } else if (input == 2) {
                    point += 0.5;
                    break;
                } else if (input == 3) {
                    point -= 0.5;
                    break;
                } else if (input == 4) {
                    point -= 1;
                    break;
                } else {
                    System.out.println("落ち着いて打ってね😉");
                }
            }
        }

//セッターゲッター
    public int getQues() { return ques; }
    public void setQues(int ques){this.ques=ques;}
    public int getQrmath(){
        return qrmath;
    }
    public void setQrmath(int qrmath){this.qrmath=qrmath;}
    public int getQtmath(){
        return qtmath;
    }
    public void setQtmath(int qtmath){this.qtmath=qtmath;}
    public int getQfmath(){
        return qfmath;
    }
    public void setQfmath(int qfmath){this.qfmath=qfmath;}
    public String[] getQcontent() {
        return qcontent;
    }
    public void setQcontent(String[] qcontent){this.qcontent=qcontent;}
    public String[] getReply() {
        return reply;
    }
    public void setReply(String[] reply){this.reply=reply;}
}
