package com.example.samplezfwk

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import zfwk.core.base.BaseController
import zfwk.core.ext.loggerFor
import zfwk.zutils.DateUtils

@RestController
@RequestMapping("/sam")
class SamController : BaseController() {

    @GetMapping
    fun yo(): String {
        log.info("good")
        return DateUtils.currentDate()
    }

}
