package com.westcars.stockinfo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "BLT_BULLETIN")
public class BltBulletin {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PUBDATE")
    private Date pubdate;

    @Column(name = "COMCODE")
    private Long comcode;

    @Column(name = "COMNAME")
    private String comname;

    @Column(name = "BULLETIONCATEGORY")
    private Long bulletioncategory;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "CONTENTFORMAT")
    private String contentformat;

    @Column(name = "KEYWORDS")
    private String keywords;

    @Column(name = "ENTRYTIME")
    private Date entrytime;

    @Column(name = "UPDATETIME")
    private Date updatetime;

    @Column(name = "GROUNDTIME")
    private Date groundtime;

    @Column(name = "UPDATEID")
    private Long updateid;

    @Column(name = "RESOURCEID")
    private String resourceid;

    @Column(name = "RECORDID")
    private String recordid;

    @Column(name = "CONTENT")
    private String content;

    /**
     * @return ID
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return PUBDATE
     */
    public Date getPubdate() {
        return pubdate;
    }

    /**
     * @param pubdate
     */
    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }

    /**
     * @return COMCODE
     */
    public Long getComcode() {
        return comcode;
    }

    /**
     * @param comcode
     */
    public void setComcode(Long comcode) {
        this.comcode = comcode;
    }

    /**
     * @return COMNAME
     */
    public String getComname() {
        return comname;
    }

    /**
     * @param comname
     */
    public void setComname(String comname) {
        this.comname = comname;
    }

    /**
     * @return BULLETIONCATEGORY
     */
    public Long getBulletioncategory() {
        return bulletioncategory;
    }

    /**
     * @param bulletioncategory
     */
    public void setBulletioncategory(Long bulletioncategory) {
        this.bulletioncategory = bulletioncategory;
    }

    /**
     * @return TITLE
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return CONTENTFORMAT
     */
    public String getContentformat() {
        return contentformat;
    }

    /**
     * @param contentformat
     */
    public void setContentformat(String contentformat) {
        this.contentformat = contentformat;
    }

    /**
     * @return KEYWORDS
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * @param keywords
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    /**
     * @return ENTRYTIME
     */
    public Date getEntrytime() {
        return entrytime;
    }

    /**
     * @param entrytime
     */
    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }

    /**
     * @return UPDATETIME
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * @param updatetime
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * @return GROUNDTIME
     */
    public Date getGroundtime() {
        return groundtime;
    }

    /**
     * @param groundtime
     */
    public void setGroundtime(Date groundtime) {
        this.groundtime = groundtime;
    }

    /**
     * @return UPDATEID
     */
    public Long getUpdateid() {
        return updateid;
    }

    /**
     * @param updateid
     */
    public void setUpdateid(Long updateid) {
        this.updateid = updateid;
    }

    /**
     * @return RESOURCEID
     */
    public String getResourceid() {
        return resourceid;
    }

    /**
     * @param resourceid
     */
    public void setResourceid(String resourceid) {
        this.resourceid = resourceid;
    }

    /**
     * @return RECORDID
     */
    public String getRecordid() {
        return recordid;
    }

    /**
     * @param recordid
     */
    public void setRecordid(String recordid) {
        this.recordid = recordid;
    }

    /**
     * @return CONTENT
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }
}