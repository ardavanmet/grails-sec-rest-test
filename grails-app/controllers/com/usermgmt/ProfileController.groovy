package com.usermgmt

import grails.plugin.springsecurity.annotation.Secured

class ProfileController {

   @Secured(['ROLE_ADMIN'])
   def index() {
      render 'Secure access only'
   }
}
