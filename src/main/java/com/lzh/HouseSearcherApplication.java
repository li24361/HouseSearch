package com.lzh;

import com.lzh.crawl.pipeline.DataBasePipeline;
import com.lzh.crawl.processor.WubaProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import us.codecraft.webmagic.Spider;

@SpringBootApplication
public class HouseSearcherApplication {

	public static void main(String[] args) {
		SpringApplication.run(HouseSearcherApplication.class, args);
        Spider.create(new WubaProcessor()).addPipeline(new DataBasePipeline()).addUrl("http://qd.58.com/zufang").thread(3).start();
	}
}
