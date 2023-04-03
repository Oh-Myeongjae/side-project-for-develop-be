package com.h10.sideproject.search.controller;

import com.h10.sideproject.common.ResponseMessage;
import com.h10.sideproject.search.service.SearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class SearchController {

    private final SearchService searchService;

    @GetMapping("/search")
    public ResponseMessage search(@RequestParam(value="words", required = false) String words,
                                  @RequestParam(value="category") String category,
                                  @RequestParam(value = "filter") String filter){
        ResponseMessage responseMessage = searchService.search(words, category, filter);
        return responseMessage;
    }
}
