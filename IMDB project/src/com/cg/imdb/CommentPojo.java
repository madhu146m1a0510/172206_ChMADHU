package com.cg.imdb;

public class CommentPojo {
String comments;

public CommentPojo(String comments) {
	super();
	this.comments = comments;
}

public String getComments() {
	return comments;
}

public void setComments(String comments) {
	this.comments = comments;
}

@Override
public String toString() {
	return "CommentPojo [comments=" + comments + "]";
}

}
