package di.uoa.jobfinder.entities;

import javax.persistence.*;

@Entity
public class UpVote {


    @EmbeddedId
    private UpVoteID pk;

    @ManyToOne
    @MapsId("UserID")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @MapsId("PostID")
    @JoinColumn(name = "post_id")
    private Post post;

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

    public Boolean getUpvote() {
        return upvote;
    }

    public void setUpvote(Boolean upvote) {
        this.upvote = upvote;
    }

    private Boolean upvote;

}
