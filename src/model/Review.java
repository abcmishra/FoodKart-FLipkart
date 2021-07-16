package model;

import java.util.List;

public class Review {
    private  int id;
    private int rating;
    private List<String> comments;
    public Review(int id,int rating,List<String> comments){
        this.id=id;
        this.rating=rating;
        this.comments=comments;


    }
    public  int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getScore(){
        return rating;
    }
    public void setScore(int rating){
        this.rating=rating;
    }
    public List<String> getComments(){
        return comments;
    }
    public void setComments(List<String> comments){
        this.comments=comments;
    }

}
