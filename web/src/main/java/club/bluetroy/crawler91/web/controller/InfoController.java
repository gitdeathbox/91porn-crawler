package club.bluetroy.crawler91.web.controller;

import club.bluetroy.crawler.aspect.StatisticsAspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: heyixin
 * Date: 2018-08-17
 * Time: 下午2:38
 */
@RestController
@RequestMapping("/info")
public class InfoController {
    @Autowired
    private StatisticsAspect statisticsAspect;


    @GetMapping
    public void getInfo() throws Exception {
        statisticsAspect.gatherAllMoviesStatistics();
    }
}