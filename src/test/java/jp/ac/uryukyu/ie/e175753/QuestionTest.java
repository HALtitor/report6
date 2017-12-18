package jp.ac.uryukyu.ie.e175753;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {
    @Test
    void ask() {
        String[] Ques = {"x\ny\nz\na","x\ny\nz\na","re\ny\nz\na",
                "x\ny\nz\na","tt\ny\nz\na", "x\ny\nz\na"};
        for(int i=0;i<3;i++){
            System.out.println("\n"+Ques[i]);
            System.out.println("\n1から4までの数字で答えてね.");
        }
        for(int i=3;i<6;i++){
            System.out.println("\n"+Ques[i]);
            System.out.println("\n1から4までの数字で答えてね.");
        }
        System.out.println(2/-2);
    }
    @Test
    void counter(){
        int i =0;
        //三文でbreak
        while(true){
            i++;
            if(i==4){
                break;
            }else {
                System.out.println("まだやで");
            }
        }
    }

}