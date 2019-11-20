package com.blog.blogbakend.modals;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;

import java.util.Date;



@Entity
@Table(name = "blogs")
public class blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "blogid")
    private Integer blogid;

    @Column(name = "body", columnDefinition = "TEXT")
    private String body;

    @Column(name = "title", nullable = false )
    private String title;
    @Column(name = "status")
    private String status;


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date", nullable = false, updatable = false)
    @CreationTimestamp
    private Date createDate;

    @ManyToOne
    @JoinColumn(name = "userid", referencedColumnName = "userid", nullable = false)
    private Users user;

    public Integer getBlogid() {
        return blogid;
    }

    public void setBlogid(Integer blogid) {
        this.blogid = blogid;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
