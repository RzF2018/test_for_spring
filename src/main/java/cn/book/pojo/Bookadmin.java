package cn.book.pojo;

public class Bookadmin {
    private Integer bid;

    private String bn;

    private String author;

    private String press;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBn() {
        return bn;
    }

    public void setBn(String bn) {
        this.bn = bn == null ? null : bn.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) { this.press = press == null ? null : press.trim(); }

    @Override
    public String toString() {
        return "[" + "bid:" + bid + " bn:" + bn + " author:" + author + " press:" + press + "]";
    }
}