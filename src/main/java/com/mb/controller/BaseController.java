package com.mb.controller;

import static com.mb.constants.UrlConstants.BASE_URL;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(BASE_URL)
@CrossOrigin(origins = "*")
public class BaseController {

}
