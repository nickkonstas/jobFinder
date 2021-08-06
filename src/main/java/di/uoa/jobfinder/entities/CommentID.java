package di.uoa.jobfinder.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
class CommentID implements Serializable {
    @Column(name = "user_id")
    private Long UserID;

    @Column(name = "post_id")
    private Long PostID;

    public Long getUserID() {
        return UserID;
    }

    public void setUserID(Long userID) {
        UserID = userID;
    }

    public Long getPostID() {
        return PostID;
    }

    public void setPostID(Long postID) {
        PostID = postID;
    }
}
