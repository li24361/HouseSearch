package com.lzh.crawl.pipeline;

import com.lzh.domain.HouseInfoEntity;
import com.lzh.domain.PicInfoEntity;
import com.lzh.persistence.HouseInfoDao;
import com.lzh.persistence.PicInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.util.List;

/**
 * Created by lizhihao on 2016/1/21.
 */
public class DataBasePipeline implements Pipeline {

    @Autowired
    HouseInfoDao houseInfoDao;

    @Autowired
    PicInfoDao picInfoDao;

    @Override
    public void process(ResultItems resultItems, Task task) {
        HouseInfoEntity houseInfoEntity = resultItems.get("houseInfo");
        houseInfoDao.insertSelective(houseInfoEntity);
        List<String> Pics = resultItems.get("pics");
        PicInfoEntity picInfoEntity = new PicInfoEntity();
        for (String pic : Pics) {
            picInfoEntity.setHouseId(houseInfoEntity.getId());
            picInfoEntity.setPicUrl(pic);
            picInfoDao.insertSelective(picInfoEntity);
        }
    }
}
