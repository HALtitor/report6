package jp.ac.uryukyu.ie.e175753;

public class Question {
    private String[] Ques;
    public Question(String[] ques){
        int kind = ques.length;
        Ques = new String[kind];
        for (int i = 0;i<kind;i++){
            Ques[i]=ques[i];
        }
    }
    public String getQues(int i) {
        return Ques[i];
    }
}
