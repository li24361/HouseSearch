package com.lzh.crawl.processor;

import com.google.common.base.Objects;
import com.lzh.domain.HouseInfoEntity;
import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

import java.text.ParseException;
import java.util.Date;

/**
 * Created by lizhihao on 2016/1/19.
 */
public class WubaProcessor implements PageProcessor {


    private Site site = Site.me().setRetryTimes(3).setSleepTime(100);

    private static final Logger LOGGER = LoggerFactory.getLogger(WubaProcessor.class);


    @Override
    public void process(Page page) {
        page.addTargetRequests(page.getHtml().links().regex("http://qd.58.com/zufang/.*shtml\\?.*0").all());
        HouseInfoEntity houseInfoEntity = new HouseInfoEntity();
        houseInfoEntity.setTitle(page.getHtml().xpath("//h1[@class='main-title font-heiti']/text()").toString());
        houseInfoEntity.setType(page.getHtml().xpath("//div[@class='fl house-type c70']/text()").toString());
        houseInfoEntity.setPrice(Integer.valueOf(Objects.firstNonNull(page.getHtml().xpath("//em[@class='house-price']/text()").get(), "0")));
        houseInfoEntity.setPhone(page.getHtml().xpath("//span[@class='tel-num pl30 f30']/text()").toString());
        houseInfoEntity.setUrl(page.getUrl().get());
        String date = Objects.firstNonNull(page.getHtml().xpath("//div[@class='title-right-info cb7 f14 pa']/span/text()").toString(), "更新时间："+(new Date()));
        try {
            houseInfoEntity.setPubtime(DateUtils.parseDate(date.substring(5), "yyyy-MM-dd"));
        } catch (ParseException e) {
            LOGGER.error("日期{}转换错误{}", date.substring(5), e.getMessage());
        }
        if (houseInfoEntity.getTitle() == null) {
            page.setSkip(true);
        } else {
            page.putField("pics", page.getHtml().xpath("//li[@class='house-images-wrap']/img/@lazy_src").all());
            page.putField("houseInfo", houseInfoEntity);
        }
    }

    @Override
    public Site getSite() {
        return site;
    }


}
