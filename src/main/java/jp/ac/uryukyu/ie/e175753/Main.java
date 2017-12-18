package jp.ac.uryukyu.ie.e175753;

public class Main {
    /*精神診断ツール
    特定の精神の病であるかどうか判別し
    病気であると判断した場合,症状の重さを測る。
    健常者と判断した場合,その病についての理解度を調べる。

　　答えによって加減するポイント制度になっており、それを元に分岐,判別を行う。
   一つのルートにつき4つの答えを用意し、最終的にポイントから判別し答えを返す。
     */
    public static void main(String[] args){
        /*quesは質問内容が代入されている配列
        質問内容の原則(・分岐前,分岐①,分岐②の順で代入する。・分岐前の総問題数は奇数とする。

       　　　　　 ・一問の問題数は４問とし問の前半と後半の内容は対象に別れるようにする。
        　　　　　　例　1.過剰に食事をとる。
        　　　　　　　　2.少し多く食事をとる
        　　　　　　　　3.あまり食事をとらない
        　　　　　　　　4.全く食事をとらない　　　　　　　　　　　　　　　　　　　　　　　).

        qmathは一度の出題数.一度の出題数は不動とする.
        qrmathは分岐までの問題数. qtmathは分岐①,qfmathは分岐②の問題数.
        */
        String[] Ques = {"x\ny\nz\na","x\ny\nz\na","re\ny\nz\na","x\ny\nz\na","x\ny\nz\na","x\ny\nz\na","x\ny\nz\na",
                "x\ny\nz\na","tt\ny\nz\na",
                "x\ny\nz\na","x\ny\nz\na","x\ny\nz\na","x\ny\nz\na"};
        int Qmath = 4;
        int Qrmath = 1;
        int Qtmath = 6;
        int Qfmath = 6;
        Question Qtion = new Question(Ques,Qrmath,Qtmath,Qfmath);
        Qtion.Ask("false");

    }
}