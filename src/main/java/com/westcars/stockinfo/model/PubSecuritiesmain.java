package com.westcars.stockinfo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "PUB_SECURITIESMAIN")
public class PubSecuritiesmain {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "SECUCODE")
    private Long secucode;

    @Column(name = "COMCODE")
    private Long comcode;

    @Column(name = "TRADINGCODE")
    private String tradingcode;

    @Column(name = "SECUABBR")
    private String secuabbr;

    @Column(name = "CHINAME")
    private String chiname;

    @Column(name = "CHINAMEABBR")
    private String chinameabbr;

    @Column(name = "CHISPELLING")
    private String chispelling;

    @Column(name = "ENGNAME")
    private String engname;

    @Column(name = "ENGNAMEABBR")
    private String engnameabbr;

    @Column(name = "EXCHANGECODE")
    private Long exchangecode;

    @Column(name = "EXCHANGENAME")
    private String exchangename;

    @Column(name = "SECUCATEGORYCODEI")
    private Long secucategorycodei;

    @Column(name = "SECUCATEGORYCODEII")
    private Long secucategorycodeii;

    @Column(name = "SECUCATEGORY")
    private String secucategory;

    @Column(name = "LISTINGDATE")
    private Date listingdate;

    @Column(name = "DELISTINGDATE")
    private Date delistingdate;

    @Column(name = "BOARDCODE")
    private Long boardcode;

    @Column(name = "BOARDNAME")
    private String boardname;

    @Column(name = "LISTINGSTATECODE")
    private Long listingstatecode;

    @Column(name = "ISIN")
    private String isin;

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

    @Column(name = "COMCODE1")
    private Long comcode1;

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
     * @return SECUCODE
     */
    public Long getSecucode() {
        return secucode;
    }

    /**
     * @param secucode
     */
    public void setSecucode(Long secucode) {
        this.secucode = secucode;
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
     * @return TRADINGCODE
     */
    public String getTradingcode() {
        return tradingcode;
    }

    /**
     * @param tradingcode
     */
    public void setTradingcode(String tradingcode) {
        this.tradingcode = tradingcode;
    }

    /**
     * @return SECUABBR
     */
    public String getSecuabbr() {
        return secuabbr;
    }

    /**
     * @param secuabbr
     */
    public void setSecuabbr(String secuabbr) {
        this.secuabbr = secuabbr;
    }

    /**
     * @return CHINAME
     */
    public String getChiname() {
        return chiname;
    }

    /**
     * @param chiname
     */
    public void setChiname(String chiname) {
        this.chiname = chiname;
    }

    /**
     * @return CHINAMEABBR
     */
    public String getChinameabbr() {
        return chinameabbr;
    }

    /**
     * @param chinameabbr
     */
    public void setChinameabbr(String chinameabbr) {
        this.chinameabbr = chinameabbr;
    }

    /**
     * @return CHISPELLING
     */
    public String getChispelling() {
        return chispelling;
    }

    /**
     * @param chispelling
     */
    public void setChispelling(String chispelling) {
        this.chispelling = chispelling;
    }

    /**
     * @return ENGNAME
     */
    public String getEngname() {
        return engname;
    }

    /**
     * @param engname
     */
    public void setEngname(String engname) {
        this.engname = engname;
    }

    /**
     * @return ENGNAMEABBR
     */
    public String getEngnameabbr() {
        return engnameabbr;
    }

    /**
     * @param engnameabbr
     */
    public void setEngnameabbr(String engnameabbr) {
        this.engnameabbr = engnameabbr;
    }

    /**
     * @return EXCHANGECODE
     */
    public Long getExchangecode() {
        return exchangecode;
    }

    /**
     * @param exchangecode
     */
    public void setExchangecode(Long exchangecode) {
        this.exchangecode = exchangecode;
    }

    /**
     * @return EXCHANGENAME
     */
    public String getExchangename() {
        return exchangename;
    }

    /**
     * @param exchangename
     */
    public void setExchangename(String exchangename) {
        this.exchangename = exchangename;
    }

    /**
     * @return SECUCATEGORYCODEI
     */
    public Long getSecucategorycodei() {
        return secucategorycodei;
    }

    /**
     * @param secucategorycodei
     */
    public void setSecucategorycodei(Long secucategorycodei) {
        this.secucategorycodei = secucategorycodei;
    }

    /**
     * @return SECUCATEGORYCODEII
     */
    public Long getSecucategorycodeii() {
        return secucategorycodeii;
    }

    /**
     * @param secucategorycodeii
     */
    public void setSecucategorycodeii(Long secucategorycodeii) {
        this.secucategorycodeii = secucategorycodeii;
    }

    /**
     * @return SECUCATEGORY
     */
    public String getSecucategory() {
        return secucategory;
    }

    /**
     * @param secucategory
     */
    public void setSecucategory(String secucategory) {
        this.secucategory = secucategory;
    }

    /**
     * @return LISTINGDATE
     */
    public Date getListingdate() {
        return listingdate;
    }

    /**
     * @param listingdate
     */
    public void setListingdate(Date listingdate) {
        this.listingdate = listingdate;
    }

    /**
     * @return DELISTINGDATE
     */
    public Date getDelistingdate() {
        return delistingdate;
    }

    /**
     * @param delistingdate
     */
    public void setDelistingdate(Date delistingdate) {
        this.delistingdate = delistingdate;
    }

    /**
     * @return BOARDCODE
     */
    public Long getBoardcode() {
        return boardcode;
    }

    /**
     * @param boardcode
     */
    public void setBoardcode(Long boardcode) {
        this.boardcode = boardcode;
    }

    /**
     * @return BOARDNAME
     */
    public String getBoardname() {
        return boardname;
    }

    /**
     * @param boardname
     */
    public void setBoardname(String boardname) {
        this.boardname = boardname;
    }

    /**
     * @return LISTINGSTATECODE
     */
    public Long getListingstatecode() {
        return listingstatecode;
    }

    /**
     * @param listingstatecode
     */
    public void setListingstatecode(Long listingstatecode) {
        this.listingstatecode = listingstatecode;
    }

    /**
     * @return ISIN
     */
    public String getIsin() {
        return isin;
    }

    /**
     * @param isin
     */
    public void setIsin(String isin) {
        this.isin = isin;
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
     * @return COMCODE1
     */
    public Long getComcode1() {
        return comcode1;
    }

    /**
     * @param comcode1
     */
    public void setComcode1(Long comcode1) {
        this.comcode1 = comcode1;
    }
}