package com.tarhan.springboot.mongoDb.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Document(collection = "comment")
public class Comment {
    private String id;
    private String ofProduct;
    @Temporal(TemporalType.TIMESTAMP)
    private Date commentDate;
    private String productId;
    private String userId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOfProduct() {
        return ofProduct;
    }

    public void setOfProduct(String ofProduct) {
        this.ofProduct = ofProduct;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
