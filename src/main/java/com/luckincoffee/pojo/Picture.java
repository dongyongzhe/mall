package com.luckincoffee.pojo;

import java.util.List;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/17 13:41
 * @Description: 图片实体类
 */
public class Picture {
    /**
     * 图片ID
     */
    private int id;
    /**
     * 图片对应的商品ID
     */
    private int productId;
    /**
     * 图片类型："show":展示图片;"detail":细节图
     */
    private String type;
    /**
     * 图片所在的地址
     */
    private String url;

    private List<Picture> showPictures;

    public List<Picture> getShowPictures() {
        return showPictures;
    }

    public void setShowPictures(List<Picture> showPictures) {
        this.showPictures = showPictures;
    }

    public List<Picture> getDetailPictures() {
        return detailPictures;
    }

    public void setDetailPictures(List<Picture> detailPictures) {
        this.detailPictures = detailPictures;
    }

    private List<Picture> detailPictures;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
