package com.db.employeemood.response;

import javax.persistence.EntityResult;
import javax.persistence.FieldResult;
import javax.persistence.SqlResultSetMapping;

@SqlResultSetMapping(
name = "HashtagCount",
entities = {
@EntityResult(
entityClass = HashtagCount.class, // The name of the class 
fields = {
@FieldResult(name = "hashtag", column = "hashtag"),
@FieldResult(name = "count", column = "count")
}
)
}
)
public class HashtagCount {
	private String hashtag;
	private int count;
	public HashtagCount() {
		
	}
	public HashtagCount(String hashtag, int count) {
		super();
		this.hashtag = hashtag;
		this.count = count;
	}
	
	public String getHashtag() {
		return hashtag;
	}
	public void setHashtag(String hashtag) {
		this.hashtag = hashtag;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
