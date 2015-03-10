package com.usermgmt

import grails.plugin.springsecurity.annotation.Secured

import grails.converters.JSON
import static org.springframework.http.HttpStatus.*
import static org.springframework.http.HttpMethod.*

// import grails.rest.RestfulController

class ProfileController {

   static responseFormats = ['html','json']

   def springSecurityService

   @Secured(['ROLE_ADMIN'])
   def index() {
      render 'Secure access only'
   }

   @Secured('IS_AUTHENTICATED_ANONYMOUSLY')
   def test(){
   		render 'test'
   }

   @Secured(['ROLE_ADMIN'])
   def restTest() {
		def result = [success:true]
		render text: result as JSON, contentType: 'application/json', status: 200
   }

}
