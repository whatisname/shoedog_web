package com.xxy.shoedog.controller;

import com.xxy.shoedog.entity.Img;
import com.xxy.shoedog.entity.Sneaker;
import com.xxy.shoedog.service.intf.ImgService;
import com.xxy.shoedog.service.intf.SneakerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author X
 * @package com.xxy.shoedog.controller
 * @date 8/18/2018 5:50 AM
 */
@RestController
@Slf4j
@RequestMapping("/sneaker")
public class SneakerController {
    @Autowired
    private SneakerService sneakerService;
    @Autowired
    private ImgService imgService;

    @GetMapping("/detail")
    private ModelAndView SneakerService(
            @RequestParam("sid") String sid,
            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "size", defaultValue = "10") Integer size,
            Map<String, Object> map
    ){
        PageRequest request = PageRequest.of(page, size);
        // get sneaker
        Sneaker sneaker = sneakerService.findById(sid);
        // get img list
        Page<Img> imgPage = imgService.findAllBySneakerId(sid, request);

        map.put("sneaker", sneaker);
        map.put("imgPage", imgPage);

        return new ModelAndView("/", map);


    }
}
