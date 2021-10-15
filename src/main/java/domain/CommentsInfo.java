package domain;

public class CommentsInfo {
    private int count;
    private boolean canPost;
    private boolean canClose;
    private boolean canOpen;
    private int dataOfCom;
    private String text;

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

    public int getDataOfCom() {
        return dataOfCom;
    }

    public void setDataOfCom(int dataOfCom) {
        this.dataOfCom = dataOfCom;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
