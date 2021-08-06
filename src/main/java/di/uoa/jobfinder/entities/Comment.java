package di.uoa.jobfinder.entities;

import javax.persistence.*;

@Entity
public class Comment {
    @EmbeddedId
    private CommentID pk;

    @ManyToOne
    @MapsId("UserID")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @MapsId("PostID")
    @JoinColumn(name = "post_id")
    private Post post;

    private String text;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
