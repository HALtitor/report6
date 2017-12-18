package jp.ac.uryukyu.ie.e175753;
import java.util.Scanner;
public class Question {
    Scanner in = new Scanner(System.in);
    private int point=0;
    private int ques;
    private int qtmath;
    private int qfmath;
    private int qrmath;
    private String[] qcontent;
    /*コンストラクタ　引数quesは質問内容が代入されている配列。
    qrmathは分岐までの問題数.qtmathは分岐①,qfmathは分岐②の問題数.
    それらを全てをフィールド変数に代入する.*/
    public Question(String[] ques,int qrmath,int qtmath,int qfmath){
        this.ques = ques.length;
        this.qrmath = qrmath;
        this.qtmath=qtmath;
        this.qfmath=qfmath;
        qcontent = new String[this.ques];
        for (int i = 0;i<this.ques;i++){
            this.qcontent[i] = ques[i];
        }
    }
    /*問題文を出力し答えの入力を促す文を出力する.引数は問題の特定のルートの名前が入る.
    branchは分岐前,trueは分岐①,falseは分岐②の問題を出力する。
     */
    public void Ask(String number) {
        if(number=="branch"){
            for(int i=0;i<qrmath;i++){
                System.out.println("\n"+qcontent[i]);
                System.out.println("\n1から4までの数字で答えてね.");
                String input = in.nextLine();
            }
        }
        else if (number=="true"){
            for(int i=qrmath;i<qtmath+qrmath;i++){
                System.out.println("\n"+qcontent[i]);
                System.out.println("\n1から4までの数字で答えてね.");
                String input = in.nextLine();
            }
        }
        else if(number=="false"){
            for(int i=qtmath+qrmath;i<ques;i++){
                System.out.println("\n"+qcontent[i]);
                System.out.println("\n1から4までの数字で答えてね.");
                String input = in.nextLine();
            }
        }
    }
//セッターゲッター
    public int getQues() {
        return ques;
    }
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
}
