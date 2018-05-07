package com.westcars.stockinfo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "NWS_NEWS")
public class NwsNews {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "MEDIACODE")
    private Long mediacode;

    @Column(name = "MEDIANAME")
    private String medianame;

    @Column(name = "PUBDATE")
    private Date pubdate;

    @Column(name = "WRITINGDATE")
    private Date writingdate;

    @Column(name = "COMCODE")
    private Long comcode;

    @Column(name = "COMNAME")
    private String comname;

    @Column(name = "AUTHORS")
    private String authors;

    @Column(name = "NEWSCATEGORY")
    private Long newscategory;

    @Column(name = "ABSTRACTFORMAT")
    private String abstractformat;

    @Column(name = "SUBTITLE")
    private String subtitle;

    @Column(name = "KEYWORDS")
    private String keywords;

    @Column(name = "REPORTLEVEL")
    private Short reportlevel;

    @Column(name = "REPORTTITLE")
    private String reporttitle;

    @Column(name = "OBJECTCODE")
    private Long objectcode;

    @Column(name = "AREACODE")
    private Long areacode;

    @Column(name = "PROVINCECODE")
    private Long provincecode;

    @Column(name = "CONCLUSION")
    private String conclusion;

    @Column(name = "LINKADDRESS")
    private String linkaddress;

    @Column(name = "INFOLEVEL")
    private Short infolevel;

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

    @Column(name = "ISCOMMENT")
    private Short iscomment;

    @Column(name = "NEWSCOMMENT")
    private String newscomment;

    @Column(name = "SECTORCODE")
    private Long sectorcode;

    @Column(name = "INIPUBDATE")
    private Date inipubdate;

    @Column(name = "TITLELABEL")
    private String titlelabel;

    @Column(name = "ISPICTURENEWS")
    private String ispicturenews;

    @Column(name = "SYNSTATE")
    private Long synstate;

    @Column(name = "ABSTRACT")
    private String Abstract;

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
     * @return MEDIACODE
     */
    public Long getMediacode() {
        return mediacode;
    }

    /**
     * @param mediacode
     */
    public void setMediacode(Long mediacode) {
        this.mediacode = mediacode;
    }

    /**
     * @return MEDIANAME
     */
    public String getMedianame() {
        return medianame;
    }

    /**
     * @param medianame
     */
    public void setMedianame(String medianame) {
        this.medianame = medianame;
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
     * @return WRITINGDATE
     */
    public Date getWritingdate() {
        return writingdate;
    }

    /**
     * @param writingdate
     */
    public void setWritingdate(Date writingdate) {
        this.writingdate = writingdate;
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
     * @return AUTHORS
     */
    public String getAuthors() {
        return authors;
    }

    /**
     * @param authors
     */
    public void setAuthors(String authors) {
        this.authors = authors;
    }

    /**
     * @return NEWSCATEGORY
     */
    public Long getNewscategory() {
        return newscategory;
    }

    /**
     * @param newscategory
     */
    public void setNewscategory(Long newscategory) {
        this.newscategory = newscategory;
    }

    /**
     * @return ABSTRACTFORMAT
     */
    public String getAbstractformat() {
        return abstractformat;
    }

    /**
     * @param abstractformat
     */
    public void setAbstractformat(String abstractformat) {
        this.abstractformat = abstractformat;
    }

    /**
     * @return SUBTITLE
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * @param subtitle
     */
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
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
     * @return REPORTLEVEL
     */
    public Short getReportlevel() {
        return reportlevel;
    }

    /**
     * @param reportlevel
     */
    public void setReportlevel(Short reportlevel) {
        this.reportlevel = reportlevel;
    }

    /**
     * @return REPORTTITLE
     */
    public String getReporttitle() {
        return reporttitle;
    }

    /**
     * @param reporttitle
     */
    public void setReporttitle(String reporttitle) {
        this.reporttitle = reporttitle;
    }

    /**
     * @return OBJECTCODE
     */
    public Long getObjectcode() {
        return objectcode;
    }

    /**
     * @param objectcode
     */
    public void setObjectcode(Long objectcode) {
        this.objectcode = objectcode;
    }

    /**
     * @return AREACODE
     */
    public Long getAreacode() {
        return areacode;
    }

    /**
     * @param areacode
     */
    public void setAreacode(Long areacode) {
        this.areacode = areacode;
    }

    /**
     * @return PROVINCECODE
     */
    public Long getProvincecode() {
        return provincecode;
    }

    /**
     * @param provincecode
     */
    public void setProvincecode(Long provincecode) {
        this.provincecode = provincecode;
    }

    /**
     * @return CONCLUSION
     */
    public String getConclusion() {
        return conclusion;
    }

    /**
     * @param conclusion
     */
    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    /**
     * @return LINKADDRESS
     */
    public String getLinkaddress() {
        return linkaddress;
    }

    /**
     * @param linkaddress
     */
    public void setLinkaddress(String linkaddress) {
        this.linkaddress = linkaddress;
    }

    /**
     * @return INFOLEVEL
     */
    public Short getInfolevel() {
        return infolevel;
    }

    /**
     * @param infolevel
     */
    public void setInfolevel(Short infolevel) {
        this.infolevel = infolevel;
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
     * @return ISCOMMENT
     */
    public Short getIscomment() {
        return iscomment;
    }

    /**
     * @param iscomment
     */
    public void setIscomment(Short iscomment) {
        this.iscomment = iscomment;
    }

    /**
     * @return NEWSCOMMENT
     */
    public String getNewscomment() {
        return newscomment;
    }

    /**
     * @param newscomment
     */
    public void setNewscomment(String newscomment) {
        this.newscomment = newscomment;
    }

    /**
     * @return SECTORCODE
     */
    public Long getSectorcode() {
        return sectorcode;
    }

    /**
     * @param sectorcode
     */
    public void setSectorcode(Long sectorcode) {
        this.sectorcode = sectorcode;
    }

    /**
     * @return INIPUBDATE
     */
    public Date getInipubdate() {
        return inipubdate;
    }

    /**
     * @param inipubdate
     */
    public void setInipubdate(Date inipubdate) {
        this.inipubdate = inipubdate;
    }

    /**
     * @return TITLELABEL
     */
    public String getTitlelabel() {
        return titlelabel;
    }

    /**
     * @param titlelabel
     */
    public void setTitlelabel(String titlelabel) {
        this.titlelabel = titlelabel;
    }

    /**
     * @return ISPICTURENEWS
     */
    public String getIspicturenews() {
        return ispicturenews;
    }

    /**
     * @param ispicturenews
     */
    public void setIspicturenews(String ispicturenews) {
        this.ispicturenews = ispicturenews;
    }

    /**
     * @return SYNSTATE
     */
    public Long getSynstate() {
        return synstate;
    }

    /**
     * @param synstate
     */
    public void setSynstate(Long synstate) {
        this.synstate = synstate;
    }

    /**
     * @return ABSTRACT
     */
    public String getAbstract() {
        return this.Abstract;
    }

    /**
     * @param Abstract
     */
    public void setAbstract(String Abstract) {
        this.Abstract = Abstract;
    }
}