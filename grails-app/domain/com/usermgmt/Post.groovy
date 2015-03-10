package com.usermgmt

import grails.rest.Resource

@Resource(uri = '/api/posts', formats=['json'])
class Post {

	String post

    static constraints = {
    	post blank: false
    }
}
