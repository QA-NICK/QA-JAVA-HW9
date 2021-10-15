package domain;

public class RepostsInfo {
    private int count;
    private boolean userReposted;

    public void setUserReposted(boolean userReposted) {
        this.userReposted = userReposted;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isUserReposted() {
        return userReposted;
    }

    public int getCount() {
        return count;
    }
}
